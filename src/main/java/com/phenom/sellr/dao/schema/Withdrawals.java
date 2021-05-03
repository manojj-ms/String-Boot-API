package com.phenom.sellr.dao.schema;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "withdrawals")
public class Withdrawals {
    private char status;

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Withdrawals() {
    }

    public Withdrawals(char status) {
        this.status = status;
    }

}
