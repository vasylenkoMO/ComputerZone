package ua.com.computerzone.model.entity;

import ua.com.computerzone.model.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vastl271nko on 08.09.16.
 */
@Entity
@Table(name = "orders")
public class Order extends Model {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "number")
    private int number;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "date_modified")
    private Date dateModified;

    @Column(name = "sale_sum")
    private Double saleSum;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn( name = "client_id", referencedColumnName = "id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn( name = "status_id", referencedColumnName = "id")
    private Status status;

    @OneToMany(mappedBy = "order")
    private Set<OrderHistory> orderHistories = new HashSet<OrderHistory>();

    @OneToMany(mappedBy = "order")
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Double getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(Double saleSum) {
        this.saleSum = saleSum;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<OrderHistory> getOrderHistories() {
        return orderHistories;
    }

    public void setOrderHistories(Set<OrderHistory> orderHistories) {
        this.orderHistories = orderHistories;
    }

    public Set<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(Set<ShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }
}
