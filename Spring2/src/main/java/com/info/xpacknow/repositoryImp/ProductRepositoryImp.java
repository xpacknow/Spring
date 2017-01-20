package com.info.xpacknow.repositoryImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.info.xpacknow.domain.Product;
import com.info.xpacknow.repository.ProductRepository;

@Repository
@Transactional(readOnly = true)
public class ProductRepositoryImp implements ProductRepository {


	@PersistenceContext(unitName = "testPU")
	private EntityManager entityManager;

	@Transactional(readOnly = false)
	@Override
	public List<Product> getAllProducts() {


		TypedQuery<Product> createQuery = entityManager.createQuery("select e from Product e ", Product.class);
		List<Product> resultList = createQuery.getResultList();

		return resultList;
	}

	@Transactional(readOnly = false)
	@Override
	public Product getProductById(long productId) {
		return entityManager.find(Product.class, productId);
	}

	@Transactional(readOnly = false)
	@Override
	public void addProduct(Product product) {

		entityManager.merge(product);

	}

	@Transactional(readOnly = false)
	@Override
	public void delateProduct(long id) {

		System.out.println(id);
		Query query = entityManager.createQuery("DELETE FROM Product u WHERE u.idProdukty=:id ");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Transactional(readOnly = false)
	@Override
	public void updateProduct(Product product, long id) {

		Query query = entityManager.createQuery(
				"UPDATE Product u SET u.opis =:opis, u.nazwa=:nazwa, u.cenaZaSztuke=:cenaZaSztuke, u.stan=:stan WHERE u.idProdukty=:id");
		query.setParameter("id", id);
		query.setParameter("nazwa", product.getNazwa());
		query.setParameter("cenaZaSztuke", product.getCenaZaSztuke());
		query.setParameter("opis", product.getOpis());
		query.setParameter("stan", product.getStan());
		query.executeUpdate();

	}

}
