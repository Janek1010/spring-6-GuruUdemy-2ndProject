package guru.springframework.spring6restmvc.repositories;

import guru.springframework.spring6restmvc.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
=======

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
>>>>>>> 107-rel-one-to-one
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
