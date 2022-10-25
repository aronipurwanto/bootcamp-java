package com.aronsoft.database.model;

import com.aronsoft.database.entity.FakultasEntity;
import com.aronsoft.database.entity.JurusanEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class JurusanModel {
    private String id;
    private String code;
    private String name;
    private String fakultasId;
    private FakultasModel fakultas;

    public JurusanModel() {
    }

    public JurusanModel(JurusanEntity entity) {
        BeanUtils.copyProperties(entity, this);
        if(entity.getFakultas() != null) {
            fakultasId = entity.getFakultas().getId();
            fakultas = new FakultasModel(entity.getFakultas());
        }
    }
}
