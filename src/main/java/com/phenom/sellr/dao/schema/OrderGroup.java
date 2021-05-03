package com.phenom.sellr.dao.schema;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "ordergroup")
public class OrderGroup {
    private int  order_group_id;
    private char shipping_line1;
    private char shipping_line2;
    private char shipping_country;
    private char shipping_postal_code;
    private char billing_line1;
    private char billing_line2;
    private char billing_country;
    private char billing_postal_code;
    private char payment_status;
    public OrderGroup (){}

    public OrderGroup (int order_group_id, char shipping_line1, char shipping_line2, char shipping_country, char shipping_postal_code, char billing_line1, char billing_line2, char billing_country, char billing_postal_code, char payment_status){
        this.order_group_id = order_group_id;
        this.shipping_line1 = shipping_line1;
        this.shipping_line2 = shipping_line2;
        this.shipping_country = shipping_country;
        this.shipping_postal_code = shipping_postal_code;
        this.billing_line1 = billing_line1;
        this.billing_line2 = billing_line2;
        this.billing_country = billing_country;
        this.billing_postal_code = billing_postal_code;
        this.payment_status = payment_status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getOrder_group_id() {
        return order_group_id;
    }

    public void setOrder_group_id(int order_group_id) {
        this.order_group_id = order_group_id;
    }

    public char getShipping_line1() {
        return shipping_line1;
    }

    public void setShipping_line1(char shipping_line1) {
        this.shipping_line1 = shipping_line1;
    }

    public char getShipping_line2() {
        return shipping_line2;
    }

    public void setShipping_line2(char shipping_line2) {
        this.shipping_line2 = shipping_line2;
    }

    public char getShipping_country() {
        return shipping_country;
    }

    public void setShipping_country(char shipping_country) {
        this.shipping_country = shipping_country;
    }

    public char getShipping_postal_code() {
        return shipping_postal_code;
    }

    public void setShipping_postal_code(char shipping_postal_code) {
        this.shipping_postal_code = shipping_postal_code;
    }

    public char getBilling_line1() {
        return billing_line1;
    }

    public void setBilling_line1(char billing_line1) {
        this.billing_line1 = billing_line1;
    }

    public char getBilling_line2() {
        return billing_line2;
    }

    public void setBilling_line2(char billing_line2) {
        this.billing_line2 = billing_line2;
    }

    public char getBilling_country() {
        return billing_country;
    }

    public void setBilling_country(char billing_country) {
        this.billing_country = billing_country;
    }

    public char getBilling_postal_code() {
        return billing_postal_code;
    }

    public void setBilling_postal_code(char billing_postal_code) {
        this.billing_postal_code = billing_postal_code;
    }

    public char getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(char payment_status) {
        this.payment_status = payment_status;
    }
}
