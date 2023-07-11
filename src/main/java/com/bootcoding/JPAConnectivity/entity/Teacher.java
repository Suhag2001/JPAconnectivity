package com.bootcoding.JPAConnectivity.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.nio.MappedByteBuffer;

@Data
@Entity
@Table(name="Teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name ;
    private String email;
    private String city;

    //cascade help to save the data of laptop using teacher api means its help to store the data of child by using parent
//    @OneToOne(mappedBy = "teacher"+,cascade = CascadeType.ALL)
//    private Laptop laptop;

}
