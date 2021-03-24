package top.leeti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.leeti.service.HospitalSetService;

@RestController
@RequestMapping("/admin/hosp/hospital")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;



}
