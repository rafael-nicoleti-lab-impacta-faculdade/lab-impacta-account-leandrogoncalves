package br.com.lab.impacta.account.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String document;

}
