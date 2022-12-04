package com.example.testRTelekomTest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class SuperEntity {

    @Id
    @Column(name = "id")
    private String id;
}
