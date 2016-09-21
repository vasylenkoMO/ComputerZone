package ua.com.computerzone.model;

import ua.com.computerzone.model.entity.Category;
import ua.com.computerzone.model.entity.ShoppingCart;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Created by vastl271nko on 08.09.16.
 */

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Unit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private int id;

    @NotNull
    @Size(min = 2, max = 100)
    @Column(name = "manufacture")
    private String manufacture;

    @Size(min = 2, max = 100)
    @Column(name = "model")
    private String model;

    @NotNull
    @Column(name = "price")
    private double price;

    @Size(max = 100)
    @Column(name = "url")
    private String url;

    @Size
    @Column(name = "amount")
    private int amount;

    private int category;

    @OneToMany(mappedBy = "unit")
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public Unit() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Set<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(Set<ShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }
}
