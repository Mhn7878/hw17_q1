package entitty;

import base.BaseEntity;

import javax.persistence.ManyToOne;

public class Likes extends BaseEntity<Long> {
    @ManyToOne
    Tweet tweet;
    @ManyToOne
    Comment comment;
}
