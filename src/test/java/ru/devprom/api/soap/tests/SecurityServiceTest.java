package ru.devprom.api.soap.tests;

import org.apache.axis.AxisFault;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.devprom.api.soap.service.securityservice.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

import static org.testng.Assert.*;

public class SecurityServiceTest extends SoapBaseTest{
    private SecurityServicePortType securityService;

    @BeforeClass
    public void setup() throws ServiceException{
        securityService = new SecurityServiceLocator().getSecurityServicePort();
    }

    @Test
    public void testAuth() throws RemoteException {
        Token token = securityService.login(username, userpass, project);
        assertNotNull(token.getKey());
        assertNotNull(token.getUrl());
    }
}
