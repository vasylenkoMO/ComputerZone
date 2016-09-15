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
@Table(name = "random_access_memories")
public class RandomAccessMemory extends Unit {

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "frequency")
    private int frequency;

    @OneToMany(mappedBy = "randomAccessMemory")
    private Set<PersonalComputer> personalComputers = new HashSet<>();

    public RandomAccessMemory() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Set<PersonalComputer> getPersonalComputers() {
        return personalComputers;
    }

    public void setPersonalComputers(Set<PersonalComputer> personalComputers) {
        this.personalComputers = personalComputers;
    }
}
