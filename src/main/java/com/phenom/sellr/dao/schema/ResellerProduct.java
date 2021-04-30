package com.phenom.sellr.dao.schema;
import javax.persistence.*;

@Entity
@Table(name = "resellerproducts")
public class ResellerProduct {
    private int reseller_product_id ;
    private char status;

    public  ResellerProduct(){

    }


    public  ResellerProduct(int reseller_product_id, char status){
        this.reseller_product_id = reseller_product_id;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getReseller_product_id() {
        return reseller_product_id;
    }

    public void setReseller_product_id(int reseller_product_id) {
        this.reseller_product_id = reseller_product_id;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
