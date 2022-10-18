package com.aronsoft.database.service;

import com.aronsoft.database.entity.SiswaEntity;
import com.aronsoft.database.model.SiswaModel;
import com.aronsoft.database.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SiswaServiceImpl implements SiswaService{
    private SiswaRepository repository;

    @Autowired
    public SiswaServiceImpl(SiswaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SiswaModel> getAll() {
        List<SiswaEntity> result = this.repository.findAll();
        if(result.isEmpty()){
            Collections.emptyList();
        }
        return result.stream().map(SiswaModel::new).collect(Collectors.toList());
    }

    @Override
    public SiswaModel getById(String id) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new SiswaModel();
        }
        Optional<SiswaEntity> result = repository.findById(id);
        return result.map(SiswaModel::new).orElseGet(SiswaModel::new);
    }

    @Override
    public SiswaModel save(SiswaModel data) {
        if(data == null) {
            return new SiswaModel();
        }
        SiswaEntity result= new SiswaEntity(data);
        try{
            this.repository.save(result);
            return new SiswaModel(result);
        }catch (Exception e){
            return new SiswaModel();
        }
    }

    @Override
    public SiswaModel update(String id, SiswaModel data) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new SiswaModel();
        }

        // ambil data dari table
        Optional<SiswaEntity> result = repository.findById(id);
        // check data dari result
        if(result.isPresent()){
            SiswaEntity siswaData = result.get();
            // replace data lama dengan dataBaru
            siswaData.setName(data.getName());
            siswaData.setAlamat(data.getAlamat());
            siswaData.setJk(data.getJk());
            // update waktu
            siswaData.setUpdatedAt(LocalDateTime.now());
            siswaData.setUpdatedBy("SYSTEM");

            try{
                this.repository.save(siswaData);
                // jika berhasil
                return new SiswaModel(siswaData);
            }catch (Exception e){
                System.out.println("Error update: "+ e.getMessage());
            }
        }
        return new SiswaModel();
    }

    @Override
    public SiswaModel delete(String id) {
        // check id
        if(id == null || id.isBlank() || id.isEmpty()) {
            return new SiswaModel();
        }

        // ambil data dari table
        Optional<SiswaEntity> result = repository.findById(id);
        // check data dari result
        if(result.isPresent()){
            try{
                SiswaEntity siswaData = result.get();
                this.repository.delete(siswaData);
                // jika delete berhasil
                return new SiswaModel(siswaData);
            }catch (Exception e){
                System.out.println("Error delete: "+ e.getMessage());
            }
        }
        return new SiswaModel();
    }
}
