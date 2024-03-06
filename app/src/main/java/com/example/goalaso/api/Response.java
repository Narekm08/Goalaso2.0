
package com.example;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("league")
    @Expose
    private com.example.League league;

    public com.example.League getLeague() {
        return league;
    }

    public void setLeague(com.example.League league) {
        this.league = league;
    }

}
