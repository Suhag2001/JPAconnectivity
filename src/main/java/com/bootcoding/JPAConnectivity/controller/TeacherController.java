package com.bootcoding.JPAConnectivity.controller;

import com.bootcoding.JPAConnectivity.entity.Teacher;
import com.bootcoding.JPAConnectivity.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//@CrossOrigin(origins = "http://localhost:63342")

@CrossOrigin(origins = "*")
@RestController
public class TeacherController {
    @Autowired
    private TeacherServiceImpl service ;

    @RequestMapping(value = "/signup" ,method = RequestMethod.GET)
    public String signup(){
        System.out.println("inside signup handler");
        return "/signup";
    }

    @GetMapping("/findByEmail/{email}")
    public Teacher getByEmail(@PathVariable String email){
        return  service.getByEmail(email);
    }

    @PostMapping("/insertTeacher")
    public void insertTeacher(@RequestBody Teacher t1){
           service.insertTeacher(t1);
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public void deleteTeacher(@PathVariable int id){
        service.deleteTeacher(id);
    }

    @GetMapping("selectTeacher")
    public List<Teacher> selectTeacher(){
        return service.selectTeacher();
    }

    @GetMapping("selectById/{id}")
    public Optional<Teacher> slectById(@PathVariable int id){
        return service.selectById(id);
    }

    @PutMapping("updateTeacher/{id}")
    public Teacher updateTeacher(@RequestBody Teacher t1){
        return service.updateTeacher(t1);
    }
}
