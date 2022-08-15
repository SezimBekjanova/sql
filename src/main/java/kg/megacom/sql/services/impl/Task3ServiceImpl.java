package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.LaptopRepository;
import kg.megacom.sql.models.Laptop;
import kg.megacom.sql.models.pojo.Task2;
import kg.megacom.sql.models.pojo.Task3;
import kg.megacom.sql.services.Task3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Task3ServiceImpl implements Task3Service {
    @Autowired
    private LaptopRepository laptopRepository;
    @Override
    public Object task3(double price) {
        List<Laptop> laptops = laptopRepository.findByPriceGreaterThan(price);
       /*
//3.1.1
       List<Task3> task3s = new ArrayList<>();
        for (Laptop laptop:laptops) {
            Task3 task3 = new Task3();
            task3.setRam(laptop.getRam());
            task3.setScreen(laptop.getScreen());
            task3.setModel(laptop.getProduct().getModel());
            task3s.add(task3);
        }
        return task3s;
    */


        /*
//3.1.2
        List<Map<String, Object>> task3s = new ArrayList<>();
        for (Laptop laptop:laptops) {
            Map<String, Object> map = new HashMap<>();
            map.put("model", laptop.getProduct().getModel());
            map.put("ram", laptop.getRam());
            map.put("screen", laptop.getScreen());
            task3s.add(map);
        }
        */

//3.2
        //return laptopRepository.findTask3ByPrice(price);

//3.3
        return laptopRepository.findTask3ByPriceNative(price);
    }
}
