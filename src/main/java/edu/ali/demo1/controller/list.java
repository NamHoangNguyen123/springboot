package edu.ali.demo1.controller;

import edu.ali.demo1.models.SinhVien;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Demo/")
public class list<sinhVien> {
    @GetMapping("")
    public String demo(){
        return "demo";
    }
    @GetMapping("1")
    public  String ali(){
        return "helo";
    }

    @PostMapping("create")
    public SinhVien insert(@RequestBody SinhVien sinhVien) {

            return sinhVien;
    }

}
