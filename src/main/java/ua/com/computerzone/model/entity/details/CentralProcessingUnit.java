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
@Table(name = "central_processing_units")
public class CentralProcessingUnit extends Unit {

    @Column(name = "frequency")
    private double frequency;

    @Column(name = "core_amount")
    private int coreAmount;

    @OneToMany(mappedBy = "centralProcessingUnit")
    private Set<PersonalComputer> personalComputers = new HashSet<>();

    public CentralProcessingUnit() {
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCoreAmount() {
        return coreAmount;
    }

    public void setCoreAmount(int coreAmount) {
        this.coreAmount = coreAmount;
    }

    public Set<PersonalComputer> getPersonalComputers() {
        return personalComputers;
    }

    public void setPersonalComputers(Set<PersonalComputer> personalComputers) {
        this.personalComputers = personalComputers;
    }
}
