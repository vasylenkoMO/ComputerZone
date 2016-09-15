package ua.com.computerzone.model.entity;

import ua.com.computerzone.model.Model;
import ua.com.computerzone.model.Unit;
import ua.com.computerzone.model.entity.details.RandomAccessMemory;

import javax.persistence.*;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Entity
@Table(name = "shopping_carts")
public class ShoppingCart extends Model {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Unit unit;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public ShoppingCart () {

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
