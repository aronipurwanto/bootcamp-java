package com.aronsoft.database.model;

import com.aronsoft.database.entity.SiswaEntity;

public class SiswaModel {
    private String id;
    private String name;
    private String jk;
    private String alamat;

    public SiswaModel() {
    }

    public SiswaModel(SiswaEntity data) {
        this.id = data.getId();
        this.name = data.getName();
        this.jk = data.getJk();
        this.alamat = data.getAlamat();
    }

    public SiswaModel(String id, String name, String jk, String alamat) {
        this.id = id;
        this.name = name;
        this.jk = jk;
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
