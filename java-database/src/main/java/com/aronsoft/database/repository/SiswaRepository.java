package com.aronsoft.database.repository;

import com.aronsoft.database.entity.SiswaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiswaRepository extends JpaRepository<SiswaEntity, String> {
}
