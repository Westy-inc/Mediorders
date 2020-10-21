package net.nhsbsa.nhs.medorder.web;

import javax.persistence.*;


@Entity
@Table(name = "Medi")
public class medlist {
    @Id @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "Mediname")
    private String Mediname;



    public String medname() {
        return this.Mediname;

    }


    public long getId() {
        return this.id;

    }

    public void setId(final long id) {
        this.id = id;
    }


    public String getMediname() {
        return this.Mediname;
    }

    public void setMediname(final String Mediname) {
        this.Mediname = Mediname;
    }

}

