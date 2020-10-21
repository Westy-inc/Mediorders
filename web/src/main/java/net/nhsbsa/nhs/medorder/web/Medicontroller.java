package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;
import java.util.List;
@Controller
@RestController
public class Medicontroller {

    @Autowired
    private MedilistService medilist;


    @ModelAttribute("medlist")
    public List<medlist>getAllMeds(){
        return medilist.getAllmeds();

    }


}
