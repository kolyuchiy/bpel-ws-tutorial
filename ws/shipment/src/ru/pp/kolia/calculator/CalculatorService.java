/**
 * CalculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package ru.pp.kolia.calculator;

public interface CalculatorService extends javax.xml.rpc.Service {
    public java.lang.String getcalculatorSOAPAddress();

    public ru.pp.kolia.calculator.Calculator getcalculatorSOAP() throws javax.xml.rpc.ServiceException;

    public ru.pp.kolia.calculator.Calculator getcalculatorSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
