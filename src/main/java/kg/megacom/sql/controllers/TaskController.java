package kg.megacom.sql.controllers;

import kg.megacom.sql.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private Task1Service task1Service;
    @GetMapping("/1")
    public Object task1(@RequestParam double price){
        return task1Service.task1(price);
    }
    @Autowired
    private Task2Service task2Service;
    @GetMapping("/2")
    public Object task2(@RequestParam String type){
        return task2Service.task2(type);
    }
    @Autowired
    private Task3Service task3Service;
    @GetMapping("/3")
    public Object task3(@RequestParam double price){return task3Service.task3(price);}
    @Autowired
    private Task4Service task4Service;
    @GetMapping("/4")
    public Object task4(@RequestParam char color){return task4Service.task4(color);}
    @Autowired
    private Task5Service task5Service;
    @GetMapping("/5")
    public Object task5(@RequestParam List<String>cds, @RequestParam double price){return task5Service.task5(cds,price);}
    @Autowired
    private Task6Service task6Service;
    @GetMapping("/6")
    public Object task6(@RequestParam double hd){return task6Service.task6(hd);}
    @Autowired
    private Task8Service task8Service;
    @GetMapping("/8")
    public Object task8(@RequestParam String type1){return task8Service.task8(type1);}
    @Autowired
    private Task9Service task9Service;
    @GetMapping("/9")
    public  Object task9(@RequestParam int speed){return task9Service.task9(speed);}
    @Autowired
    private Task10Service task10Service;
    @GetMapping("/10")
    public  Object task10(){
        return task10Service.task10();
    }
    @Autowired
    private Task11Service task11Service;
    @GetMapping("/11")
    public  Object task11(){
        return task11Service.task11();
    }
    @Autowired
    private PrinterTaskService printerTaskService;
    @GetMapping("/12")
    public  Object PrinterTask(){
        return printerTaskService.printerTask();
    }
}

