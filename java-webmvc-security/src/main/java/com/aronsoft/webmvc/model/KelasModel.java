package com.aronsoft.webmvc.model;

import com.aronsoft.webmvc.entity.KelasEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KelasModel {
    private String id;
    private String kode;
    private String namaHari;
    private Date jamMulai;
    private Date jamSelesai;
    private String ruangId;
    private String matakuliahId;
    private String dosenId;
    private String status;
    private Integer tahunAjaran;
    private String semester;
    private Integer quota;
    private Boolean bisaOnline;

    public KelasModel(KelasEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
