package com.groupeisi.metier.service.mapper;

import com.groupeisi.common.dto.Student;
import com.groupeisi.repository.entity.StudentEntity;

public interface StudentMapper {
    static StudentEntity toStudentEntity(Student student){
        return new StudentEntity(student.getNom(), student.getPrenom(), student.getMatricule(), student.getNumeroTelephone());
    }
    static Student toStudentDto(StudentEntity studentEntity){
        return new Student(studentEntity.getNom(), studentEntity.getPrenom(), studentEntity.getMatricule(), studentEntity.getNumeroTelephone());
    }
}
