/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author adevaldo
 */
public class JPAConexao {

    private static  EntityManagerFactory emf = null;
    private static  EntityManager em = null;

    public static EntityManager getEntityManager() {

        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("ProjetoIFSULPU");
        }
        if (em == null) {
            em = emf.createEntityManager();
        }

        return em;
    }

}
