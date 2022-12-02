package com.aronsoft.webmvc.service.impl;

import com.aronsoft.webmvc.entity.KelasEntity;
import com.aronsoft.webmvc.repository.KelasRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class KelasServiceImplTest {
    @Autowired
    @InjectMocks
    private KelasServiceImpl service;

    @Mock
    private KelasRepo repo;

    private static List<KelasEntity> kelasList;
    private static String ruangId;
    private static String dosenId;
    private static String mkId;

    @BeforeEach
    void setUp() {
        ruangId = UUID.randomUUID().toString();
        dosenId = UUID.randomUUID().toString();
        mkId = UUID.randomUUID().toString();
        kelasList = Arrays.asList(
              new KelasEntity("K001","SENIN","08:00:00","09:45:00",ruangId,mkId,dosenId),
              new KelasEntity("K002","SENIN","10:00:00","11:45:00",ruangId,mkId,dosenId),
              new KelasEntity("K003","SENIN","13:00:00","14:45:00",ruangId,mkId,dosenId),
              new KelasEntity("K004","SENIN","15:00:00","16:45:00",ruangId,mkId,dosenId)
        );
    }

    @Test
    void getAll() {
    }

    @Test
    void getAllModel() {
    }

    @Test
    void getById() {
    }

    @Test
    void save() {
    }
}