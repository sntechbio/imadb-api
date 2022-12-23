package com.immunoagingdatabase.imadb.functions;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        for (int i = 0; i < rowNames.size() - 1; i++) {
            matrix[i+1][0] = rowNames.get(i);
        }
        for (int j = 0; j < colNames.size() - 1; j++) {
            matrix[0][j+1] = colNames.get(j);
        }
        return matrix;
    }

    public static Object[][] montarMatrizDeCorrelacoes(double[][] matrix, List<String> rowNames, List<String> colNames) {
        Object[][] objMatrix = convertMatrixToObject(matrix);
        return addNamesToMatrix(objMatrix, rowNames, colNames);
    }

    public static List<Map<String, String>> convertObjectToModel(Object[][] objectArray) {
        DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormatSymbols symbols = df.getDecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(symbols);

        List<Map<String, String>> result = new ArrayList<>();
        for (int i = 1; i < objectArray.length; i++) {
            for (int j = 1; j < objectArray[i].length; j++) {
                Map<String, String> map = new HashMap<>();
                map.put("a", (String)objectArray[i][0]);
                map.put("b", (String)objectArray[0][j]);
                map.put("value", String.valueOf(df.format((Double)objectArray[i][j])));
                result.add(map);
            }
        }
        return result;
    }

}
