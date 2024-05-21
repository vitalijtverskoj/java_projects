package HomeWork;

import java.util.Objects;

public class Notebook {
    private int id;
    private String manufacturer;
    private int ramCapacity;
    private int screenDiagonal;
    private String processorModel;
    private String videoCardModel;
    private int ssdCapacity;
    private String operatingSystem;

    public Notebook(int id, String manufacturer, int ramCapacity, int screenDiagonal, String processorModel,
            String videoCardModel, int ssdCapacity, String operatingSystem) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.ramCapacity = ramCapacity;
        this.screenDiagonal = screenDiagonal;
        this.processorModel = processorModel;
        this.videoCardModel = videoCardModel;
        this.ssdCapacity = ssdCapacity;
        this.operatingSystem = operatingSystem;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public String getVideoCardModel() {
        return videoCardModel;
    }

    public int getSsdCapacity() {
        return ssdCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public void setVideoCardModel(String videoCardModel) {
        this.videoCardModel = videoCardModel;
    }

    public void setSsdCapacity(int ssdCapacity) {
        this.ssdCapacity = ssdCapacity;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Производитель: %s, Объём оперативной памяти: %d, Диагональ экрана: %d, Модель процессора: %s, Модель видеокарты: %s, Объём SSD: %d, Операционная система: %s",
                id, manufacturer, ramCapacity, screenDiagonal, processorModel, videoCardModel, ssdCapacity,
                operatingSystem);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return id == notebook.id &&
                manufacturer.equals(notebook.manufacturer) &&
                ramCapacity == notebook.ramCapacity &&
                screenDiagonal == notebook.screenDiagonal &&
                processorModel.equals(notebook.processorModel) &&
                videoCardModel.equals(notebook.videoCardModel) &&
                ssdCapacity == notebook.ssdCapacity &&
                operatingSystem.equals(notebook.operatingSystem);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, ramCapacity, screenDiagonal, processorModel, videoCardModel, ssdCapacity,
                operatingSystem);
    }

}
