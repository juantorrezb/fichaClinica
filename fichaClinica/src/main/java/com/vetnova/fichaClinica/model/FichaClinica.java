package com.vetnova.fichaClinica.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class FichaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String historial;
    
    @Column(length = 200, nullable = false)
    private String diagnostico;

    @Column(length = 200, nullable = false)
    private String tratamiento;

    @Column(length = 200, nullable = false)
    private String fecha;
}
