package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.PCRepository;
import kg.megacom.sql.services.Task5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Task5ServiceImpl implements Task5Service {
    @Autowired
    private PCRepository pcRepository;
    @Override
    public Object task5(double price) {
        return pcRepository.findTask5ByPriceNative(price);
    }
}
