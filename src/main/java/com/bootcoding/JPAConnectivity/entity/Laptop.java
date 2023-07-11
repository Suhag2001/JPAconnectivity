package com.bootcoding.JPAConnectivity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Teacher_Laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lappyid;
    private String lappybrand;
    private String lappyname;

//    @OneToOne
//    private  Teacher teacher;
}
