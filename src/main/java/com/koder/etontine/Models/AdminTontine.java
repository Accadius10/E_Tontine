package com.koder.etontine.Models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import io.micrometer.common.lang.NonNull;
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
@Table(name = "admin_tontine")
public class AdminTontine {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @NonNull
        private Long id;

        @Column(length = 50)
        private String nom;

        @Column
        private String prenom;

        @Column
        @NonNull
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date date_naissance;

        @Column
        private String email;

        @Column
        private String mot_de_passe;

        // Les getters et setters

        // ...
}
