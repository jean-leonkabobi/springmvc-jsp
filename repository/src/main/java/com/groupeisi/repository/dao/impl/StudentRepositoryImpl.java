package com.groupeisi.repository.dao.impl;

import com.groupeisi.repository.dao.IStudentRepository;
import com.groupeisi.repository.entity.StudentEntity;

public class StudentRepositoryImpl implements IStudentRepository {

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        return new StudentEntity(studentEntity.getNom(), studentEntity.getPrenom(), studentEntity.getMatricule(), studentEntity.getNumeroTelephone());
    }

    @Override
    public StudentEntity get(String matricule) {
        return new StudentEntity(null, null, matricule, null);
    }
}
