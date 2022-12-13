package com.immunoagingdatabase.imadb.functions;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Funcoes {

    public static Object[][] convertMatrixToObject(double[][] matrix) {
        Object[][] objMatrix = new Object[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                objMatrix[row][col] = matrix[row][col];
            }
        }
        return objMatrix;
    }

    public static Object[][] addNamesToMatrix(Object[][] matrix, List<String> rowNames, List<String> colNames) {
        matrix[0][0] = "";
        for (int i = 0; i < rowNames.size(); i++) {
            matrix[i+1][0] = rowNames.get(i);
        }
        for (int j = 0; j < colNames.size(); j++) {
            matrix[0][j+1] = colNames.get(j);
        }
        return matrix;
    }

    public static Object[][] montarMatrizDeCorrelacoes(double[][] matrix, List<String> rowNames, List<String> colNames) {
        Object[][] objMatrix = convertMatrixToObject(matrix);
        return addNamesToMatrix(objMatrix, rowNames, colNames);
    }

}
