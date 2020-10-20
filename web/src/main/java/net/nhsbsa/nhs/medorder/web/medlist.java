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
<<<<<<< Updated upstream
public void setId(String id){
=======
    public void setId(final long id){
>>>>>>> Stashed changes
        this.id=id;
}
public String getMediname(){
<<<<<<< Updated upstream
        return Mediname; }

public void setMediname(String Mediname){
=======
        return  this.Mediname; }
        public void setMediname(final String Mediname){
>>>>>>> Stashed changes
        this.Mediname=Mediname;
    }
}
