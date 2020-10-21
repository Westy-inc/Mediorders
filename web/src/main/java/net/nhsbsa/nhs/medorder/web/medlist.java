package net.nhsbsa.nhs.medorder.web;

import javax.persistence.*;


@Entity
@Table(name = "Medi")
public class medlist {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Mediname")
    private String Mediname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMediname() {
        return Mediname;
    }

    public void setMediname(String mediname) {
        this.Mediname = mediname;
    }
}

