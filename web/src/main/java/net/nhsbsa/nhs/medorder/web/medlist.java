package net.nhsbsa.nhs.medorder.web;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
public class medlist {
    @Id
    private long id;
    private String Mediname;

    public medlist(){

    }
public medlist(long id, String mediname){
        super();
        this.id=id;
        this.Mediname=mediname;
}


    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
}


public String getMediname(){
        return Mediname; }

public void setMediname(String Mediname){
        this.Mediname=Mediname;
    }
}
