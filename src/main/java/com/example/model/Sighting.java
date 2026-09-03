package com.example.model;

public class Sighting {


    private Integer id;
    private String SightingCode;
    private String Name;
    private String Description;
    private String ScientificName;
    private String SightedAt;
    private String Location;
    private Integer Quantity;
    private Integer ConfidenceLevel;
    private Integer ExpeditionId;


    public Sighting () {
    }

    public Sighting (Integer id, String SightingCode, String Name, String description,
                     String ScientificName, String SightedAt, String Location, Integer Quantity, Integer ConfidenceLevel, Integer ExpeditionId ) {
       this.id = id;
       this.SightingCode= SightingCode;
       this.Name = Name;
       this.Description = description;
       this.ScientificName = ScientificName;
       this.SightedAt = SightedAt;
       this.Location = Location;
       this.Quantity = Quantity;
       this.ConfidenceLevel = ConfidenceLevel;
       this.ExpeditionId = ExpeditionId;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public void setScientificName(String scientificName) {
        ScientificName = scientificName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSightingCode() {
        return SightingCode;
    }

    public void setSightingCode(String sightingCode) {
        SightingCode = sightingCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSightedAt() {
        return SightedAt;
    }

    public void setSightedAt(String sightedAt) {
        SightedAt = sightedAt;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Integer getConfidenceLevel() {
        return ConfidenceLevel;
    }

    public void setConfidenceLevel(Integer confidenceLevel) {
        ConfidenceLevel = confidenceLevel;
    }

    public Integer getExpeditionId() {
        return ExpeditionId;
    }

    public void setExpeditionId(Integer expeditionId) {
        ExpeditionId = expeditionId;
    }

}
