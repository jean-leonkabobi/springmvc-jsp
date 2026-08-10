package com.groupeisi.webservices.service;

import com.groupeisi.common.dto.Student;
import com.groupeisi.metier.exception.EntityNotFoundException;
import com.groupeisi.metier.service.IStudentService;

import com.groupeisi.webservices.dto.StudentXml;
import com.groupeisi.webservices.dto.StudentXmlResponse;
import com.groupeisi.webservices.mapper.StudentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.Optional;

@WebService(endpointInterface = "com.groupeisi.webservices.service.StudentWebService", name = "StudentWebService")
public class StudentWebServiceImpl implements StudentWebService {

    private final IStudentService studentService;

    public StudentWebServiceImpl() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.groupeisi.metier", "com.groupeisi.repository");
        this.studentService = context.getBean(IStudentService.class);
    }

    @Override
    @WebMethod(operationName = "getStudent")
    @WebResult(name = "studentResponse")
    @XmlElement(required = true)
    public StudentXmlResponse get(@WebParam(name = "matricule") String matricule) {
        return new StudentXmlResponse(StudentMapper.toStudentXml(studentService.get(matricule)));
    }

    @Override
    @WebMethod(operationName = "saveStudent")
    @WebResult(name = "studentResponse")
    @XmlElement(required = true)
    public StudentXmlResponse save(@WebParam(name = "student") StudentXml studentXml) {
        Student student = StudentMapper.toStudent(studentXml);
        return new StudentXmlResponse(StudentMapper.toStudentXml(studentService.save(student)));
    }
}
