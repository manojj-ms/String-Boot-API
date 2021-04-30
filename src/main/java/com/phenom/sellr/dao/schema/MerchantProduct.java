package com.phenom.sellr.dao.schema;
import javax.persistence.*;

@Entity
@Table(name = "products")
public class MerchantProduct {
    private int product_id;
    private char thumbnail_image;
    private char sku;
    private char name;
    private char description;
    private char category;
    private Boolean  merchant_can_sell;
    private Boolean reseller_can_sell;
    private Boolean fulfilled_by_merchant;
    private char storage_type;
    private Boolean  has_variations;
    private  Boolean  no_end_date;
    private char status;
    private char outbound_status;
    private char remarks;
    private char collection_job_id;


    public  MerchantProduct(int product_id,char thumbnail_image,char sku, char name, char description, char category, Boolean  merchant_can_sell, Boolean reseller_can_sell, Boolean fulfilled_by_merchant, char storage_type,Boolean  has_variations,Boolean  no_end_date, char status,char outbound_status, char remarks, char collection_job_id,char do_number){
        this.product_id = product_id;
        this.thumbnail_image = thumbnail_image;
        this.sku = sku;
        this.name = name;
        this.description = description;
        this.category = category;
        this.merchant_can_sell = merchant_can_sell;
        this.reseller_can_sell = reseller_can_sell;
        this.fulfilled_by_merchant = fulfilled_by_merchant;
        this.storage_type = storage_type;
        this.has_variations = has_variations;
        this.no_end_date = no_end_date;
        this.status = status;
        this.outbound_status = outbound_status;
        this.remarks = remarks;
        this.collection_job_id = collection_job_id;
        this.do_number = do_number;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public char getThumbnail_image() {
        return thumbnail_image;
    }

    public void setThumbnail_image(char thumbnail_image) {
        this.thumbnail_image = thumbnail_image;
    }

    public char getSku() {
        return sku;
    }

    public void setSku(char sku) {
        this.sku = sku;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getDescription() {
        return description;
    }

    public void setDescription(char description) {
        this.description = description;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public Boolean getMerchant_can_sell() {
        return merchant_can_sell;
    }

    public void setMerchant_can_sell(Boolean merchant_can_sell) {
        this.merchant_can_sell = merchant_can_sell;
    }

    public Boolean getReseller_can_sell() {
        return reseller_can_sell;
    }

    public void setReseller_can_sell(Boolean reseller_can_sell) {
        this.reseller_can_sell = reseller_can_sell;
    }

    public Boolean getFulfilled_by_merchant() {
        return fulfilled_by_merchant;
    }

    public void setFulfilled_by_merchant(Boolean fulfilled_by_merchant) {
        this.fulfilled_by_merchant = fulfilled_by_merchant;
    }

    public char getStorage_type() {
        return storage_type;
    }

    public void setStorage_type(char storage_type) {
        this.storage_type = storage_type;
    }

    public Boolean getHas_variations() {
        return has_variations;
    }

    public void setHas_variations(Boolean has_variations) {
        this.has_variations = has_variations;
    }

    public Boolean getNo_end_date() {
        return no_end_date;
    }

    public void setNo_end_date(Boolean no_end_date) {
        this.no_end_date = no_end_date;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getOutbound_status() {
        return outbound_status;
    }

    public void setOutbound_status(char outbound_status) {
        this.outbound_status = outbound_status;
    }

    public char getRemarks() {
        return remarks;
    }

    public void setRemarks(char remarks) {
        this.remarks = remarks;
    }

    public char getCollection_job_id() {
        return collection_job_id;
    }

    public void setCollection_job_id(char collection_job_id) {
        this.collection_job_id = collection_job_id;
    }

    public char getDo_number() {
        return do_number;
    }

    public void setDo_number(char do_number) {
        this.do_number = do_number;
    }

    private char  do_number;

    public  MerchantProduct(){

    }




}
