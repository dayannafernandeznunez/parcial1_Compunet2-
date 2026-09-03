package com.example.model;

public class Expedition {

    private Integer id;
    private String Name;
    private String Code;
    private String Region;
    private String BaseCamp;
    private String Leader;
    private String StartDate;
    private String EndDate;
    private Integer Estate;

    public Expedition () {
    }

    public Expedition(Integer id, String name, String code, String region, String baseCamp, String leader, String startDate, String endDate, Integer estate) {
        this.id = id;
        Name = name;
        Code = code;
        Region = region;
        BaseCamp = baseCamp;
        Leader = leader;
        StartDate = startDate;
        EndDate = endDate;
        Estate = estate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getBaseCamp() {
        return BaseCamp;
    }

    public void setBaseCamp(String baseCamp) {
        BaseCamp = baseCamp;
    }

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public Integer getEstate() {
        return Estate;
    }

    public void setEstate(Integer estate) {
        Estate = estate;
    }
}