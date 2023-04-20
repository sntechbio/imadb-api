package com.immunoagingdatabase.imadb.api.controller;

import com.immunoagingdatabase.imadb.domain.model.Classification;
import com.immunoagingdatabase.imadb.domain.model.CytokinesCovid;
import com.immunoagingdatabase.imadb.domain.repository.CytokinesCvdRepository;
import com.immunoagingdatabase.imadb.domain.service.AnaliseService;
import com.immunoagingdatabase.imadb.functions.Funcoes;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/analises")
public class AnalisesController {

    private final AnaliseService analiseService;

    private final CytokinesCvdRepository cytokinesCvdRepository;

    public AnalisesController(AnaliseService analiseService, CytokinesCvdRepository cytokinesCvdRepository) {
        this.analiseService = analiseService;
        this.cytokinesCvdRepository = cytokinesCvdRepository;
    }

    @PostMapping("/correlacao")
    public List<Map<String, String>> uploadAndAnaliseDeCorrelacao(@RequestParam(value = "file")MultipartFile file) throws IOException {
        InputStreamReader reader = new InputStreamReader(file.getInputStream());
        Object[][] correlacoes = analiseService.calcularCorrelacoes(reader);
        return Funcoes.convertObjectToModel(correlacoes);
    }

    @GetMapping("/search-cytokines-by-classification")
    public List<CytokinesCovid> buscarCitocinasPorGrupo(@RequestParam(value = "classification") Classification classification) {
        List<CytokinesCovid> citocinasFilter = cytokinesCvdRepository.findCytokinesByPatientGroup(classification.getLabel());
        return citocinasFilter;
    }
}
