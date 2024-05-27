package com.fiap.fase3.capitulo8.controller;

import com.fiap.fase3.capitulo8.model.Dummy;
import com.fiap.fase3.capitulo8.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dummies")
public class DummyController {
    @Autowired
    private DummyService dummyService;

    @PostMapping
    public ResponseEntity<Dummy> createDummy(@RequestBody String content) {
        Dummy dummy = dummyService.saveDummy(content);
        return ResponseEntity.ok(dummy);
    }
}
