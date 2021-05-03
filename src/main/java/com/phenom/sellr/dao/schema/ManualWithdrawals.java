package com.phenom.sellr.dao.schema;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "manualwithdrawals")
public class ManualWithdrawals {
    private char status;
    private char type;

    public ManualWithdrawals(){

    }

    public ManualWithdrawals(char status, char type){
        this.status = status;
        this.type = type;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

}
