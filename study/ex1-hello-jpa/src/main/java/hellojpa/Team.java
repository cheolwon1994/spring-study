package hellojpa;

import javax.persistence.*;
import java.util.*;

@Entity
public class Team {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "TEAM_ID")
    private Long id;
    private String name;

    //반대편의 변수명으로 mappedBy
    @OneToMany(mappedBy = "team")
    private Set<Member> members = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}
