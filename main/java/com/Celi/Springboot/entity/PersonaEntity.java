
package com.Celi.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PersonaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagenes;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String titulo;
    private String anio;
    // aqui tratando de probar un git con 2 palabras pero con espacio
    // cuarto intento con acento GRAVE

    public PersonaEntity() {
    }

    public PersonaEntity(Long id, String imagenes, String nombre, String apellido, String descripcion, String titulo, String anio) {
        this.id = id;
        this.imagenes = imagenes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.anio = anio;
    }
     
}
