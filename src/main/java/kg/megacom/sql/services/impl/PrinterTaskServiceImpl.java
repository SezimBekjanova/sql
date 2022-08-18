package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.LaptopRepository;
import kg.megacom.sql.dao.PrinterRepository;
import kg.megacom.sql.models.Laptop;
import kg.megacom.sql.models.Printer;
import kg.megacom.sql.services.PrinterTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@Service
public class PrinterTaskServiceImpl implements PrinterTaskService {
    @Autowired
    private PrinterRepository printerRepository;
    @Autowired
    private LaptopRepository laptopRepository;
    @Override
    public Object printerTask() {
        List<Printer> list = printerRepository.findAll();
        Printer printer;
        // мах числи
        //return list.stream().max(Comparator.comparing(Printer::getPrice));
        // list.stream().max((a,b)-> (int) (a.getPrice()-b.getPrice()));
       // return list;

        // мин число
        //return list.stream().min(Comparator.comparing(Printer::getPrice));

        //первую строку
        //return list.stream().findFirst();

        // вытаскивает коллекцию, используя фильтр
        //return list.stream().filter(item -> item.getColor()=='n').collect(Collectors.toList());

        //сортировка по возрастанию
        //return list.stream().sorted(Comparator.comparing(Printer::getType)).collect(Collectors.toList());

        //сортировка по убыванию
        //return list.stream().sorted(Comparator.comparing(Printer::getType).reversed()).collect(Collectors.toList());

        //группировка
        //return list.stream().collect(Collectors.groupingBy(Printer::getType));

        //allMatch возвращает true/false проверка(правда ли то, что у всех одинаковая цена)
        //return list.stream().allMatch(x -> Objects.equals(x.getPrice(), null));

        //anyMatch проверяет есть ли type с таким назв
        //return list.stream().anyMatch(x -> Objects.equals(x.getType(), "Laser"));

        //noneMatch проверяет есть ли цена выше указанной
        //return list.stream().noneMatch(x -> Objects.equals(x.getPrice(), "700"));

        //уникальная коллекция
        return list.stream().distinct();
    }
}
