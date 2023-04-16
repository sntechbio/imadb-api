package com.immunoagingdatabase.imadb.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PatientInformationCvd {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer age;
    private String sex;
    private String profession;
    private String schooling;
    private String address;
    private String income;
    private String maritalStatus;
    private Double imc;
    private String classification;
    private String vaccination;

}
