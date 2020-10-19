package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Medicontroller {

    @Autowired
    private MedilistService medilist;


    public List<medlist>getAllMeds(){
        return medilist.getAllmeds();

    }


}
