package com.groupeisi.webservices.service;

import com.groupeisi.common.dto.Student;
import com.groupeisi.metier.exception.EntityNotFoundException;
import com.groupeisi.metier.service.IStudentService;

import com.groupeisi.webservices.dto.StudentXml;
import com.groupeisi.webservices.dto.StudentXmlResponse;
import com.groupeisi.webservices.mapper.StudentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.WebService;

@WebService(endpointInterface = "com.groupeisi.webservices.service.StudentWebService", name = "StudentWebService")
public class StudentWebServiceImpl implements StudentWebService {

    private final IStudentService studentService;

    public StudentWebServiceImpl() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.groupeisi.metier", "com.groupeisi.repository");
        this.studentService = context.getBean(IStudentService.class);
    }

    @Override
    public StudentXmlResponse get(String matricule) {
        return new StudentXmlResponse(StudentMapper.toStudentXml(studentService.get(matricule)));
    }

    @Override
    public StudentXmlResponse save(StudentXml studentXml) {
        Student student = StudentMapper.toStudent(studentXml);
        return new StudentXmlResponse(StudentMapper.toStudentXml(studentService.save(student)));
    }
}