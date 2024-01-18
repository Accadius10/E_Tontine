package com.koder.etontine.Models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length = 50)
        @NonNull
        private String nom;

        @Column
        @Nonnull
        private String prenom;

        @Column
        @NonNull
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date date_naissance;

        @Column
        @Nonnull
        private String email;

        @Column
        @Nonnull
        private String mot_de_passe;

        @Column
        private Integer NPI;

        @Column
        private String telephone;

        @Column
        private String profession;

        @Column
        private String photoIdentite;

        // Les getters et setters

        // ...
}