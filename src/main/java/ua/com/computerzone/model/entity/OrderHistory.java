package ua.com.computerzone.model.entity;

import ua.com.computerzone.model.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Entity
@Table(name = "order_histories")
public class OrderHistory extends Model {

    @Column(name = "sale_sum")
    private double saleSum;

    @Column(name = "active_from")
    private Date activeFrom;

    @Column(name = "active_to")
    private Date activeTo;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn( name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn( name = "status_id", referencedColumnName = "id")
    private Status status;

    public OrderHistory() {

    }

    public double getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(double saleSum) {
        this.saleSum = saleSum;
    }

    public Date getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(Date activeFrom) {
        this.activeFrom = activeFrom;
    }

    public Date getActiveTo() {
        return activeTo;
    }

    public void setActiveTo(Date activeTo) {
        this.activeTo = activeTo;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
