package kg.megacom.sql.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    Integer code;
    @Column(nullable = false)
    int ram;
    @Column(nullable = false)
    int speed;
    @Column(nullable = false)
    int screen;
    @Column(nullable = false)
    double hd;
    @Column(nullable = true)
    long price;
    @ManyToOne
        @JoinColumn(name = "model")
    Product product;
}

/*CREATE TABLE Laptop (
	/code int NOT NULL ,
	/model varchar (50) NOT NULL ,
	/speed smallint NOT NULL ,
	/ram smallint NOT NULL ,
	//hd real NOT NULL ,
	//price decimal(12,2) NULL ,
	/screen smallint NOT NULL
)


CREATE TABLE PC (
	code int NOT NULL ,
	model varchar (50) NOT NULL ,
	speed smallint NOT NULL ,
	ram smallint NOT NULL ,
	hd real NOT NULL ,
	cd varchar (10) NOT NULL ,
	price decimal(12,2) NULL
)
;

 */