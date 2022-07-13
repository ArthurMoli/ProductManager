package com.Maci.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "servicos")
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100)
    @NotNull
    private String nomeServ;

    @Size(max = 500)
    private String descriServ;

    @Size(max = 150)
    private String equiServ;

    @Size(max = 55)
    private String tempoServ;

    @Size(max = 55)
    private String precoServ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeServ() {
        return nomeServ;
    }

    public void setNomeServ(String nomeServ) {
        this.nomeServ = nomeServ;
    }

    public String getDescriServ() {
        return descriServ;
    }

    public void setDescriServ(String descriServ) {
        this.descriServ = descriServ;
    }

    public String getEquiServ() {
        return equiServ;
    }

    public void setEquiServ(String equiServ) {
        this.equiServ = equiServ;
    }

    public String getTempoServ() {
        return tempoServ;
    }

    public void setTempoServ(String tempoServ) {
        this.tempoServ = tempoServ;
    }

    public String getPrecoServ() {
        return precoServ;
    }

    public void setPrecoServ(String precoServ) {
        this.precoServ = precoServ;
    }

    @Override
    public String toString() {
        return "Servicos{" +
                "id=" + id +
                ", nomeServ='" + nomeServ + '\'' +
                ", descriServ='" + descriServ + '\'' +
                ", equiServ='" + equiServ + '\'' +
                ", tempoServ='" + tempoServ + '\'' +
                ", precoServ='" + precoServ + '\'' +
                '}';
    }
}

