
package com.example;


import com.example.goalaso.api.All;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standing {

    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("team")
    @Expose
    private com.example.Team team;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("goalsDiff")
    @Expose
    private Integer goalsDiff;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("form")
    @Expose
    private String form;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("all")
    @Expose
    private All all;
    @SerializedName("home")
    @Expose
    private com.example.Home home;
    @SerializedName("away")
    @Expose
    private com.example.Away away;
    @SerializedName("update")
    @Expose
    private String update;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public com.example.Team getTeam() {
        return team;
    }

    public void setTeam(com.example.Team team) {
        this.team = team;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGoalsDiff() {
        return goalsDiff;
    }

    public void setGoalsDiff(Integer goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public All getAll() {
        return all;
    }

    public void setAll(All all) {
        this.all = all;
    }

    public com.example.Home getHome() {
        return home;
    }

    public void setHome(com.example.Home home) {
        this.home = home;
    }

    public com.example.Away getAway() {
        return away;
    }

    public void setAway(com.example.Away away) {
        this.away = away;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

}
