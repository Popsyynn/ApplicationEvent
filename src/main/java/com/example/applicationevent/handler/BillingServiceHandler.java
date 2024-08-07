package com.example.applicationevent.handler;

import com.example.applicationevent.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    @EventListener
    @Async
    public void processBill(PatientDischargeEvent event) {
        System.out.println(event.getName() + " bill is being processed"+Thread.currentThread().getName() );
    }
}
