package kg.megacom.sql.models.pojo;

import kg.megacom.sql.models.Product;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public interface Task4View {
    char getColor();
    String getType();
    double getPrice();
    String getModel();
}
