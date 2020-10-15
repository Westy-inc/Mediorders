package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Medilist {
    @Autowired
    private Medlistrepo medlisrepo;

    public List<medlist> getAllmeds(){
        List<medlist> medi = new ArrayList<>();
        medlisrepo.findAll()
        .forEach(medi::add);
        return medi;
    }

    public void addMeds(medlist mediname){
        //List<medlist> medi = new ArrayList<>();
        medlisrepo.save(mediname);
        //return medi;
    }

}
