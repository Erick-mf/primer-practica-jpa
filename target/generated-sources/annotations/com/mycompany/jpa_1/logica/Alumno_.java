package com.mycompany.jpa_1.logica;

import com.mycompany.jpa_1.logica.Carrera;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date = "2023-10-16T04:46:30", comments = "EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Alumno.class)
public class Alumno_ {

    public static volatile SingularAttribute<Alumno, String> fechaNac;
    public static volatile SingularAttribute<Alumno, String> apellldio;
    public static volatile SingularAttribute<Alumno, Integer> id;
    public static volatile SingularAttribute<Alumno, Carrera> carrera;
    public static volatile SingularAttribute<Alumno, String> nombre;

}
