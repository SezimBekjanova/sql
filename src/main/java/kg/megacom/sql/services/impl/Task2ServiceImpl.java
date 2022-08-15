package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PCRepository;
import kg.megacom.sql.dao.ProductRepository;
import kg.megacom.sql.models.PC;
import kg.megacom.sql.models.Product;
import kg.megacom.sql.models.pojo.Task2;
import kg.megacom.sql.services.Task2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Task2ServiceImpl implements Task2Service {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Object task2(String type) {
        List<Product> products = productRepository.findDistinctByType(type);
      /*
//2.1.1
        List<Task2> task2s = new ArrayList<>();
        for (Product product:products) {
            Task2 task2 = new Task2();
            task2.setMaker(product.getMaker());
            task2s.add(task2);
        }
        return task2s;
    }


    /*
//2.1.2
        List<Map<String, Object>> task2s = new ArrayList<>();
        for (Product product:products) {
            Map<String, Object> map = new HashMap<>();
            map.put("maker", product.getMaker());
            task2s.add(map);
        }
        return task2s;
    }

     */



//2.2
        //return productRepository.findTask2ByType(type);


//2.3
        return productRepository.findTask2ByType(type);
    }
}
