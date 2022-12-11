package de.tekup.locationappb.entites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class User {
    @Id
    private String username;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",joinColumns = {@JoinColumn(name = "USER_ID")},inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID")
    })
    private Set<Role> role=new HashSet<>();



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
