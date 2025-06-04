package cat.itacademy.s04.t02.n03.s04t02n03.services;


import cat.itacademy.s04.t02.n03.s04t02n03.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.s04t02n03.model.Fruit;
import cat.itacademy.s04.t02.n03.s04t02n03.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        if (!fruitRepository.existsById(fruit.getId())) {
            throw new FruitNotFoundException("Fruit with ID " + fruit.getId() + " not found.");
        }
        return fruitRepository.save(fruit);
    }

    @Override
    public void deleteFruit(String id) {
        fruitRepository.deleteById(id);
    }

    @Override
    public Fruit getFruitById(String id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit with ID " + id + " not found."));
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    @Override
    public List<Fruit> addFruits(List<Fruit> fruits) {
        return fruitRepository.saveAll(fruits);
    }
}