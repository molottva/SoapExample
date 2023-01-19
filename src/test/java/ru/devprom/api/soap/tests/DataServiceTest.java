package ru.devprom.api.soap.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.devprom.api.soap.service.dataservice.*;
import ru.devprom.api.soap.service.securityservice.SecurityServiceLocator;
import ru.devprom.api.soap.service.securityservice.SecurityServicePortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

import static org.testng.Assert.assertTrue;

public class DataServiceTest extends SoapBaseTest{
    private DataServicePortType dataService;
    private String token;

    @BeforeClass
    public void setup() throws ServiceException, RemoteException {
        dataService = new DataServiceLocator().getDataServicePort();
        SecurityServicePortType securityService = new SecurityServiceLocator().getSecurityServicePort();
        token = securityService.login(username, userpass, project).getKey();
    }

    @Test
    public void test() throws RemoteException {
        Requirement[] requirements = dataService.requirementRemoteGetAll(token);

        assertTrue(requirements.length > 0);
    }
}
