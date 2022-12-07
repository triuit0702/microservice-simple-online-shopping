package tri.chung.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tri.chung.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
