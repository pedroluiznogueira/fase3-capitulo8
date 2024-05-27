package com.fiap.fase3.capitulo8.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "waste_collection")
@Data
public class WasteCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String type;
}