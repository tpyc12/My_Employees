package com.example.myemployees.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Speciality {

    @SerializedName("specialty_id")
    @Expose
    private int specialityId;
    @SerializedName("name")
    @Expose
    private String name;

    public int getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(int specialityId) {
        this.specialityId = specialityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
