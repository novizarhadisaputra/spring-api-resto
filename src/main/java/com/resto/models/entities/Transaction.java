package com.resto.models.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    private String id;

    private String user_id;

    private String seat_id;

    private String voucher_id;

    private String name;

    private String status;

    private Double total_price;

    private Double total_paid;

    private Double total_disc;

    private Timestamp paid_at;

    private Timestamp created_at;

    private Timestamp updated_at;

    public Transaction(String id, String user_id, String seat_id, String voucher_id, String name, String status,
            Double total_price, Double total_paid, Double total_disc, Timestamp paid_at, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.user_id = user_id;
        this.seat_id = seat_id;
        this.voucher_id = voucher_id;
        this.name = name;
        this.status = status;
        this.total_price = total_price;
        this.total_paid = total_paid;
        this.total_disc = total_disc;
        this.paid_at = paid_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(String seat_id) {
        this.seat_id = seat_id;
    }

    public String getVoucher_id() {
        return voucher_id;
    }

    public void setVoucher_id(String voucher_id) {
        this.voucher_id = voucher_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public Double getTotal_paid() {
        return total_paid;
    }

    public void setTotal_paid(Double total_paid) {
        this.total_paid = total_paid;
    }

    public Double getTotal_disc() {
        return total_disc;
    }

    public void setTotal_disc(Double total_disc) {
        this.total_disc = total_disc;
    }

    public Timestamp getPaid_at() {
        return paid_at;
    }

    public void setPaid_at(Timestamp paid_at) {
        this.paid_at = paid_at;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    

}
