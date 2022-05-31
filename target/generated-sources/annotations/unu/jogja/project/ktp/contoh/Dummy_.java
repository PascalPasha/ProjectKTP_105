package unu.jogja.project.ktp.contoh;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-30T20:20:09", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Dummy.class)
public class Dummy_ { 

    public static volatile SingularAttribute<Dummy, Integer> id;
    public static volatile SingularAttribute<Dummy, Date> tanggal;
    public static volatile SingularAttribute<Dummy, byte[]> gambar;

}