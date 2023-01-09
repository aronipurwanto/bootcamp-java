package com.ahmadroni.javalogic.controller;

import com.ahmadroni.javalogic.service.Logic01;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/logic01")
@RequiredArgsConstructor
public class Logic01Controller {
    private final Logic01 logic01;
    @GetMapping("/soal01/{param}")
    public ResponseEntity<Object> soal01(@PathVariable("param") String param){
        return ResponseEntity.ok().body(logic01.soal01(param));
    }
}
