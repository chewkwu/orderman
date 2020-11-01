package persist;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persist.OrderEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-03T18:10:22")
@StaticMetamodel(CarEntity.class)
public class CarEntity_ { 

    public static volatile SingularAttribute<CarEntity, String> carType;
    public static volatile SingularAttribute<CarEntity, String> color;
    public static volatile SingularAttribute<CarEntity, String> carStatus;
    public static volatile SingularAttribute<CarEntity, Double> price;
    public static volatile SetAttribute<CarEntity, OrderEntity> orders;
    public static volatile SingularAttribute<CarEntity, String> carMake;
    public static volatile SingularAttribute<CarEntity, Long> carID;
    public static volatile SingularAttribute<CarEntity, String> carModel;

}