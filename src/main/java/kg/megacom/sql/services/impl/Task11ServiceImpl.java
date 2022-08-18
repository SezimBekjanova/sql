package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PCRepository;
import kg.megacom.sql.models.PC;
import kg.megacom.sql.models.pojo.Task10;
import kg.megacom.sql.models.pojo.Task11;
import kg.megacom.sql.services.Task11Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Task11ServiceImpl implements Task11Service {
    double sum=0;
    double avg;
    @Autowired
    private PCRepository pcRepository;
    @Override
    public Object task11() {
        List<PC> pcs = pcRepository.findAll();
        List<Task11> task11s = new ArrayList<>();
        for (PC pc:pcs) {
            Task11 task11 = new Task11();
            task11.setSpeed(pc.getSpeed());
            task11s.add(task11);
            sum+=pc.getSpeed();
        }
        avg=sum/task11s.size();
        return avg;
    }
}