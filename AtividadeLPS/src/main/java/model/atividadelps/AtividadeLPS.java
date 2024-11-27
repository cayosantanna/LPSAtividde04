/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model.atividadelps;

import jakarta.persistence.*;

public class AtividadeLPS {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade-lps");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();


        Customer customer = new Customer();
        customer.setName("João Silva");
        customer.setEmail("joao@gmail.com");
        customer.setPhone("123456789");
        customer.setAddress("Rua das Flores, 123");

        Product product = new Product();
        product.setName("Notebook");
        product.setDescription("Notebook Dell Inspiron");
        product.setPrice(3500.00);
        product.setStock(10);

        Order order = new Order();
        order.setDate(new java.util.Date());
        order.setTotal(3500.00);
        order.setStatus("PENDING");
        order.setCustomer(customer);

        em.persist(customer);  // Persistir cliente
        em.persist(product);    // Persistir produto
        em.persist(order);      // Persistir pedido

 
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
