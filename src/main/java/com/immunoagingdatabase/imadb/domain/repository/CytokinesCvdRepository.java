package com.immunoagingdatabase.imadb.domain.repository;

import com.immunoagingdatabase.imadb.domain.model.CytokinesCovid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CytokinesCvdRepository extends JpaRepository<CytokinesCovid, Integer> {

    @Query(value = "select c from CytokinesCovid c join PatientInformationCvd p" +
            " on c.patientInformationId = p.id where p.classification = ?1")
    List<CytokinesCovid> findCytokinesByPatientGroup(String patientGroup);

}
