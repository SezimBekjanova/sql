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
//8.1
    List<Product> findAllByType(String type1);
    List<Product> removeDistinctByType(String type2);


    //8.2
    //@Query("SELECT DISTINCT maker FROM product WHERE type like upper(?1) and maker not in SELECT maker FROM product Where type = ?2 ")
    //List<Task8> findTask8ByType(String type1, String tape1);
    //8.3
    @Query(value ="SELECT DISTINCT maker\n" +
            "FROM product\n" +
            "WHERE type = ?1\n" +
            "EXCEPT\n" +
            "SELECT DISTINCT product.maker\n" +
            "FROM product\n" +
            "Where type = ?2 ",nativeQuery = true )
    List<Task8View> findTask8DistinctByType(String type1, String type2);
}
