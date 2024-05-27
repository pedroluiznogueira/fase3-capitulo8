package com.fiap.fase3.capitulo8.controller;

import com.fiap.fase3.capitulo8.controller.dto.WasteCollectionDTO;
import com.fiap.fase3.capitulo8.model.WasteCollection;
import com.fiap.fase3.capitulo8.service.WasteCollectionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/waste-collections")
public class WasteCollectionController {

    private final WasteCollectionService service;

    public WasteCollectionController(WasteCollectionService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid WasteCollectionDTO dto) {
        WasteCollection wasteCollection = new WasteCollection();
        wasteCollection.setLocation(dto.getLocation());
        wasteCollection.setType(dto.getType());
        return ResponseEntity.ok(service.save(wasteCollection));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody WasteCollection wasteCollection) {
        return service.findById(id)
                .map(existing -> {
                    existing.setLocation(wasteCollection.getLocation());
                    existing.setType(wasteCollection.getType());
                    return ResponseEntity.ok(service.save(existing));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
