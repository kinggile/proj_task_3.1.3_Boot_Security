package com.example.SpringBoot_Security.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role")
    private String role;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    // todo возможно не понадобятся конструкторы ниже
    public Role(Long id) {
        this.id = id;
    }

    public Role(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return getRole(); // todo или нужно добавить getName()
    }


    @Override
    public String toString() {
        return this.role;
    }

    // todo переопределение equals hashCode?

    /*
    And equals() and hashCode() must be overridden so Spring MVC and Thymeleaf will show the check marks
     correctly when the form is in edit mode.
     */
}
