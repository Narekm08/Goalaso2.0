package com.example.goalaso;

import java.util.ArrayList;

public class Standings {
    private String get;
    Parameters ParametersObject;
    ArrayList < Object > errors = new ArrayList< Object >();
    private float results;
    Paging PagingObject;
    ArrayList < Object > response = new ArrayList < Object > ();


    // Getter Methods

    public String getGet() {
        return get;
    }

    public Parameters getParameters() {
        return ParametersObject;
    }

    public float getResults() {
        return results;
    }

    public Paging getPaging() {
        return PagingObject;
    }

    // Setter Methods

    public void setGet(String get) {
        this.get = get;
    }

    public void setParameters(Parameters parametersObject) {
        this.ParametersObject = parametersObject;
    }

    public void setResults(float results) {
        this.results = results;
    }

    public void setPaging(Paging pagingObject) {
        this.PagingObject = pagingObject;
    }
}