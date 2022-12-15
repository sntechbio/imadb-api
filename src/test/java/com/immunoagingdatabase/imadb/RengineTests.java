package com.immunoagingdatabase.imadb;

import com.immunoagingdatabase.imadb.functions.Funcoes;
import org.junit.jupiter.api.Test;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RConnection;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
public class RengineTests {

    @Test
    public void rengineTeste() throws REngineException {

//        RConnection connection = new RConnection();
//        double[][] matriz = gerarMatriz();
//
//        connection.assign("matrix", String.valueOf(matriz));
//        connection.eval("library(corrplot)");
//        connection.eval("cor <- cor(matriz)");
//        connection.eval("corrplot(cor)");

    }

    public double[][] gerarMatriz() {
        // tamanho da matriz
        int tamanhoMatriz = 5;

        // criar a matriz
        double[][] matriz = new double[tamanhoMatriz][tamanhoMatriz];

        // gerar números aleatórios
        Random gerador = new Random();

        // preencher a matriz
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = gerador.nextDouble();
            }
        }

        // imprimir a matriz
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        return matriz;
    }
}

