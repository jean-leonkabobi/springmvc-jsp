package com.groupeisi.repository.dao;

import com.groupeisi.repository.entity.StudentEntity;

public interface IStudentRepository {
    StudentEntity save(StudentEntity studentEntity);
    StudentEntity get(String matricule);
}
