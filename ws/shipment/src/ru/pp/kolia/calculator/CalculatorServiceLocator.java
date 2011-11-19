/**
 * CalculatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package ru.pp.kolia.calculator;

public class CalculatorServiceLocator extends org.apache.axis.client.Service implements ru.pp.kolia.calculator.CalculatorService {

    public CalculatorServiceLocator() {
    }


    public CalculatorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculatorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for calculatorSOAP
    private java.lang.String calculatorSOAP_address = "http://localhost:8080/shipment/services/calculatorSOAP";

    public java.lang.String getcalculatorSOAPAddress() {
        return calculatorSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String calculatorSOAPWSDDServiceName = "calculatorSOAP";

    public java.lang.String getcalculatorSOAPWSDDServiceName() {
        return calculatorSOAPWSDDServiceName;
    }

    public void setcalculatorSOAPWSDDServiceName(java.lang.String name) {
        calculatorSOAPWSDDServiceName = name;
    }

    public ru.pp.kolia.calculator.Calculator getcalculatorSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(calculatorSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcalculatorSOAP(endpoint);
    }

    public ru.pp.kolia.calculator.Calculator getcalculatorSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.pp.kolia.calculator.CalculatorSOAPStub _stub = new ru.pp.kolia.calculator.CalculatorSOAPStub(portAddress, this);
            _stub.setPortName(getcalculatorSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcalculatorSOAPEndpointAddress(java.lang.String address) {
        calculatorSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ru.pp.kolia.calculator.Calculator.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.pp.kolia.calculator.CalculatorSOAPStub _stub = new ru.pp.kolia.calculator.CalculatorSOAPStub(new java.net.URL(calculatorSOAP_address), this);
                _stub.setPortName(getcalculatorSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("calculatorSOAP".equals(inputPortName)) {
            return getcalculatorSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://kolia.pp.ru/calculator/", "CalculatorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://kolia.pp.ru/calculator/", "calculatorSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("calculatorSOAP".equals(portName)) {
            setcalculatorSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
