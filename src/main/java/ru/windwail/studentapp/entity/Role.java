package ru.windwail.studentapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_seq_gen")
    @SequenceGenerator(name = "roles_seq_gen", sequenceName = "roles_id_seq")
    private Long id;

    @Column
    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private SystemUser systemUser;
}
