package ua.com.computerzone.model.entity;

import ua.com.computerzone.model.Unit;
import ua.com.computerzone.model.entity.details.*;

import javax.persistence.*;

/**
 * Created by vastl271nko on 08.09.16.
 */
@Entity
@Table(name = "portable_computer")
public class PortableComputer extends Unit {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cpu_id", referencedColumnName = "id")
    private CentralProcessingUnit centralProcessingUnit;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "gpu_id", referencedColumnName = "id")
    private GraphicsProcessingUnit graphicsProcessingUnit;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "motherboard_id", referencedColumnName = "id")
    private Motherboard motherboard;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "hdd_id", referencedColumnName = "id")
    private HardDiskDrive hardDiskDrive;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ram_id", referencedColumnName = "id")
    private RandomAccessMemory randomAccessMemory;

    public PortableComputer () {

    }

    public CentralProcessingUnit getCentralProcessingUnit() {
        return centralProcessingUnit;
    }

    public void setCentralProcessingUnit(CentralProcessingUnit centralProcessingUnit) {
        this.centralProcessingUnit = centralProcessingUnit;
    }

    public GraphicsProcessingUnit getGraphicsProcessingUnit() {
        return graphicsProcessingUnit;
    }

    public void setGraphicsProcessingUnit(GraphicsProcessingUnit graphicsProcessingUnit) {
        this.graphicsProcessingUnit = graphicsProcessingUnit;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public HardDiskDrive getHardDiskDrive() {
        return hardDiskDrive;
    }

    public void setHardDiskDrive(HardDiskDrive hardDiskDrive) {
        this.hardDiskDrive = hardDiskDrive;
    }

    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }
}
