/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestePrincipal;

import com.br.conexao.JPAUtil;
import com.br.entidades.modelo.Pais;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 *
 * @author adevaldo
 */
public class Principal {

    public static void main(String args[]) {
        EntityManager em = JPAUtil.getEntityManager();
        Pais pais = new Pais();
        pais.setNome("URUGUAI");
        pais.setIso("URU");
        em.getTransaction().begin();
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Pais>> erros = validator.validate(pais);
        if (erros.size() > 0) {
            for (ConstraintViolation<Pais> erro : erros) {
                System.out.println("Erro " + erro.getMessage());
            }
        } else {
            em.persist(pais);
        }

        em.getTransaction().commit();
        em.close();
        
    }

}
