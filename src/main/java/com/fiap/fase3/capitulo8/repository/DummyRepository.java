package com.fiap.fase3.capitulo8.repository;

import com.fiap.fase3.capitulo8.model.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
