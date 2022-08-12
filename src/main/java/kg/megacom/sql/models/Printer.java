package kg.megacom.sql.models;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="printer")
public class Printer {
    @Id
    Integer code;
    char color;
    String type;
    double price;
    @ManyToOne
        @JoinColumn(name="model")
    Product product;

    /*CREATE TABLE Printer (
	code int NOT NULL ,
	model varchar (50) NOT NULL ,
	color char (1) NOT NULL ,
	type varchar (10) NOT NULL ,
	price decimal(12,2) NULL
)

     */
}
