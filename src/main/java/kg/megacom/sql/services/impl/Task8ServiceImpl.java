package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PCRepository;
import kg.megacom.sql.dao.ProductRepository;
import kg.megacom.sql.models.Product;
import kg.megacom.sql.models.pojo.Task8;
import kg.megacom.sql.services.Task8Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Task8ServiceImpl implements Task8Service {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Object task8(String type1) {
        List<Product> products = productRepository.findAllByType(type1);
        List<Task8> task8s = new ArrayList<>();
        for(Product product: products){
            Task8 task8 = new Task8();
            task8.setMaker(product.getMaker());
            task8s.add(task8);
        }
        return task8s;

      //  return productRepository.findTask8DistinctByType(type1,type2);
    }

}
