package com.bootcoding.JPAConnectivity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Teacher_Laptop")
public class Laptop {

    @Id
    @GeneratedValue
    private int lappyid;
    private String lappybrand;
    private String lappyname;

//    @OneToOne
//    private  Teacher teacher;
}
