package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PrinterRepository;
import kg.megacom.sql.models.Printer;
import kg.megacom.sql.models.pojo.Task4;
import kg.megacom.sql.services.Task4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Task4ServiceImpl implements Task4Service {
    @Autowired
    private PrinterRepository printerRepository;
    @Override
    public Object task4(char color) {
        List<Printer> printers = printerRepository.findTask4ByColor(color);

       /*
//4.1.1
        List<Task4> task4s = new ArrayList<>();
        for (Printer printer:printers) {
            Task4 task4 = new Task4();
            task4.setType(printer.getType());
            task4.setModel(printer.getProduct().getModel());
            task4.setColor(printer.getColor());
            task4.setPrice(printer.getPrice());
            task4s.add(task4);
        }
        return task4s;

        */


        /*
//4.1.2
        List<Map<String, Object>> task4s = new ArrayList<>();
        for (Printer printer: printers) {
            Map<String, Object> map = new HashMap<>();
            map.put("model", printer.getProduct().getModel());
            map.put("color", printer.getColor());
            map.put("type", printer.getType());
            map.put("price", printer.getPrice());
            task4s.add(map);
        }
        return task4s;
         */


//4.2
        //return printerRepository.findTask4ByType(color);

        return printerRepository.findTask4ByTypeNative(color);
    }
}
