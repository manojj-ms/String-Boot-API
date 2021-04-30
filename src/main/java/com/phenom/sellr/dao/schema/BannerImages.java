package com.phenom.sellr.dao.schema;
import javax.persistence.*;

@Entity
@Table(name = "bannerimages")
public class BannerImages {
    private int id;


    public BannerImages(){
    }

    public BannerImages(int id){
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
