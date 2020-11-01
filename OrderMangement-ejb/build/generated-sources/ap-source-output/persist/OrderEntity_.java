package persist;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persist.CarEntity;
import persist.CustomerEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-03T18:10:22")
@StaticMetamodel(OrderEntity.class)
public class OrderEntity_ { 

    public static volatile SingularAttribute<OrderEntity, CarEntity> car;
    public static volatile SingularAttribute<OrderEntity, Long> id;
    public static volatile SingularAttribute<OrderEntity, Date> orderDate;
    public static volatile SingularAttribute<OrderEntity, CustomerEntity> customer;

}