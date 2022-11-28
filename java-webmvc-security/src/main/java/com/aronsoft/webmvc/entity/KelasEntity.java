package com.aronsoft.webmvc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "kelas_tab")
public class KelasEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "kode")
    private String kode;

    @Column(name = "hari")
    private String namaHari;

    @Column(name = "jam_mulai")
    private Date jamMulai;

    @Column(name = "jam_selesai")
    private Date jamSelesai;

    @Column(name = "ruang_id")
    private String ruangId;

    @Column(name = "matakuliah_id")
    private String matakuliahId;

    @Column(name = "dosen_id")
    private String dosenId;

    @Column(name = "status")
    private String status;

    @Column(name = "tahun_ajaran")
    private Integer tahunAjaran;

    @Column(name = "semester")
    private String semester;

    @Column(name = "quota")
    private Integer quota;

    @Column(name = "bisa_online")
    private Boolean bisaOnline;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;
}
