package guru.springframework.spring6restmvc.repositories;

import guru.springframework.spring6restmvc.entities.Beer;
import guru.springframework.spring6restmvc.entities.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryRepositoryTest {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    BeerRepository beerRepository;
<<<<<<< HEAD

=======
>>>>>>> 107-rel-one-to-one
    Beer testBeer;

    @BeforeEach
    void setUp() {
        testBeer = beerRepository.findAll().get(0);
    }
<<<<<<< HEAD
    @Transactional
    @Test
    void testAddCategory(){
=======

    @Transactional
    @Test
    void testAddCategory() {
>>>>>>> 107-rel-one-to-one
        Category savedCat = categoryRepository.save(Category.builder()
                        .description("Ales")
                .build());

        testBeer.addCategory(savedCat);
        Beer saveBeer = beerRepository.save(testBeer);

        System.out.println(saveBeer.getBeerName());
<<<<<<< HEAD
=======

>>>>>>> 107-rel-one-to-one
    }
}




<<<<<<< HEAD











=======
>>>>>>> 107-rel-one-to-one
