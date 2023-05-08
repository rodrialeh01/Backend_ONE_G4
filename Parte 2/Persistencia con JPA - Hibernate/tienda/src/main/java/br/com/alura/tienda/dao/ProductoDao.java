package br.com.alura.tienda.dao;

import br.com.alura.tienda.modelo.Producto;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;

public class ProductoDao {
    
    private EntityManager em;

    public ProductoDao(EntityManager em) {
        this.em = em;
    }
    
    public void guardar(Producto producto) {
        this.em.persist(producto);
    }

    public Producto consultaPorId(Long id){
        return em.find(Producto.class, id);
    }

    public List<Producto> consularTodos(){
        String jpql = "SELECT P FROM Producto AS P";
        return em.createQuery(jpql, Producto.class).getResultList();
    }

    public List<Producto> consultaPorNombre(String nombre){
        String jpql = "SELECT P FROM Producto AS P WHERE P.nombre=:nombre";
        return em.createQuery(jpql,Producto.class).setParameter("nombre", nombre).getResultList();
    }

    public List<Producto> consultaPorNombreDeCategoria(String nombre){
        String jpql = "SELECT p FROM Producto AS p WHERE p.categoria.nombre=:nombre";
        return em.createQuery(jpql, Producto.class).setParameter("nombre", nombre).getResultList();
    }

    public BigDecimal consultarPrecioPorNombreDeProducto(String nombre){
        String jpql = "SELECT P.precio FROM Producto AS P WHERE P.nombre=:nombre";
        return em.createQuery(jpql,BigDecimal.class).setParameter("nombre",nombre).getSingleResult();
    }
}
