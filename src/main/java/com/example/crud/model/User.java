package com.example.crud.model;
import javax.persistence.*;
@Entity
@Table(name = "consumers")
public class User {
    private int consumer_id;
    private String profile_pic;
    private String email;
    private Boolean email_verified;
    private String name;
    private String contact;
    private String password;
    private String address_line1;
    private String address_line2;
    private String address_country;
    private String address_postal;
    private Boolean is_facebook;
    private Boolean is_google;

    public User() {
    }

    public User(int consumer_id, String profile_pic, String email, String name, String contact, String password, String address_line1, String address_line2, String address_country, String address_postal, Boolean email_verified, Boolean is_facebook, Boolean is_google) {
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

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getAddress_country() {
        return address_country;
    }

    public void setAddress_country(String address_country) {
        this.address_country = address_country;
    }

    public String getAddress_postal() {
        return address_postal;
    }

    public void setAddress_postal(String address_postal) {
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
