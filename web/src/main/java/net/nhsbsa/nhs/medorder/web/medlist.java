package net.nhsbsa.nhs.medorder.web;

import javax.persistence.Entity;
import javax.persistence.Id;

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
public long getId(){
        return id;
}
    public void setId(final long id){
        this.id=id;
}
public String getMediname(){
        return Mediname; }

public String setMediname(final String Mediname){
        return  this.Mediname; }

    }

