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
@Table(name = "graphics_processing_units")
public class GraphicsProcessingUnit extends Unit {

    @Column(name = "video_ram")
    private int videoRAM;

    @OneToMany(mappedBy = "graphicsProcessingUnit")
    private Set<PersonalComputer> personalComputers = new HashSet<>();

    public GraphicsProcessingUnit() {
    }

    public int getVideoRAM() {
        return videoRAM;
    }

    public void setVideoRAM(int videoRAM) {
        this.videoRAM = videoRAM;
    }

    public Set<PersonalComputer> getPersonalComputers() {
        return personalComputers;
    }

    public void setPersonalComputers(Set<PersonalComputer> personalComputers) {
        this.personalComputers = personalComputers;
    }

    @Override
    public String toString() {
        return getManufacture() + " " + getModel() + " \n video RAM: " + getVideoRAM() + "\n";
    }
}
