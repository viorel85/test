package com.iucosoft.maven.model;

public class Rezervari {

       
	private int id;
	private String nume;
	private String prenume;
	private String genul;
	private String[] limbajul;
	private String orasul;
	private String localitatea;
        
	public Rezervari(){		
	}

    public Rezervari(String prenume, String genul, String[] limbajul, String orasul, String localitatea) {
        this.prenume = prenume;
        this.genul = genul;
        this.limbajul = limbajul;
        this.orasul = orasul;
        this.localitatea = localitatea;
    }

    public Rezervari(String nume, String prenume, String genul, String[] limbajul, String orasul, String localitatea) {
        this.nume = nume;
        this.prenume = prenume;
        this.genul = genul;
        this.limbajul = limbajul;
        this.orasul = orasul;
        this.localitatea = localitatea;
    }

    public Rezervari(int id, String nume, String prenume, String genul, String[] limbajul, String orasul, String localitatea) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.genul = genul;
        this.limbajul = limbajul;
        this.orasul = orasul;
        this.localitatea = localitatea;
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

    public String getGenul() {
        return genul;
    }

    public void setGenul(String genul) {
        this.genul = genul;
    }

    public String[] getLimbajul() {
        return limbajul;
    }

    public void setLimbajul(String[] limbajul) {
        this.limbajul = limbajul;
    }

    public String getOrasul() {
        return orasul;
    }

    public void setOrasul(String orasul) {
        this.orasul = orasul;
    }

    public String getLocalitatea() {
        return localitatea;
    }

    public void setLocalitatea(String localitatea) {
        this.localitatea = localitatea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", genul=" + genul + ", limbajul=" + limbajul + ", orasul=" + orasul + ", localitatea=" + localitatea + '}';
    }
    
        
}