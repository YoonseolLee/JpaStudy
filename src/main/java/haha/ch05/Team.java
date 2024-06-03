package haha.ch05;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;
    private String name;

    @OneToMany(mappedBy = "team")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
