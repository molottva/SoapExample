package ru.devprom.api.soap.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.devprom.api.soap.service.securityservice.SecurityServiceLocator;
import ru.devprom.api.soap.service.securityservice.SecurityServicePortType;
import ru.devprom.api.soap.service.supportservice.Request;
import ru.devprom.api.soap.service.supportservice.SupportServiceLocator;
import ru.devprom.api.soap.service.supportservice.SupportServicePortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.testng.Assert.assertEquals;

public class SupportServiceTest extends SoapBaseTest {
    private SupportServicePortType supportService;
    private String token;

    @BeforeClass
    public void setup() throws ServiceException, RemoteException {
        supportService = new SupportServiceLocator().getSupportServicePort();
        SecurityServicePortType securityService = new SecurityServiceLocator().getSecurityServicePort();
        token = securityService.login(username, userpass, project).getKey();
    }

    @Test
    public void test() throws RemoteException {
        Request request = new Request();
        request.setDescription("Описание реквеста");
        request.setPriority(2);
        request.setCaption("Название реквеста");
        request.setState("");
        request.setStartDate(new Date());
        request.setFinishDate(new GregorianCalendar());
        request.setDeliveryDate(new Date());
        request.setEstimatedStartDate(new GregorianCalendar());
        request.setEstimatedFinishDate(new GregorianCalendar());
        request.setRecordCreated(new GregorianCalendar());
        request.setRecordModified(new GregorianCalendar());
        request.setRecentComment("");
        request.setExternalId("");
        request.setClassName("");
        request.setUrl("");

        Request responce = supportService.raiseIssue(token, request);

        assertEquals(responce.getDescription(), request.getDescription());
        assertEquals(responce.getCaption(), request.getCaption());
        assertEquals(responce.getPriority(), request.getPriority());
    }
}