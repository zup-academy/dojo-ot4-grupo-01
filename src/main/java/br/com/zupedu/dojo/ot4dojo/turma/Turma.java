package br.com.zupedu.dojo.ot4dojo.turma;


import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(max = 50)
    private String nome;

    private LocalDate iniciaEm;

    private LocalDate terminaEm;

    public Turma(String nome, LocalDate iniciaEm, LocalDate terminaEm) {
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }

    /**
     * @deprecated uso da jpa
     */
    @Deprecated
    public Turma() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getIniciaEm() {
        return iniciaEm;
    }

    public LocalDate getTerminaEm() {
        return terminaEm;
    }
}
