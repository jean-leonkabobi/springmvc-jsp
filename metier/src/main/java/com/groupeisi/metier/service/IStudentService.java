package com.groupeisi.metier.service;

import com.groupeisi.common.dto.Student;

public interface IStudentService {
    Student save(Student student);
    Student get(String matricule);
}
