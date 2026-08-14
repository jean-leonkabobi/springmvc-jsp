package com.groupeisi.webservices.service;

import com.groupeisi.common.dto.Student;
import com.groupeisi.webservices.dto.StudentXml;
import com.groupeisi.webservices.dto.StudentXmlResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

@WebService
public interface StudentWebService {

    @WebMethod(operationName = "getStudent")
    @WebResult(name = "studentResponse")
    @RequestWrapper(localName = "studentRequestGet")
    StudentXmlResponse get(@WebParam(name = "matricule") String matricule);

    @WebMethod(operationName = "saveStudent")
    @WebResult(name = "studentResponse")
    @RequestWrapper(localName = "studentRequestSav")
    StudentXmlResponse save(@WebParam(name = "student") StudentXml student);
}