package pl.jedrzejczak.cpudatabaseapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonProperty("brandName")
    private String brandname;


    //=================
    //Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandname;
    }

    public void setBrandName(String brandName) {
        this.brandname = brandName;
    }
}


