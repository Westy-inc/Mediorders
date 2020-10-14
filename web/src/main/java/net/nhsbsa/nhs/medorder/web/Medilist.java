package net.nhsbsa.nhs.medorder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
    @Autowired
    private Medlistrepo medilistrepo;

    public List<WebApplication> getAllmeds(){
        List<WebApplication> medi = new ArrayList<>();
        medilistrepo.findAll()
        .forEach(medi::add);
        return medi;
    }

}
