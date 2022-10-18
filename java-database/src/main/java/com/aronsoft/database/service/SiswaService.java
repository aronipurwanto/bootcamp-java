package com.aronsoft.database.service;

import com.aronsoft.database.model.SiswaModel;

import java.util.List;

public interface SiswaService {
    public List<SiswaModel> getAll();
    public SiswaModel getById(String id);
    public SiswaModel save(SiswaModel data);
    public SiswaModel update(String id, SiswaModel data);
    public SiswaModel delete(String id);
}
