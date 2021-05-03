package com.phenom.sellr.dao.schema;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "merchants")
public class Merchant {
    private int merchant_id;
    private char banner_image;
    private char profile_pic;
    private char stripeAccountID;
    private char stripeActivationCode;
    private char stripeAccountURL;
    private char email;
    private char emailVerified;
    private char name;
    private char contact;
    private char password;
    private char address_line1;
    private char address_line2;
    private char address_country;
    private char address_postal;
    private char companyName;
    private char companyContact;
    private char companyUEN;
    private char company_address_line1;
    private char company_address_line2;
    private char company_address_country;
    private char company_address_postal;
    private Boolean is_facebook;
    private Boolean is_google;

    public Merchant() {
    }

    public Merchant(int merchant_id, char banner_image, char profile_pic, char stripeAccountID, char stripeActivationCode, char stripeAccountURL, char email, char emailVerified, char name, char contact, char password, char address_line1, char address_line2, char address_country, char address_postal, char companyName, char companyContact, char companyUEN, char company_address_line1, char company_address_line2, char company_address_country, char company_address_postal, Boolean is_facebook, Boolean is_google) {
        this.merchant_id = merchant_id;
        this.banner_image = banner_image;
        this.profile_pic = profile_pic;
        this.stripeAccountID = stripeAccountID;
        this.stripeActivationCode = stripeActivationCode;
        this.stripeAccountURL = stripeAccountURL;
        this.email = email;
        this.emailVerified = emailVerified;
        this.name = name;
        this.contact = contact;
        this.password = password;
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.address_country = address_country;
        this.address_postal = address_postal;
        this.companyName = companyName;
        this.companyContact = companyContact;
        this.companyUEN = companyUEN;
        this.company_address_line1 = company_address_line1;
        this.company_address_line2 = company_address_line2;
        this.company_address_country = company_address_country;
        this.company_address_postal = company_address_postal;
        this.is_facebook = is_facebook;
        this.is_google = is_google;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public char getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(char banner_image) {
        this.banner_image = banner_image;
    }

    public char getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(char profile_pic) {
        this.profile_pic = profile_pic;
    }

    public char getStripeAccountID() {
        return stripeAccountID;
    }

    public void setStripeAccountID(char stripeAccountID) {
        this.stripeAccountID = stripeAccountID;
    }

    public char getStripeActivationCode() {
        return stripeActivationCode;
    }

    public void setStripeActivationCode(char stripeActivationCode) {
        this.stripeActivationCode = stripeActivationCode;
    }

    public char getStripeAccountURL() {
        return stripeAccountURL;
    }

    public void setStripeAccountURL(char stripeAccountURL) {
        this.stripeAccountURL = stripeAccountURL;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(char emailVerified) {
        this.emailVerified = emailVerified;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getContact() {
        return contact;
    }

    public void setContact(char contact) {
        this.contact = contact;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public char getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(char address_line1) {
        this.address_line1 = address_line1;
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

    public char getCompanyName() {
        return companyName;
    }

    public void setCompanyName(char companyName) {
        this.companyName = companyName;
    }

    public char getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(char companyContact) {
        this.companyContact = companyContact;
    }

    public char getCompanyUEN() {
        return companyUEN;
    }

    public void setCompanyUEN(char companyUEN) {
        this.companyUEN = companyUEN;
    }

    public char getCompany_address_line1() {
        return company_address_line1;
    }

    public void setCompany_address_line1(char company_address_line1) {
        this.company_address_line1 = company_address_line1;
    }

    public char getCompany_address_line2() {
        return company_address_line2;
    }

    public void setCompany_address_line2(char company_address_line2) {
        this.company_address_line2 = company_address_line2;
    }

    public char getCompany_address_country() {
        return company_address_country;
    }

    public void setCompany_address_country(char company_address_country) {
        this.company_address_country = company_address_country;
    }

    public char getCompany_address_postal() {
        return company_address_postal;
    }

    public void setCompany_address_postal(char company_address_postal) {
        this.company_address_postal = company_address_postal;
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
