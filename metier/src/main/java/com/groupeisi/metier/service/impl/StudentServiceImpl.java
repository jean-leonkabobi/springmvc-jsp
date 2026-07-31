package com.groupeisi.metier.service.impl;

import com.groupeisi.common.dto.Student;
import com.groupeisi.metier.service.IStudentService;
import com.groupeisi.metier.service.mapper.StudentMapper;
import com.groupeisi.repository.dao.IStudentRepository;
import com.groupeisi.repository.dao.impl.StudentRepositoryImpl;
import com.groupeisi.repository.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        //StudentEntity studentEntity = StudentMapper.toStudentEntity(student);
        //studentEntity = studentRepository.save(studentEntity);
        //return StudentMapper.toStudentDto(studentEntity);

        return StudentMapper.toStudentDto(studentRepository.save(StudentMapper.toStudentEntity(student)));
    }

    @Override
    public Student get(String matricule) {
        StudentEntity studentEntity = studentRepository.get(matricule);
        if(studentEntity == null){
            //log.error
            throw new RuntimeException("Aucune donnée trouver pour ce matricule");
        }
        return StudentMapper.toStudentDto(studentEntity);
    }
}
