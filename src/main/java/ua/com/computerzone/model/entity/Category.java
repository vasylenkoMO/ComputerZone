package ua.com.computerzone.model.entity;

import ua.com.computerzone.model.Model;
import ua.com.computerzone.model.Unit;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vastl271nko on 08.09.16.
 */
@Entity
@Table(name = "categories")
public class Category extends Model {

    @Size(min =  2, max = 100)
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Unit> units = new HashSet<>();

    @OneToMany(mappedBy = "category")
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public Category() {
    }

    public Category(int id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Unit> getUnits() {
        return units;
    }

    public void setUnits(Set<Unit> units) {
        this.units = units;
    }
}
