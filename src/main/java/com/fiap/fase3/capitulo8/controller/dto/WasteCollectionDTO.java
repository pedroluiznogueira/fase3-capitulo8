package com.fiap.fase3.capitulo8.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class WasteCollectionDTO {

    @NotBlank(message = "Location must not be empty")
    @Size(max = 255, message = "Location must not exceed 255 characters")
    private String location;

    @NotBlank(message = "Type must not be empty")
    @Size(max = 100, message = "Type must not exceed 100 characters")
    private String type;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
