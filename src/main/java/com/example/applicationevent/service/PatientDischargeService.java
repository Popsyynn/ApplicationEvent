package com.example.applicationevent.service;


import com.example.applicationevent.event.PatientDischargeEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class PatientDischargeService {

    private static final Logger log = LoggerFactory.getLogger(PatientDischargeService.class);
   /* @Autowired
    BillingServiceHandler billingServiceHandler;

    @Autowired
    HouseKeepingServiceHandler houseKeepingServiceHandler;

    @Autowired
    MedicalRecordServiceHandler medicalRecordServiceHandler;

    @Autowired
    NotificationServiceHandler notificationServiceHandler;*/

    @Autowired
    ApplicationEventPublisher eventPublisher;


    public String dischargePatient(int id , String name){
        log.info("Patient discharge started{}", name);
      /*  billingServiceHandler.processBill();
        houseKeepingServiceHandler.cleanAndAssign();
        medicalRecordServiceHandler.updateMedicalBill();
        notificationServiceHandler.notifyPatient();*/

        //publish an event
        eventPublisher.publishEvent(new PatientDischargeEvent(this,id,name));
        return "Patient discharge completed : " + id + ":" + name;


    }
}
