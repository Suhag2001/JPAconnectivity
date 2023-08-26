package com.bootcoding.JPAConnectivity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Teacher")
public class Teacher {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String email;
    private String password;

    //cascade help to save the data of laptop using teacher api means its help to store the data of child by using parent
//    @OneToOne(mappedBy = "teacher"+,cascade = CascadeType.ALL)
//    private Laptop laptop;
}
