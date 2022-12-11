package com.immunoagingdatabase.imadb.api.controller;

import com.immunoagingdatabase.imadb.domain.service.AnaliseService;
import com.immunoagingdatabase.imadb.functions.Funcoes;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@RestController
@RequestMapping("/api/analises")
public class AnalisesController {

    private final AnaliseService analiseService;

    public AnalisesController(AnaliseService analiseService) {
        this.analiseService = analiseService;
    }

    @PostMapping("/correlacao")
    public Object[][] uploadAndAnaliseDeCorrelacao(@RequestParam(value = "file")MultipartFile file) throws IOException {
        InputStreamReader reader = new InputStreamReader(file.getInputStream());
        double[][] corr = analiseService.calcularCorrelacoes(reader);
        List<String> namesVariables = analiseService.coletarNomeDeVariaveis(reader);
        return Funcoes.montarMatrizDeCorrelacoes(corr, namesVariables, namesVariables);
    }

}
