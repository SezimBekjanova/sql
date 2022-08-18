package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PCRepository;
import kg.megacom.sql.models.PC;
import kg.megacom.sql.models.pojo.Task5;
import kg.megacom.sql.services.Task5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Task5ServiceImpl implements Task5Service {
    @Autowired
    private PCRepository pcRepository;
    @Override
    public Object task5(List<String>cds,double price) {
        List<Task5> task5s = new ArrayList<>();
        List<PC> pcs = pcRepository.findDistinctByCdInAndPriceLessThan(cds, price);
        for (kg.megacom.sql.models.PC PC: pcs) {
            Task5 task5 = new Task5();
            task5.setHd(PC.getHd());
            task5.setSpeed(PC.getSpeed());
            task5.setModel(PC.getProduct().getModel());
            task5s.add(task5);
        }
        return task5s;
//5.3
       // return pcRepository.findTask5ByPriceNative(cds,price);
// 5.2
        //return pcRepository.findTask5ByPrice(cds,price);
    }
}
