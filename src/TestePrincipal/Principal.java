/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestePrincipal;


import com.br.conexao.JPAUtil;
import com.br.entidades.modelo.Pais;
import javax.persistence.EntityManager;

/**
 *
 * @author adevaldo
 */
public class Principal {
    
    public static void main(String args[]){
         EntityManager em = JPAUtil.getEntityManager();
         Pais pais = new Pais();
         pais.setNome("BRASIL");
         pais.setIso("BRA");
         em.getTransaction().begin();
         em.persist(pais);
         em.getTransaction().commit();
         em.close();
   }
    
}
