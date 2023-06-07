package entitty;

import base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class Comment extends BaseEntity<Long> {
    @Column(length = 280)
    String text;
    @ManyToOne
    Tweet tweet;
    @ManyToOne
    AccountUser accountUser;
}
