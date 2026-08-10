package com.groupeisi.webservices.dto;

import com.groupeisi.common.dto.Student;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentXmlResponse", propOrder = { "student" })
@XmlRootElement(name = "studentXmlResponse")
public class StudentXmlResponse {

    @XmlElement(name = "student", required = true) // ICI : Force minOccurs="1" dans le WSDL/XSD
    private StudentXml student;

    // Constructeurs
    public StudentXmlResponse() {}

    public StudentXmlResponse(StudentXml student) {
        this.student = student;
    }

    // Getter et Setter
    public StudentXml getStudent() { return student; }
    public void setStudent(StudentXml student) { this.student = student; }
}
