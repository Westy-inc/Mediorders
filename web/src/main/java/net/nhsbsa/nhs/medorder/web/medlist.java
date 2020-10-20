package net.nhsbsa.nhs.medorder.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class medlist {
    @Id
    private long id;
    private String Mediname;

    public medlist() {

    }

    public String medname() {
        return this.Mediname;

    }

    public long medid() {
        return this.id;
    }

    public long getId() {
        return this.id;

    }

    public void setId(long id) {
        this.id = id;
    }


    public String getMediname() {
        return this.Mediname;
    }

    public void setMediname(String Mediname) {
        this.Mediname = Mediname;
    }
}

