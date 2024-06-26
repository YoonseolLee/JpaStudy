package haha.ch06;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    /**
     * 다대일 단방향
     */

//    @Id @GeneratedValue
//    @Column(name = "TEAM_ID")
//    private Long id;
//
//    private String name;
//
//    @OneToMany(mappedBy = "team")
//    private List<Member> members = new ArrayList<Member>();
//
//    public void addMember(Member member) {
//        this.members.add(member);
//        if (member.getTeam() != this) {
//            member.setTeam(this);
//        }
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Member> getMembers() {
//        return members;
//    }
//
//    public void setMembers(List<Member> members) {
//        this.members = members;
//    }
    /**
     * 일대다 단방향
     */
    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "TEAM_ID") // Member 테이블의 TEAM_ID (FK)
    private List<Member> members = new ArrayList<Member>();

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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
