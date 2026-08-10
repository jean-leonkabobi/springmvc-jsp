package com.groupeisi.webservices.mapper;

import com.groupeisi.common.dto.Student;
import com.groupeisi.webservices.dto.StudentXml;

public interface StudentMapper {
    static StudentXml toStudentXml(Student student){
        StudentXml studentXml = new StudentXml();
        studentXml.setMatricule(student.getMatricule());
        studentXml.setNom(student.getNom());
        studentXml.setPrenom(student.getPrenom());
        studentXml.setNumeroTelephone(student.getNumeroTelephone());

        return studentXml;
    }

    static Student toStudent(StudentXml studentXml){
        Student student = new Student();
        student.setMatricule(studentXml.getMatricule());
        student.setNom(studentXml.getNom());
        student.setPrenom(studentXml.getPrenom());
        student.setNumeroTelephone(studentXml.getNumeroTelephone());

        return student;
    }
}
