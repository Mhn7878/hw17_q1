package entitty;

import base.BaseEntity;
import javassist.util.proxy.ProxyFactory;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountUser extends BaseEntity<Long> {
    @Column(unique = true)
    String userName;

    String firstName;

    String lastName;


}
