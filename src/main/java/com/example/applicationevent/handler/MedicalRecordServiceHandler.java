package com.example.applicationevent.handler;

import com.example.applicationevent.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordServiceHandler {

    @EventListener
    @Async
    public void updateMedicalBill(PatientDischargeEvent event) {
        System.out.println(event.getName() + "Medical Bill Updated"+Thread.currentThread().getName());
    }
}