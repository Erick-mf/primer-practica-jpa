package com.mycompany.jpa_1.persistencia;

import com.mycompany.jpa_1.logica.Alumno;
import com.mycompany.jpa_1.logica.Carrera;
import com.mycompany.jpa_1.logica.Materia;
import com.mycompany.jpa_1.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AlumnoJpaController alumJpa = new AlumnoJpaController();
    CarreraJpaController carrJpa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();

    public void crearAlumno(Alumno alum) {
        alumJpa.create(alum);
    }

    public void eliminarAlumno(int id) {
        try {
            alumJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alum) {
        try {
            alumJpa.edit(alum);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alumJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> lista = alumJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>(lista);

        return listaAlumnos;
    }

    public void crearCarrera(Carrera carr) {
        carrJpa.create(carr);
    }

    public void eliminarCarrera(int id) {
        try {
            carrJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carr) {
        try {
            carrJpa.edit(carr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carrJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista = carrJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<>(lista);

        return listaCarreras;
    }

    public void crearMateria(Materia mater) {
        mateJpa.create(mater);
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public ArrayList<Materia> traerListaMateria() {
        List<Materia> lista = mateJpa.findMateriaEntities();
        ArrayList<Materia> listaMaterias = new ArrayList<>(lista);

        return listaMaterias;
    }
}
