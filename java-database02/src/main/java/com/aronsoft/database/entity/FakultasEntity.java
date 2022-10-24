package com.aronsoft.database.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "fakultas_tab")
public class FakultasEntity {
    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "kode_fakultas", length = 20, unique = true)
    private String code;

    @Column(name = "nama_fakultas", length = 225)
    private String name;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

    @OneToMany(mappedBy = "fakultas", fetch = FetchType.EAGER)
    private Set<JurusanEntity> jurusans;
}
