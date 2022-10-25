package com.cts.ecart.dao;

import java.util.List;

import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.ecart.entity.Product;
@NamedQuery(name = "q2",query = "from com.cts.ecart.entity.Product")
public interface ProductDao extends JpaRepository<Product, Integer> {

	// DSL (Domain specific language)

	// Find all products by product title
	List<Product> findByProductTitleLike(String name);

	// find all products whose price is greater than ?
	List<Product> findByProductPriceGreaterThanEqual(double price);

	// find all products whose price is less than than ?
	List<Product> findByProductPriceLessThanEqual(double price);

	// find all products with specified price range
	List<Product> findByProductPriceBetween(double minPrice, double maxPrice);

	// list all products for a specific brand name
	List<Product> findByBrand_BrandTitleLike(String brandTitle);

	// list all products of a specified category name
	List<Product> findByCategory_CatTitle(String catTitle);

	// list all products matching with a brand name and price greater than?
	List<Product> findByBrand_BrandTitleLikeAndProductPriceGreaterThanEqual(String brandTitle, double price);

	// Query
	//@Query(name = "q1", value = "from com.cts.ecart.entity.Product p where p.brand.brandTitle =:brandTitle")
	//List<Product> filterProducts(String brandTitle);

	// Query  : JPQL
	@Query(name = "q1", value = "from com.cts.ecart.entity.Product p where p.brand.brandTitle =:name")
	List<Product> filterProducts(@Param("name") String brandTitle);

}
