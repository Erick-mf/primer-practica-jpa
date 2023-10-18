package com.mycompany.jpa_1.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// @Entity para especificar que sera una tabla
@Entity
@Table(name = "tbl_alumno")
public class Alumno implements Serializable {

    // @Id para el id de la tabla y @GeneratedValue para generar el id, casi siempre estan juntos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic //  no es obligatorio esta etiqueta
    private String nombre;
    private String apellldio;
    private String fechaNac;
    // @Temporal(TemporalType.DATE) no se guardaba como yo queria en sqlite, por eso la comente
    // private Date fechaNac;
    @OneToOne
    private Carrera carrera;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellldio, String fechaNac, Carrera carrera) {
        this.id = id;
        this.nombre = nombre;
        this.apellldio = apellldio;
        this.fechaNac = fechaNac;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellldio() {
        return apellldio;
    }

    public void setApellldio(String apellldio) {
        this.apellldio = apellldio;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellldio=" + apellldio + ", fechaNac=" + fechaNac + ", carrera=" + carrera + '}';
    }

}
