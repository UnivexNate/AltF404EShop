package com.example.catalogue.model;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data  // Lombok pour les getters/setters/toString
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private double prix;
    private int stock;
    private String imageUrl;  // URL d’une image produit (optionnel)
}