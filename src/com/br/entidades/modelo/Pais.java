/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.entidades.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author adevaldo
 */
@Entity
@Table(name = "pais", schema = "JPASUL")
public class Pais implements java.io.Serializable{
    
      @Id
      @SequenceGenerator(name = "seq_pais", sequenceName = "seq_pais_id", allocationSize = 1, initialValue = 1)
      @GeneratedValue(generator = "seq_pais" ,strategy = GenerationType.IDENTITY)
      private Integer id;
      
      @Column(name = "nome", length = 50, nullable = false)
      @Length(max = 50, message = "o nome não pode tem mais de {max} caracteres")
      @NotBlank(message = "o nome deve ser informado")
      @NotNull(message = "o nome não pode ser nulo")
      private String nome;
      
      @Column(name = "iso", length = 3, nullable = false)
      @Length(max = 3, message = "a iso não pode tem mais de {max} caracteres")
      @NotBlank(message = "a iso deve ser informado")
      @NotNull(message = "a iso não pode ser nulo")
      private String iso;
      
      public Pais(){
      }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }
      
      
}
