package com.iucosoft.maven.model;

import java.sql.Date;

/**
 *
 * @author Viorel
 */
public class Users {
    
    private int id;
    private String nume;
    private String prenume;
    private Date dataNasterii;

    public Users() {
    }

    public Users(String nume, String prenume, Date dataNasterii) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
    }

    public Users(int id, String nume, String prenume, Date dataNasterii) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
    }

    public Date getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", dataNasterii=" + dataNasterii + '}';
    }
    
}
