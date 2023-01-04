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
    @JoinColumn(name = "idPatientInformation")
    private PatientInformationCvd patientInformationId;

    @Column(name = "FGF-basic")
    private Double fgfBasic;

    @Column(name = "G-CSF")
    private Double gCsf;

    @Column(name = "GM-CSF")
    private Double gmCsf;

    @Column(name = "PDGF")
    private Double pdgf;

    @Column(name = "VEGF")
    private Double vegf;

    @Column(name = "IL-1-beta")
    private Double il1Beta;

    @Column(name = "IL-6")
    private Double il6;

    @Column(name = "IL-12p70")
    private Double il12p70;

    @Column(name = "IFN-gamma")
    private Double ifnGamma;

    @Column(name = "TNF-alpha")
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

    @Column(name = "IL-4")
    private Double il4;

    @Column(name = "IL-5")
    private Double il5;

    @Column(name = "IL-13")
    private Double il13;

    @Column(name = "IL-2")
    private Double il2;

    @Column(name = "IL-10")
    private Double il10;

    @Column(name = "CXCL-10")
    private Double cxcl10;

    @Column(name = "CXCL-8")
    private Double cxcl8;

    @Column(name = "IL-1ra")
    private Double il1Ra;

    @Column(name = "IL-7")
    private Double il7;

    @Column(name = "IL-9")
    private Double il9;

    @Column(name = "IL-15")
    private Double il15;

    @Column(name = "IL-17")
    private Double il17;

    @Column(name = "DIS")
    private Integer dis;

    public CytokinesCovid() {
    }
}
