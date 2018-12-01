package com.study.demo1.domain.po;

import lombok.Data;
import lombok.extern.java.Log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Log
public class accountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotBlank
    String name;

    @NotBlank
    String masterName;


}
