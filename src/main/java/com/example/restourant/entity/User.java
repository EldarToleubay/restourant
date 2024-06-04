package com.example.restourant.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "user_table")
public class User {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "job_name")
    private String jobName;


    @OneToMany(mappedBy="user")
    @JsonIgnore
    private List<Car> carList;

}
