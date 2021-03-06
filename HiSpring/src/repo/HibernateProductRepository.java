package repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Product;

//Using Spring just to inject the SessionFactory
//This is the best option when using Spring+Hibernate together
@Repository
public class HibernateProductRepository implements ProductRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Product product) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(product);
		txn.commit();
	}

	@Override
	public Product get(int productId) {
		Session session = sessionFactory.openSession();
		Product product = (Product) session.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		Session session = sessionFactory.openSession();
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}

}
