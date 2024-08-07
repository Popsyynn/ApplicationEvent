package com.example.applicationevent.dto;

public class PatientDischargeRequest {

    private int id;
    private String name;

    public PatientDischargeRequest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PatientDischargeRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PatientDischargeRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
