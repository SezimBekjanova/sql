package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.LaptopRepository;
import kg.megacom.sql.models.Laptop;
import kg.megacom.sql.models.pojo.Task6;
import kg.megacom.sql.models.pojo.Task6View;
import kg.megacom.sql.services.Task6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
public class Task6ServiceImpl implements Task6Service {
    @Autowired
    private LaptopRepository laptopRepository;
    @Override
    public Object task6(double hd) {
        List<Laptop> list = laptopRepository.findAllByHdGreaterThanEqual(hd);
        List<Task6> task6Views = list
                .stream()
                .map(item ->//x Элумент списка
                        new Task6(item.getProduct().getMaker(), item.getSpeed()))
                .collect(Collectors.toList());
        long count = list.stream()
                .filter(x->x.getHd()>10)
                .count();
        // уникальное потом количество

        long count1 = list.stream()
                .count();
        // посчитает количество

        Laptop laptop =list
                .stream()
                .findAny()
                .orElse(new Laptop());
        // если окакжется рустым то вернет пустоту, а не ошибку

        double summa = list
                .stream()
                .flatMapToDouble(x-> DoubleStream.of(x.getPrice()))
                .sum();
        //вернет сумму всех Price
        return task6Views;
    }
}
