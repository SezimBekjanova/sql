package kg.megacom.sql.dao;

import kg.megacom.sql.models.Product;
import kg.megacom.sql.models.pojo.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    //2.1
    List<Product> findDistinctByType(String type);
    //2.2
    @Query("select new kg.megacom.sql.models.pojo.Task2(p.maker) from Product p where p.type =:type ")
    List<Task2> findTask2ByType(String type);
    //2.3
    @Query(value = "select maker from Product  where type =:type", nativeQuery = true)
    List<Task2View> findTask2ByTypeNative(String type);
}
