package kg.megacom.sql.controllers;

import kg.megacom.sql.services.Task1Service;
import kg.megacom.sql.services.Task2Service;
import kg.megacom.sql.services.Task3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
