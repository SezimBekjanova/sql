package kg.megacom.sql.services.impl;

import kg.megacom.sql.dao.LaptopRepository;
import kg.megacom.sql.models.pojo.Task6;
import kg.megacom.sql.services.Task6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Task6ServiceImpl implements Task6Service {
    @Autowired
    private LaptopRepository laptopRepository;
    @Override
    public Object task6(double hd) {
        return laptopRepository.findTask6ByHd(hd);
    }
}
