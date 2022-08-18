package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PrinterRepository;
import kg.megacom.sql.models.Printer;
import kg.megacom.sql.models.pojo.Task10;
import kg.megacom.sql.services.Task10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Task10ServiceImpl implements Task10Service {
    @Autowired
    private PrinterRepository printerRepository;
    @Override
    public Object task10() {
        List<Printer> printers = printerRepository.findAll();
        List<Task10> task10s = new ArrayList<>();
        double price1 = 0;
        for (int i = 0; i < printers.size(); i++) {
            Task10 task10 = new Task10();
            Printer printer = printers.get(i);
            task10.setPrice(printer.getPrice());
            task10s.add(task10);
            if (price1 < task10.getPrice())
                price1 = task10.getPrice();
        }
        task10s.clear();
        List<Printer> printers1 = printerRepository.findAllByPrice(price1);
        List<Task10> task10s1 = new ArrayList<>();
        for (Printer printer : printers1) {
            Task10 task10 = new Task10();
            task10.setModel(printer.getProduct().getModel());
            task10.setPrice(price1);
            task10s1.add(task10);
        }
        return task10s1;
    }

}
