package hello.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by qwone4@gmail.com on 2020-06-16
 * Blog : http://aonee.tistory.com
 * Github : http://github.com/devAon
 */
@Entity
@Getter
@Setter
public class Member {
    @Id
    private Long id;
    private String name;
}
