package com.aronsoft.webmvc.model;

import com.aronsoft.webmvc.entity.FakultasEntity;
import com.aronsoft.webmvc.entity.JurusanEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FakultasModel {
    private String id;
    private String code;
    private String name;
    private String alamat;
    private List<JurusanModel> jurusans;

    public FakultasModel() {
    }

    public FakultasModel(String code, String name, String alamat) {
        this.code = code;
        this.name = name;
        this.alamat = alamat;
    }

    public FakultasModel(FakultasEntity entity) {
        BeanUtils.copyProperties(entity, this);
        if(entity.getJurusans() != null || !entity.getJurusans().isEmpty()){
            jurusans = new ArrayList<>();
            for(JurusanEntity jrs : entity.getJurusans()){
                jurusans.add(new JurusanModel(jrs));
            }
        }
    }
}
