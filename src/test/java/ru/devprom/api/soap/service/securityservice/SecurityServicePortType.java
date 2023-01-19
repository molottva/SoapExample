/**
 * SecurityServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.securityservice;

public interface SecurityServicePortType extends java.rmi.Remote {

    /**
     * Returns token to access other services
     */
    public ru.devprom.api.soap.service.securityservice.Token login(java.lang.String username, java.lang.String userpass, java.lang.String project) throws java.rmi.RemoteException;
}
