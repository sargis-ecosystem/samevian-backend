package com.samevian.controller;

import com.samevian.model.Organ;
import com.samevian.service.OrganService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/organ")
@CrossOrigin
public class OrganController {
    private final OrganService service;
    public OrganController(OrganService service) { this.service = service; }
    
    @GetMapping("/list")
    public List<Organ> list() { return service.getAll(); }
    
    @GetMapping("/level/{level}")
    public List<Organ> byLevel(@PathVariable String level) { return service.getByLevel(level); }
}