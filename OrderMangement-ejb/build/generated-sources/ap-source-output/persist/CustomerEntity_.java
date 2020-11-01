package persist;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persist.OrderEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-03T18:10:22")
@StaticMetamodel(CustomerEntity.class)
public class CustomerEntity_ { 

    public static volatile SingularAttribute<CustomerEntity, String> customerPhone;
    public static volatile SingularAttribute<CustomerEntity, String> address;
    public static volatile SingularAttribute<CustomerEntity, String> name;
    public static volatile SetAttribute<CustomerEntity, OrderEntity> orders;
    public static volatile SingularAttribute<CustomerEntity, String> email;

}