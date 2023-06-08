package entitty;

import base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Likes")
public class Likes extends BaseEntity<Long> {

    @ManyToOne
    Tweet tweet;
    @ManyToOne
    Comment comment;
    @ManyToOne
    AccountUser accountUser;

    public Likes(Tweet tweet, AccountUser accountUser) {
        this.tweet = tweet;
        this.accountUser = accountUser;
    }
}
