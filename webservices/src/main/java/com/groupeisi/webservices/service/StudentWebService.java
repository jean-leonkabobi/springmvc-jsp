package com.groupeisi.webservices.service;

import com.groupeisi.common.dto.Student;
import com.groupeisi.webservices.dto.StudentXml;
import com.groupeisi.webservices.dto.StudentXmlResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface StudentWebService {

    @WebMethod(operationName = "getStudent")
    StudentXmlResponse get(@WebParam(name = "matricule") String matricule);

    @WebMethod(operationName = "saveStudent")
    StudentXmlResponse save(@WebParam(name = "student") StudentXml student);
}
