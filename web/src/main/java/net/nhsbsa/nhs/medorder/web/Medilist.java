package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
<<<<<<< Updated upstream
public class Medilist {
=======
public class Medilist{
>>>>>>> Stashed changes
    @Autowired
    private Medlistrepo medlisrepo;

<<<<<<< Updated upstream
    public List<medlist> getAllMeds(){
        List<medlist> medi = new ArrayList<>();
        medilistrepo.findAll()
=======
    public List<medlist> getAllmeds(){
        List<medlist> medi = new ArrayList<>();
        medlisrepo.findAll()
>>>>>>> Stashed changes
        .forEach(medi::add);
        return medi;
    }

    public List<medlist> addMeds(medlist mediname){
        List<medlist> medi = new ArrayList<>();
        medilistrepo.save(mediname);
        return medi;
    }

}
