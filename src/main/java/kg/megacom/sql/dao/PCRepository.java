package kg.megacom.sql.dao;

import kg.megacom.sql.models.PC;
import kg.megacom.sql.models.Printer;
import kg.megacom.sql.models.Product;
import kg.megacom.sql.models.pojo.Task1;
import kg.megacom.sql.models.pojo.Task1View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCRepository extends JpaRepository<PC, Integer> {
    //1.1
    List<PC> findByPriceLessThan(double price);
    //1.2
    @Query("select new kg.megacom.sql.models.pojo.Task1(u.product.model, u.hd, u.speed) FROM PC u where u.price < ?1")
    List<Task1> findTask1ByPrice(double price);
    //1.3
   @Query(value = "select model, speed, hd from pc  where price < :price", nativeQuery = true)
    List<Task1View> findTask1ByPriceNative(double price);
}
