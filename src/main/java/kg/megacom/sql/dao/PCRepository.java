package kg.megacom.sql.dao;

import kg.megacom.sql.models.PC;
import kg.megacom.sql.models.Printer;
import kg.megacom.sql.models.Product;
import kg.megacom.sql.models.pojo.Task1;
import kg.megacom.sql.models.pojo.Task1View;
import kg.megacom.sql.models.pojo.Task5View;
import kg.megacom.sql.models.pojo.Task8View;
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
    //5.1
    List<PC> findDistinctByCdInAndPriceLessThan(List<String>cds,double price);
    //5.2
    @Query("select new kg.megacom.sql.models.pojo.Task5(pc.product.model, pc.speed, pc.hd)  from PC pc where pc.cd in(:cds) and pc.price<:price")
    List<Task5View> findTask5ByPrice(List<String>cds,double price);
    //5.3
    @Query(value =  "Select model, speed, hd from PC where cd in(:cds) and price<:price", nativeQuery = true)
    List<Task5View> findTask5ByPriceNative(List<String>cds,double price);

    //9.3
    @Query(value = "SELECT DISTINCT product.maker\n" +
            "FROM pc\n" +
            "INNER JOIN product ON pc.model = product.model\n" +
            "WHERE pc.speed >= speed",nativeQuery = true)
    List<Task8View> findTask8DistinctSpeed(int speed);

    //11.1
    List<PC> findAll();
}