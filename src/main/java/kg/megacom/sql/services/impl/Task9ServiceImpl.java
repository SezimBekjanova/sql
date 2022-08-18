package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PCRepository;
import kg.megacom.sql.services.Task9Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Task9ServiceImpl implements Task9Service {
    @Autowired
    private PCRepository pcRepository;
    @Override
    public Object task9(int speed) {
        return pcRepository.findTask8DistinctSpeed(speed);
    }
}
