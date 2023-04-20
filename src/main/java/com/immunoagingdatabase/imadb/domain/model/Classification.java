package com.immunoagingdatabase.imadb.domain.model;

public enum Classification {

    SINDROME_GRIPAL("Síndrome Gripal"),
    LEVE("Leve"),
    INTERNADO("Internado");

    private final String label;

    Classification(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
