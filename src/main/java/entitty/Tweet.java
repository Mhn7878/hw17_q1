package entitty;

import base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tweet extends BaseEntity<Long> {
    @Column(length = 280)
    String text;
    @ManyToOne
    AccountUser accountUser;
}
