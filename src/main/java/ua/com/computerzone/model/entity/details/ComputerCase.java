package ua.com.computerzone.model.entity.details;

import ua.com.computerzone.model.Unit;
import ua.com.computerzone.model.entity.PersonalComputer;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vastl271nko on 08.09.16.
 */
@Entity
@Table(name = "computer_cases")
public class ComputerCase extends Unit {

    @OneToMany(mappedBy = "computerCase")
    private Set<PersonalComputer> personalComputers = new HashSet<>();

    public ComputerCase () {

    }

    public Set<PersonalComputer> getPersonalComputers() {
        return personalComputers;
    }

    public void setPersonalComputers(Set<PersonalComputer> personalComputers) {
        this.personalComputers = personalComputers;
    }
}
