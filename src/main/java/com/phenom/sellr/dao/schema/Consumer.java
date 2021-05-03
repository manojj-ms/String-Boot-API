package com.phenom.sellr.dao.schema;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "consumers")
public class Consumer {
    private int consumer_id;
    private char profile_pic;
    private char email;
    private Boolean email_verified;
    private char name;
    private char contact;
    private char password;
    private char address_line1;
    private char address_line2;
    private char address_country;
    private char address_postal;
    private Boolean is_facebook;
    private Boolean is_google;

    public Consumer() {
    }

    public Consumer(int consumer_id, char profile_pic, char email, char name, char contact, char password, char address_line1, char address_line2, char address_country, char address_postal, Boolean email_verified, Boolean is_facebook, Boolean is_google) {
        this.consumer_id = consumer_id;
        this.profile_pic = profile_pic;
        this.email = email;
        this.name = name;
        this.contact = contact;
        this.password = password;
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.address_country = address_country;
        this.address_postal = address_postal;
        this.email_verified = email_verified;
        this.is_facebook = is_facebook;
        this.is_google = is_google;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getConsumer_id() {
        return consumer_id;
    }

    public void setConsumer_id(int consumer_id) {
        this.consumer_id = consumer_id;
    }

    public char getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(char profile_pic) {
        this.profile_pic = profile_pic;
    }

    public char getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(char address_line1) {
        this.address_line1 = address_line1;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public char getContact() {
        return contact;
    }

    public void setContact(char contact) {
        this.contact = contact;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(char address_line2) {
        this.address_line2 = address_line2;
    }

    public char getAddress_country() {
        return address_country;
    }

    public void setAddress_country(char address_country) {
        this.address_country = address_country;
    }

    public char getAddress_postal() {
        return address_postal;
    }

    public void setAddress_postal(char address_postal) {
        this.address_postal = address_postal;
    }

    public Boolean getEmail_verified() {
        return email_verified;
    }

    public void setEmail_verified(Boolean email_verified) {
        this.email_verified = email_verified;
    }

    public Boolean getIs_facebook() {
        return is_facebook;
    }

    public void setIs_facebook(Boolean is_facebook) {
        this.is_facebook = is_facebook;
    }

    public Boolean getIs_google() {
        return is_google;
    }

    public void setIs_google(Boolean is_google) {
        this.is_google = is_google;
    }

}
