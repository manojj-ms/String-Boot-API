package com.phenom.sellr.dao.schema;
import javax.persistence.*;

@Entity
@Table(name = "productimages")
public class ProductImages {
    private int id;


    public ProductImages(){
    }

    public ProductImages(int id){
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
