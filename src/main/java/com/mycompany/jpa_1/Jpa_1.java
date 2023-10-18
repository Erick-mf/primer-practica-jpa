package com.mycompany.jpa_1;

import com.mycompany.jpa_1.logica.Alumno;
import com.mycompany.jpa_1.logica.Carrera;
import com.mycompany.jpa_1.logica.ControladoraLogica;
import com.mycompany.jpa_1.logica.Materia;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Jpa_1 {

    public static void main(String[] args) {
        ControladoraLogica control = new ControladoraLogica();

        //  Formatea la fecha actual al formato "dd-MM-yy"
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String strDate = formatter.format(new Date());
// debido a que materia necesita tener una carrera para asociar las materias si no, es null
        LinkedList<Materia> listaMaterias = new LinkedList<>();

        Carrera carr = new Carrera(1, "Matematicas", listaMaterias);
        control.crearCarrera(carr);

        Materia mate = new Materia(1, "calculo", "trimestre", carr);
        Materia mate2 = new Materia(2, "trigonometria", "trimestre", carr);
        Materia mate3 = new Materia(3, "fisica", "trimestre", carr);
        control.crearMateria(mate);
        control.crearMateria(mate2);
        control.crearMateria(mate3);

        listaMaterias.add(mate);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);

        // ahora le agrego el contenido a la lista antes creada de materias
        carr.setListaMateria(listaMaterias);
        control.editarCarrera(carr);

        Alumno alum = new Alumno(1, "victor", "mendez", strDate, carr);
        control.crearAlumno(alum);

        Alumno aux = control.traerAlumno(1);
        System.out.println(aux.toString());

    }
}
