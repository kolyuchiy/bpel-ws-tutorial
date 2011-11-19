/**
 * CalculatorSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package ru.pp.kolia.calculator;

public class CalculatorSOAPSkeleton implements ru.pp.kolia.calculator.Calculator, org.apache.axis.wsdl.Skeleton {
    private ru.pp.kolia.calculator.Calculator impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "distance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("calculatePrice", _params, new javax.xml.namespace.QName("", "price"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://kolia.pp.ru/calculator/", "calculatePrice"));
        _oper.setSoapAction("http://kolia.pp.ru/calculator/NewOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("calculatePrice") == null) {
            _myOperations.put("calculatePrice", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("calculatePrice")).add(_oper);
    }

    public CalculatorSOAPSkeleton() {
        this.impl = new ru.pp.kolia.calculator.CalculatorSOAPImpl();
    }

    public CalculatorSOAPSkeleton(ru.pp.kolia.calculator.Calculator impl) {
        this.impl = impl;
    }
    public double calculatePrice(double distance) throws java.rmi.RemoteException
    {
        double ret = impl.calculatePrice(distance);
        return ret;
    }

}
