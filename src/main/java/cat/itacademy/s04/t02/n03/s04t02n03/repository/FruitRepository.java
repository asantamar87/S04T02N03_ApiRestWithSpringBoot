package cat.itacademy.s04.t02.n03.s04t02n03.repository;

import cat.itacademy.s04.t02.n03.s04t02n03.model.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FruitRepository extends MongoRepository<Fruit, String> {

}
