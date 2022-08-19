package model;


import java.time.LocalDateTime;

public class Informações {
    
    private String id;
    private String License;
    private String state;
    private String model;
    private String color;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private Double bill;

    public Informações(String id, String license, String state, String model, String color){
       this.id = id;
       this.License = license;
       this.state = state;
       this.model = model;
       this.color = color;
       
    }

    public Informações() {

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicense() {
        return License;
    }
    
    public void setLicense(String License) {
        this.License = License;
    }

    public String getstate() {
        return state;
    }

    public void setState(String State) {
        this.state = State;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public  LocalDateTime getentryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime geteExitDate() {
        return exitDate;
    }

    public void setexitDate(LocalDateTime exitDate) {
        this.exitDate = exitDate;
    }


    public Double getBill() {
        return bill;
    }

    public void setbill(Double bill) {
        this.bill = bill;
    }




}
