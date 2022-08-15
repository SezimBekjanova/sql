package kg.megacom.sql.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "PC")
public class PC {
    @Id
    Integer code;
    int speed;
    double hd;
    int ram;
    @Column(length = 10)
    String cd;
    double price;
    @ManyToOne
        @JoinColumn(name = "model")
    Product product;
    /*

CREATE TABLE PC (
	code int NOT NULL ,
	model varchar (50) NOT NULL ,
	speed smallint NOT NULL ,
	ram smallint NOT NULL ,
	hd real NOT NULL ,
	cd varchar (10) NOT NULL ,
	price decimal(12,2) NULL
)

     */

}
