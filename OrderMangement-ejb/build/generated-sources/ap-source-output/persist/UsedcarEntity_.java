package persist;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-03T18:10:22")
@StaticMetamodel(UsedcarEntity.class)
public class UsedcarEntity_ extends CarEntity_ {

    public static volatile SingularAttribute<UsedcarEntity, String> regNo;
    public static volatile SingularAttribute<UsedcarEntity, String> odometer;
    public static volatile SingularAttribute<UsedcarEntity, String> regExpiry;
    public static volatile SingularAttribute<UsedcarEntity, String> vin;
    public static volatile SingularAttribute<UsedcarEntity, String> servHistory;

}