package com.bootcoding.JPAConnectivity.repo;

import com.bootcoding.JPAConnectivity.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
