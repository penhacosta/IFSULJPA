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
public class JPAUtil {

    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("UIFSUL");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
