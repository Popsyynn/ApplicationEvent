package com.example.applicationevent.handler;

import com.example.applicationevent.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HouseKeepingServiceHandler {

    @EventListener
    @Async
    public void cleanAndAssign(PatientDischargeEvent event) {
        System.out.println("Clean and assign" + event.getId()+Thread.currentThread().getName());
    }
}
