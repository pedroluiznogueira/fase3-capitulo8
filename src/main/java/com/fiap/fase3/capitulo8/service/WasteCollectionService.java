package com.fiap.fase3.capitulo8.service;

import com.fiap.fase3.capitulo8.model.WasteCollection;
import com.fiap.fase3.capitulo8.repository.WasteCollectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCollectionService {

    private final WasteCollectionRepository repository;

    public WasteCollectionService(WasteCollectionRepository repository) {
        this.repository = repository;
    }

    public WasteCollection save(WasteCollection wasteCollection) {
        return repository.save(wasteCollection);
    }

    public Optional<WasteCollection> findById(Long id) {
        return repository.findById(id);
    }

    public List<WasteCollection> findAll() {
        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}