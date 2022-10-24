package com.aronsoft.database.service;

import com.aronsoft.database.entity.FakultasEntity;
import com.aronsoft.database.model.FakultasModel;
import com.aronsoft.database.repository.FakultasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FakultasServiceImpl implements FakultasService{
    private FakultasRepo repo;

    @Autowired
    public FakultasServiceImpl(FakultasRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<FakultasModel> get() {
        return this.repo.findAll().stream().map(FakultasModel::new).collect(Collectors.toList());
    }

    @Override
    public FakultasModel getById(String id) {
        return this.repo.findById(id).map(FakultasModel::new).orElse(new FakultasModel());
    }

    @Override
    public Optional<FakultasModel> save(FakultasModel request) {
        if(request == null) {
            return Optional.empty();
        }

        FakultasEntity result = new FakultasEntity(request);
        try{
            this.repo.save(result);
            return Optional.of(new FakultasModel(result));
        }catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<FakultasModel> update(String id, FakultasModel request) {
        return Optional.empty();
    }

    @Override
    public Optional<FakultasModel> delete(String id) {
        return Optional.empty();
    }
}
