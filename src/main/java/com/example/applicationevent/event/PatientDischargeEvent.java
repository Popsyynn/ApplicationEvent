package com.example.applicationevent.event;

import org.springframework.context.ApplicationEvent;

public class PatientDischargeEvent extends ApplicationEvent {

    private int id;
    private String name;

    public PatientDischargeEvent(Object source, int id , String name) {
        super(source);
        this.id = id;
        this.name = name;
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
}
