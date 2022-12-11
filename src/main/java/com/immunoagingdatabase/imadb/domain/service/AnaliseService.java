package com.immunoagingdatabase.imadb.domain.service;

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

    public double[][] calcularCorrelacoes(InputStreamReader inputStreamReader) throws IOException {
        CSVParser parser = new CSVParser(inputStreamReader, CSVFormat.DEFAULT);
        List<CSVRecord> linhas = parser.getRecords();
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
        return correlacao.computeCorrelationMatrix(matriz).getData();
    }

    public List<String> coletarNomeDeVariaveis(InputStreamReader inputStreamReader) throws IOException {
        CSVParser parser = new CSVParser(inputStreamReader, CSVFormat.DEFAULT);
        List<CSVRecord> lines = parser.getRecords();
        return lines.get(0).toList();
    }

}
