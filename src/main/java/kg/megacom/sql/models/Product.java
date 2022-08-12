package kg.megacom.sql.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(length = 50)
    String model;
    @Column(length = 50)
    String maker;
    @Column(length = 10)
    String type;
}
