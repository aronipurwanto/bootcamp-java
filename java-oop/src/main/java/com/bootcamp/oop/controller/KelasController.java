package com.bootcamp.oop.controller;

import com.bootcamp.oop.model.Dosen;
import com.bootcamp.oop.model.Kelas;
import com.bootcamp.oop.model.Mahasiswa;
import com.bootcamp.oop.model.Matakuliah;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KelasController {
    @GetMapping("/kelas")
    private ResponseEntity<Object> get(){
        List<Kelas> result = new ArrayList<>();

        Dosen dosen = new Dosen(4321,"ROni","Pria","S.Kom","D-4321");

        List<Mahasiswa> mahasiswaList = Arrays.asList(
                new Mahasiswa(123,"Siti","Wanita","TI-123","TI",2022),
                new Mahasiswa(124,"Ahmad","Pria","TI-122","TI",2022),
                new Mahasiswa(125,"Abdul","Pria","TI-122","TI",2022),
                new Mahasiswa(125,"Rina","Wanita","TI-122","TI",2022)
        );

        // kelas 1
        Matakuliah matakuliah = new Matakuliah("MK-001","Pemrograman Java",3);
        Kelas kelas1 = new Kelas("K-001", matakuliah, dosen, "Senin","19.00 - 21.00", mahasiswaList);
        result.add(kelas1);

        // kelas 2
        Matakuliah matakuliah2 = new Matakuliah("MK-002","Pemrograman Database",3);
        Kelas kelas2 = new Kelas("K-002", matakuliah2, dosen, "Selasa","19.00 - 21.00", mahasiswaList);
        result.add(kelas2);

        return ResponseEntity.ok()
                .body(result);
    }
}
