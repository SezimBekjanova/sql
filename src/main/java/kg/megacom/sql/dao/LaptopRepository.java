package kg.megacom.sql.dao;

import kg.megacom.sql.models.Laptop;
import kg.megacom.sql.models.PC;
import kg.megacom.sql.models.Product;
import kg.megacom.sql.models.pojo.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
    //1.1
    List<Laptop> findByPriceGreaterThan(double price);

    //1.2
    @Query("select new kg.megacom.sql.models.pojo.Task3(u.product.model, u.ram, u.speed) FROM Laptop u where u.price > ?1")
    List<Task3> findTask3ByPrice(double price);

    //1.3
    @Query(value = "select model,ram,screen from Laptop  where price > :price", nativeQuery = true)
    List<Task3View> findTask3ByPriceNative(double price);

    //6.3
    @Query(value = " Select distinct maker, speed from\n" +
            "product pr join laptop l on pr.model=l.model\n" +
            "where hd >=:hd", nativeQuery = true)
    List<Task6View> findTask6ByHd(double hd);
}