package com.fiap.fase3.capitulo8.service;

import com.fiap.fase3.capitulo8.model.Dummy;
import com.fiap.fase3.capitulo8.repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyService {
    @Autowired
    private DummyRepository dummyRepository;

    public Dummy saveDummy(String content) {
        Dummy dummy = new Dummy(content);
        return dummyRepository.save(dummy);
    }
}
