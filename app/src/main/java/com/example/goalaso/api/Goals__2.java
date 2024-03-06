
package com.example;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goals__2 {

    @SerializedName("for")
    @Expose
    private Integer _for;
    @SerializedName("against")
    @Expose
    private Integer against;

    public Integer getFor() {
        return _for;
    }

    public void setFor(Integer _for) {
        this._for = _for;
    }

    public Integer getAgainst() {
        return against;
    }

    public void setAgainst(Integer against) {
        this.against = against;
    }

}
