/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jesusarizmendiparcial;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

 
public class TestApoyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        
        //Obtenemos la apertura de sesion actual
        Session sesion= factory.openSession();
        //Creamos la transaccion(evita que 2 usuarios abran la sesion al mismo tiempo)
        Transaction tranza= sesion.beginTransaction();
        Evaluacion e=new Evaluacion();
                e.setNombre("Ana");
                e.setCalificacion(7.0);
        
        // TODO code application logic here
    }
    
}
