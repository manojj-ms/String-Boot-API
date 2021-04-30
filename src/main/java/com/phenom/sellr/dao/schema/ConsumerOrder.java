package com.phenom.sellr.dao.schema;
import javax.persistence.*;

@Entity
@Table(name = "consumerorder")
public class ConsumerOrder {
    private  int order_id;
    private  int quantity;
    private  char delivery_job_id;
    private  char reseller_commission_status;
    private  char merchant_commission_status;
    private  char order_status;

    public  ConsumerOrder(){}

    public  ConsumerOrder(int order_id,int quantity,  char delivery_job_id, char reseller_commission_status, char merchant_commission_status, char order_status){
        this.order_id = order_id;
        this.quantity = quantity;
        this.delivery_job_id = delivery_job_id;
        this.reseller_commission_status = reseller_commission_status;
        this.merchant_commission_status = merchant_commission_status;
        this.order_status = order_status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getDelivery_job_id() {
        return delivery_job_id;
    }

    public void setDelivery_job_id(char delivery_job_id) {
        this.delivery_job_id = delivery_job_id;
    }

    public char getReseller_commission_status() {
        return reseller_commission_status;
    }

    public void setReseller_commission_status(char reseller_commission_status) {
        this.reseller_commission_status = reseller_commission_status;
    }

    public char getMerchant_commission_status() {
        return merchant_commission_status;
    }

    public void setMerchant_commission_status(char merchant_commission_status) {
        this.merchant_commission_status = merchant_commission_status;
    }

    public char getOrder_status() {
        return order_status;
    }

    public void setOrder_status(char order_status) {
        this.order_status = order_status;
    }
}
