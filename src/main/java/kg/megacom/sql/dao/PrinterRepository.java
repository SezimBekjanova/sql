package kg.megacom.sql.dao;

import kg.megacom.sql.models.Printer;
import kg.megacom.sql.models.pojo.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrinterRepository extends JpaRepository<Printer,Integer>{
//4.1
    List<Printer> findTask4ByColor(char color);
//4.2
    @Query("select new kg.megacom.sql.models.pojo.Task4(p.product.model,p.color, p.price,p.type) from Printer p where p.color =:color ")
    List<Task4> findTask4ByType(char color);
//4.3
    @Query(value = "select * from Printer  where color =:color", nativeQuery = true)
    List<Task4View> findTask4ByTypeNative(char color);
    //10.1
    List<Printer> findAll();

    List<Printer> findAllByPrice(double price);

}