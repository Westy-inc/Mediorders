package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Medilist {
    @Autowired
    private Medlistrepo medilistrepo;

    public List<medlist> getAllMeds(){
        List<medlist> medi = new ArrayList<>();
        medilistrepo.findAll()
        .forEach(medi::add);
        return medi;
    }

    public List<medlist> addMeds(medlist mediname){
        List<medlist> medi = new ArrayList<>();
        medilistrepo.save(mediname);
        return medi;
    }

}
