package com.immunoagingdatabase.imadb.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
public class CytokinesCovid {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @OneToOne
    @JoinColumn(name = "patient_information_id", referencedColumnName = "id")
    private PatientInformationCvd patientInformationId;

    @Column(name = "FGFbasic")
    private Double fgfBasic;

    @Column(name = "GCSF")
    private Double gCsf;

    @Column(name = "GMCSF")
    private Double gmCsf;

    @Column(name = "PDGF")
    private Double pdgf;

    @Column(name = "VEGF")
    private Double vegf;

    @Column(name = "IL1beta")
    private Double il1Beta;

    @Column(name = "IL6")
    private Double il6;

    @Column(name = "IL12p70")
    private Double il12p70;

    @Column(name = "IFNgamma")
    private Double ifnGamma;

    @Column(name = "TNFalpha")
    private Double tnfAlpha;

    @Column(name = "CCL2")
    private Double ccl2;

    @Column(name = "CCL3")
    private Double ccl3;

    @Column(name = "CCL4")
    private Double ccl4;

    @Column(name = "CCL5")
    private Double ccl5;

    @Column(name = "Eotaxin")
    private Double eotaxin;

    @Column(name = "IL4")
    private Double il4;

    @Column(name = "IL5")
    private Double il5;

    @Column(name = "IL13")
    private Double il13;

    @Column(name = "IL2")
    private Double il2;

    @Column(name = "IL10")
    private Double il10;

    @Column(name = "CXCL10")
    private Double cxcl10;

    @Column(name = "CXCL8")
    private Double cxcl8;

    @Column(name = "IL1ra")
    private Double il1Ra;

    @Column(name = "IL7")
    private Double il7;

    @Column(name = "IL9")
    private Double il9;

    @Column(name = "IL15")
    private Double il15;

    @Column(name = "IL17")
    private Double il17;

    @Column(name = "DIS")
    private Integer dis;

    public CytokinesCovid() {
    }
}
