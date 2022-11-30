package com.aronsoft.webmvc.repository;

import com.aronsoft.webmvc.entity.KelasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface KelasRepo extends JpaRepository<KelasEntity, String> {
    @Query("select t from KelasEntity t where t.ruangId= :ruangId and t.jamMulai >= :jamMulai and t.jamSelesai <= :jamSelesai")
    List<KelasEntity> checkCase01(@Param("ruangId") String ruangId,
                                  @Param("jamMulai")Date jamMulai,
                                  @Param("jamSelesai") Date jamSelesai);
}
