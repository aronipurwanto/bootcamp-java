package com.aronsoft.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "siswa_tab")
public class SiswaEntity {
    @Id
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "nama_siswa", length = 120)
    private String name;
    @Column(name = "jk", length = 10)
    private String jk;
    @Column(name = "alamat", length = 200)
    private String alamat;
}
