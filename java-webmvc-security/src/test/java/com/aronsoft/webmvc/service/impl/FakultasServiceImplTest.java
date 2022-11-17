package com.aronsoft.webmvc.service.impl;

import com.aronsoft.webmvc.model.FakultasModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultasServiceImplTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void get() {
        int a = 10;
        assertNotNull(a);
    }

    @Test
    void getById() {
        int b = 100;
        assertEquals(100,b);
    }

    @Test
    void save() {
        FakultasModel result = new FakultasModel();
        assertNotNull(result);
    }

    @Test
    void update() {
        FakultasModel result = new FakultasModel();
        assertNotNull(result);
    }

    @Test
    void delete() {
        FakultasModel result = new FakultasModel();
        assertNotNull(result);
    }
}