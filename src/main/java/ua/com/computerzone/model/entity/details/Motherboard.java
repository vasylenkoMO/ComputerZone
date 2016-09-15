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
@Table(name = "motherboards")
public class Motherboard extends Unit {

    @Column(name = "chispset")
    private String chipset;

    @OneToMany(mappedBy = "motherboard")
    private Set<PersonalComputer> personalComputers = new HashSet<>();

    public Motherboard() {

    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public Set<PersonalComputer> getPersonalComputers() {
        return personalComputers;
    }

    public void setPersonalComputers(Set<PersonalComputer> personalComputers) {
        this.personalComputers = personalComputers;
    }
}
