/**
 * SupportServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.supportservice;

public interface SupportServicePortType extends java.rmi.Remote {
    public ru.devprom.api.soap.service.supportservice.Request raiseIssue(java.lang.String token, ru.devprom.api.soap.service.supportservice.Request issue) throws java.rmi.RemoteException;
    public void attachFile(java.lang.String token, ru.devprom.api.soap.service.supportservice.Request issue, ru.devprom.api.soap.service.supportservice.Attachment file) throws java.rmi.RemoteException;
}
