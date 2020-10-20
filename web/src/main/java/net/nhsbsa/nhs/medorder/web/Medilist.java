package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@Service
public class Medilist {
    @Autowired
    private Medlistrepo medilistrepo;

    //@RequestMapping("/")
    public List<medlist> getAllMeds(){
        List<medlist> medi = new ArrayList<>();
        medilistrepo.findAll()
        .forEach(medi::add);
        return medi;
    }

   // @RequestMapping("/")
    public List<medlist> addMeds(medlist mediname){
        List<medlist> medi = new ArrayList<>();
        medilistrepo.save(mediname);
        return medi;
    }

}
