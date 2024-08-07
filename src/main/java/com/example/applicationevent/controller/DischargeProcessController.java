package com.example.applicationevent.controller;

import com.example.applicationevent.dto.PatientDischargeRequest;
import com.example.applicationevent.service.PatientDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "discharge/api")
@EnableAsync
public class DischargeProcessController {

    @Autowired
    PatientDischargeService dischargeService;

    @RequestMapping(method = RequestMethod.POST , value = "/process")
    public String discharge(@RequestBody PatientDischargeRequest dischargeRequest){
        return dischargeService.dischargePatient(dischargeRequest.getId() , dischargeRequest.getName());
    }
}
