
package com.example;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Away {

    @SerializedName("played")
    @Expose
    private Integer played;
    @SerializedName("win")
    @Expose
    private Integer win;
    @SerializedName("draw")
    @Expose
    private Integer draw;
    @SerializedName("lose")
    @Expose
    private Integer lose;
    @SerializedName("goals")
    @Expose
    private com.example.Goals__2 goals;

    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getLose() {
        return lose;
    }

    public void setLose(Integer lose) {
        this.lose = lose;
    }

    public com.example.Goals__2 getGoals() {
        return goals;
    }

    public void setGoals(com.example.Goals__2 goals) {
        this.goals = goals;
    }

}
