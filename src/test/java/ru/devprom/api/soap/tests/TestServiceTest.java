package ru.devprom.api.soap.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.devprom.api.soap.service.securityservice.SecurityServiceLocator;
import ru.devprom.api.soap.service.securityservice.SecurityServicePortType;
import ru.devprom.api.soap.service.testservice.TestServiceLocator;
import ru.devprom.api.soap.service.testservice.TestServicePortType;
import ru.devprom.api.soap.service.testservice.Testscenario;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import static org.testng.Assert.assertEquals;

public class TestServiceTest extends SoapBaseTest {
    private TestServicePortType testService;
    private String token;

    @BeforeClass
    public void setup() throws ServiceException, RemoteException {
        testService = new TestServiceLocator().getTestServicePort();
        SecurityServicePortType securityService = new SecurityServiceLocator().getSecurityServicePort();
        token = securityService.login(username, userpass, project).getKey();
    }

    @Test
    public void test() throws RemoteException {
        Testscenario testscenario = new Testscenario();
        testscenario.setId(483);
        testscenario.setParentPath("");
        testscenario.setSectionNumber("");
        testscenario.setUID("");
        testscenario.setCaption("");
        testscenario.setReferenceName("");
        testscenario.setContent("");
        testscenario.setUserField1("");
        testscenario.setUserField2("");
        testscenario.setUserField3("");
        testscenario.setIsDraft("");
        testscenario.setIsArchived("");
        testscenario.setContentEditor("");
        testscenario.setState("");
        testscenario.setDependency("");
        testscenario.setDataHash("");
        testscenario.setVersionName("");
        testscenario.setClassName("");
        testscenario.setUrl("");
        testscenario.setRecordCreated(new GregorianCalendar());
        testscenario.setRecordModified(new GregorianCalendar());

        Testscenario find = testService.find(token, testscenario);

        assertEquals(find.getCaption(), "Soap Test Scenario");
    }
}