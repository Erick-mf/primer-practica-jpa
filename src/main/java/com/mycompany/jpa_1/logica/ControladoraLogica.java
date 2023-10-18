package com.mycompany.jpa_1.logica;

import com.mycompany.jpa_1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearAlumno(Alumno alum) {
        controlPersis.crearAlumno(alum);
    }

    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }

    public void editarAlumno(Alumno alum) {
        controlPersis.editarAlumno(alum);
    }

    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        return controlPersis.traerListaAlumnos();
    }

    // carrera
    public void crearCarrera(Carrera carr) {
        controlPersis.crearCarrera(carr);
    }

    public void eliminarCarrera(int id) {
        controlPersis.eliminarCarrera(id);
    }

    public void editarCarrera(Carrera carr) {
        controlPersis.editarCarrera(carr);
    }

    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        return controlPersis.traerListaCarreras();
    }

    // materia
    public void crearMateria(Materia mater) {
        controlPersis.crearMateria(mater);
    }

    public void eliminarMateria(int id) {
        controlPersis.eliminarMateria(id);
    }

    public void editarMateria(Materia mate) {
        controlPersis.editarMateria(mate);
    }

    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);
    }

    public ArrayList<Materia> traerListaMateria() {
        return controlPersis.traerListaMateria();
    }
}
