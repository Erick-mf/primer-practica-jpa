package com.mycompany.jpa_1.logica;

import com.mycompany.jpa_1.logica.Materia;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date = "2023-10-16T04:46:30", comments = "EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carrera.class)
public class Carrera_ {

    public static volatile SingularAttribute<Carrera, Integer> id;
    public static volatile ListAttribute<Carrera, Materia> listaMateria;
    public static volatile SingularAttribute<Carrera, String> nombre;

}
