package com.bn.crud.EstudanteController;
import jakarta.persistence.*;
@Entity
@Table(name = "tb_aluno")
public class EstudanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nome;
    private String Email;
    private Integer Idade;
    public EstudanteModel() {
    }
    public EstudanteModel(Long id, String nome, String email, Integer idade) {
        id = id;
        Nome = nome;
        Email = email;
        Idade = idade;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }
}