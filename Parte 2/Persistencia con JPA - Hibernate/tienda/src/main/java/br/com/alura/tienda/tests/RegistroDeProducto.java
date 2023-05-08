package br.com.alura.tienda.tests;

import br.com.alura.tienda.dao.CategoriaDao;
import br.com.alura.tienda.dao.ProductoDao;
import br.com.alura.tienda.modelo.Categoria;
import br.com.alura.tienda.modelo.Producto;
import br.com.alura.tienda.utils.JPAUtils;
import java.math.BigDecimal;
import javax.persistence.EntityManager;

public class RegistroDeProducto {

	public static void main(String[] args) {
		registrarProducto();
		EntityManager em = JPAUtils.getEntityManager();
		ProductoDao productoDao = new ProductoDao(em);
		Producto producto = productoDao.consultaPorId(1l);
		System.out.println(producto.getNombre());

		//List<Producto> productos = productoDao.consultaPorNombreDeCategoria("CELULARES");
		//productos.forEach(prod -> System.out.println(prod.getDescripcion()));

		BigDecimal precio = productoDao.consultarPrecioPorNombreDeProducto("Xiaomi Redmi");
		System.out.println(precio);

	}

	private static void registrarProducto(){
		Categoria celulares = new Categoria("CELULARES");
		Producto celular= new Producto("Xiaomi Redmi", "Muy bueno", new BigDecimal("800"), celulares);

	    EntityManager em = JPAUtils.getEntityManager();
		ProductoDao productoDao = new ProductoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin();

		categoriaDao.guardar(celulares);
		productoDao.guardar(celular);

		em.getTransaction().commit();
		em.close();
	}

}
