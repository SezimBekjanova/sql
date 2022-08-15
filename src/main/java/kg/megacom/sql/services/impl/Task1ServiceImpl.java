package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PCRepository;
import kg.megacom.sql.models.PC;
import kg.megacom.sql.services.Task1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task1ServiceImpl implements Task1Service {
    @Autowired
    private PCRepository PCRepository;
    @Override
    public Object task1(double price) {
        List<PC> pcs = PCRepository.findByPriceLessThan(price);

/*
//1.1.1
        List<Task1> task1s = new ArrayList<>();
        for (PC PC: pcs) {
            Task1 task1 = new Task1();
            task1.setHd(PC.getHd());
            task1.setSpeed(PC.getSpeed());
            task1.setModel(PC.getProduct().getModel());
            task1s.add(task1);
        }
        return task1s;
         */


        /*
//1.1.2

        List<Map<String,Object>> task1s = new ArrayList<>();
        for (PC PC:pcs) {
            Map<String, Object> map = new HashMap<>();
            map.put("model",PC.getProduct().getModel());
            map.put("speed", PC.getSpeed());
            map.put("hd",PC.getHd());
            task1s.add(map);
        }
        return task1s;

         */



//1.2
        //return PCRepository.findTask1ByPriceNative(price);


//1.3
    return PCRepository.findTask1ByPrice(price);
    }
}
