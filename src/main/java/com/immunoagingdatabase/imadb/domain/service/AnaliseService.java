package com.immunoagingdatabase.imadb.domain.service;

import com.immunoagingdatabase.imadb.functions.Funcoes;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class AnaliseService {

    public Object[][] calcularCorrelacoes(InputStreamReader inputStreamReader) throws IOException {
        CSVParser parser = new CSVParser(inputStreamReader, CSVFormat.DEFAULT);
        List<CSVRecord> linhas = parser.getRecords();
        List<String> nomesDasVariaveis = linhas.get(0).toList();
        linhas.remove(0);
        int colunas = linhas.get(0).size();
        double[][] matriz = new double[linhas.size()][colunas];

        for (int i = 0; i < linhas.size(); i++) {
            CSVRecord linha = linhas.get(i);
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = Double.parseDouble(linha.get(j));
            }
        }

        PearsonsCorrelation correlacao = new PearsonsCorrelation();
        double[][] matrizDeCorrelacoes = correlacao.computeCorrelationMatrix(matriz).getData();
        return Funcoes.montarMatrizDeCorrelacoes(matrizDeCorrelacoes, nomesDasVariaveis, nomesDasVariaveis);
    }

}
