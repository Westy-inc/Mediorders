package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Medicontroller {

    @Autowired
    private MedilistService medilist;

    @RequestMapping("/meds")
    public List<medlist>getAllMeds(){
        return medilist.getAllmeds();

    }
    @RequestMapping("/hi")
    public String hi(){
        return "hi";
    }


}
