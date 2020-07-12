package pl.jedrzejczak.cpudatabaseapi;

import javax.persistence.*;

@Entity
public class SocketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String socketname;
    @ManyToOne
    private BrandEntity brand;


    //=================
    //Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSocketName() {
        return socketname;
    }

    public void setSocketName(String socketName) {
        this.socketname = socketName;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }
}
