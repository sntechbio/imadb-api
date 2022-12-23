package com.immunoagingdatabase.imadb.api.controller;

import com.immunoagingdatabase.imadb.domain.service.AnaliseService;
import com.immunoagingdatabase.imadb.functions.Funcoes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/analises")
public class AnalisesController {

    private final AnaliseService analiseService;

    public AnalisesController(AnaliseService analiseService) {
        this.analiseService = analiseService;
    }

    @PostMapping("/correlacao")
    public List<Map<String, String>> uploadAndAnaliseDeCorrelacao(@RequestParam(value = "file")MultipartFile file) throws IOException {
        InputStreamReader reader = new InputStreamReader(file.getInputStream());
        Object[][] correlacoes = analiseService.calcularCorrelacoes(reader);
        return Funcoes.convertObjectToModel(correlacoes);
    }

}
