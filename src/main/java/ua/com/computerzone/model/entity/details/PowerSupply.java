package ua.com.computerzone.model.entity.details;

import ua.com.computerzone.model.Unit;
import ua.com.computerzone.model.entity.PersonalComputer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vastl271nko on 08.09.16.
 */
@Entity
@Table(name = "power_supplies")
public class PowerSupply extends Unit {

    @Column(name = "power")
    private int power;

    @OneToMany(mappedBy = "powerSupply")
    private Set<PersonalComputer> personalComputers = new HashSet<>();

    public PowerSupply() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Set<PersonalComputer> getPersonalComputers() {
        return personalComputers;
    }

    public void setPersonalComputers(Set<PersonalComputer> personalComputers) {
        this.personalComputers = personalComputers;
    }
}
