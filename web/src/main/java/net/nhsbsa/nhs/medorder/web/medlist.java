package net.nhsbsa.nhs.medorder.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class medlist {
    @Id
    private String id;
    private String Mediname;

    public medlist(){

    }
public medlist(String id, String mediname){
        super();
        this.id=id;
        this.Mediname=mediname;
}
public String getId(){
        return id;
}
public void setId(String id){
        this.id=id;
}
public String getMediname(){
        return Mediname; }

public void setMediname(String Mediname){
        this.Mediname=Mediname;
    }
}
