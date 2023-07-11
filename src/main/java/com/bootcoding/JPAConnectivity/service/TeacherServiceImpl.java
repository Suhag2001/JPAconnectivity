package com.bootcoding.JPAConnectivity.service;

import com.bootcoding.JPAConnectivity.entity.Teacher;
import com.bootcoding.JPAConnectivity.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl  {

    @Autowired
    private  TeacherRepo repo ;

    public void insertTeacher(Teacher t1){
        repo.save(t1);
    }

    public void deleteTeacher(int id){
        repo.deleteById(id);
    }

    public List<Teacher> selectTeacher(){
        return  repo.findAll();
    }

    public Optional<Teacher> selectById(int id){
        return repo.findById(id);
    }

    public Teacher updateTeacher(Teacher t1){
        return repo.save(t1);

    }


}
