package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@Service
public class MedilistService {
    @Autowired
    private Medlistrepo medlisrepo;


    public List<medlist> getAllmeds() {
            List<medlist> medi = new ArrayList<>();
            medlisrepo.findAll()
                    .forEach(medi :: add);
            return medi;
        }
        @PostMapping("/med")
    public void addMeds(@RequestBody medlist mediname){
        medlisrepo.save(mediname);
    }

}
