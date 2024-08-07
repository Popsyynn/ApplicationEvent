package com.example.applicationevent.handler;

import com.example.applicationevent.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceHandler {

    @EventListener
    @Async
    public void notifyPatient(PatientDischargeEvent event){
        System.out.println("Notification Service is working"+Thread.currentThread().getName());
    }
}
