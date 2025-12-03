package com.example.SERVICE_CAR.models;

import com.example.SERVICE_CAR.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder  // Permet d'utiliser le pattern Builder pour créer des instances
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricule;
    private Client client;  // Objet client complet, pas juste l'ID
}