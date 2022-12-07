package com.aronsoft.webmvc.model;

import com.aronsoft.webmvc.entity.FakultasEntity;
import com.aronsoft.webmvc.entity.GedungEntity;
import com.aronsoft.webmvc.entity.JurusanEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GedungModel {
    private String id;
    @NotBlank
    @NotEmpty
    private String code;

    @NotBlank
    @NotEmpty
    private String name;

    @NotBlank
    @NotEmpty
    private Integer jmlLantai;

    public GedungModel() {
    }

    public GedungModel(String code, String name, Integer jmlLantai) {
        this.code = code;
        this.name = name;
        this.jmlLantai = jmlLantai;
    }

    public GedungModel(GedungEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
