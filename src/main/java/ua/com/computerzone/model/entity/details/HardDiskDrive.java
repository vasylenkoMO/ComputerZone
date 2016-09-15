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
@Table(name = "hard_drive_disks")
public class HardDiskDrive extends Unit {

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "speed")
    private int speed;

    @OneToMany(mappedBy = "hardDriveDisk")
    private Set<PersonalComputer> personalComputers = new HashSet<>();
    public HardDiskDrive() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public Set<PersonalComputer> getPersonalComputers() {
        return personalComputers;
    }

    public void setPersonalComputers(Set<PersonalComputer> personalComputers) {
        this.personalComputers = personalComputers;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
