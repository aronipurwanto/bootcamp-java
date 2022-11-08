package com.aronsoft.webmvc.controller;

import com.aronsoft.webmvc.model.MahasiswaModel;
import com.aronsoft.webmvc.service.JurusanService;
import com.aronsoft.webmvc.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {
    private MahasiswaService service;
    private JurusanService jurusanService;

    @Autowired
    public MahasiswaController(MahasiswaService service, JurusanService jurusanService) {
        this.service = service;
        this.jurusanService = jurusanService;
    }

    @GetMapping
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("mahasiswa/index.html");
        List<MahasiswaModel> result = service.get();

        String[] array = new String[]{"B$u$i$ld", "$t$$h$e", "N$e$x$t", "E$$ra", "$$o$f$", "S$$of$t$wa$r$e", "De$$ve$l$op$me$n$t"};
        String word = Arrays.asList(array).stream().map(x -> x.replace("$","").toUpperCase(Locale.ROOT))
                .collect(Collectors.joining(" "));
        view.addObject("dataList", result);
        view.addObject("word", word);
        return view;
    }

    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView view = new ModelAndView("mahasiswa/form.html");
        view.addObject("jurusanList", jurusanService.get());
        return view;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute MahasiswaModel request){
        this.service.save(request);
        return new ModelAndView("redirect:/mahasiswa");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") String id){
        MahasiswaModel data = this.service.getById(id);
        if(data == null){
            return new ModelAndView("redirect:/mahasiswa");
        }

        ModelAndView view = new ModelAndView("mahasiswa/edit.html");
        view.addObject("data", data);
        return view;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute MahasiswaModel request){
        this.service.update(request.getId(), request);
        return new ModelAndView("redirect:/mahasiswa");
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable("id") String id){
        MahasiswaModel data = this.service.getById(id);
        if(data == null){
            return new ModelAndView("redirect:/mahasiswa");
        }

        ModelAndView view = new ModelAndView("mahasiswa/detail.html");
        view.addObject("data", data);
        return view;
    }
}
