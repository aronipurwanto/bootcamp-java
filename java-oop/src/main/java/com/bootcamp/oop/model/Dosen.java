package com.bootcamp.oop.model;

public class Dosen extends Orang{
    private String title;
    private String nip;

    public Dosen() {
    }

    public Dosen(int nik, String nama, String jk, String title, String nip) {
        super(nik, nama, jk);
        this.title = title;
        this.nip = nip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
