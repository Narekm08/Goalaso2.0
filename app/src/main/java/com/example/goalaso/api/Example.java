
package com.example;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("get")
    @Expose
    private String get;
    @SerializedName("parameters")
    @Expose
    private com.example.Parameters parameters;
    @SerializedName("errors")
    @Expose
    private List<Object> errors;
    @SerializedName("results")
    @Expose
    private Integer results;
    @SerializedName("paging")
    @Expose
    private com.example.Paging paging;
    @SerializedName("response")
    @Expose
    private List<com.example.Response> response;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public com.example.Parameters getParameters() {
        return parameters;
    }

    public void setParameters(com.example.Parameters parameters) {
        this.parameters = parameters;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public com.example.Paging getPaging() {
        return paging;
    }

    public void setPaging(com.example.Paging paging) {
        this.paging = paging;
    }

    public List<com.example.Response> getResponse() {
        return response;
    }

    public void setResponse(List<com.example.Response> response) {
        this.response = response;
    }

}
