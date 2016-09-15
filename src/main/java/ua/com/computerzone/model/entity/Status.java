package ua.com.computerzone.model.entity;

import ua.com.computerzone.model.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vastl271nko on 08.09.16.
 */
@Entity
@Table(name = "statuses")
public class Status extends Model {

    @NotNull
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "source")
    private Set<Client> clients = new HashSet<Client>();

    @OneToMany(mappedBy = "status")
    private Set<OrderHistory> orderHistories = new HashSet<>();

    public Status() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<OrderHistory> getOrderHistories() {
        return orderHistories;
    }

    public void setOrderHistories(Set<OrderHistory> orderHistories) {
        this.orderHistories = orderHistories;
    }
}
