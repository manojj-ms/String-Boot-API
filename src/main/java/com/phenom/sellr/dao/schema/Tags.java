package com.phenom.sellr.dao.schema;
import javax.persistence.*;

@Entity
@Table(name = "tags")
public class Tags {
    private int tag_id;
    private char name;

    public Tags() {
    }

    public Tags(int tag_id, char name) {
        this.tag_id = tag_id;
        this.name = name;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

}
