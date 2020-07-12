package pl.jedrzejczak.cpudatabaseapi;

import javax.persistence.*;

@Entity
public class CpuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cpu_id")
    private int id;
    @ManyToOne
    private BrandEntity cpuBrand;
    private String cpuModel;
    @ManyToOne
    private SocketEntity cpuSocket;
    private float cpuFreq;
    private int cpuCores;
    private int cpuThreads;
    private int cpuTdp;
    private float cpuPrice;

    //=================
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BrandEntity getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(BrandEntity cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public SocketEntity getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(SocketEntity cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public float getCpuFreq() {
        return cpuFreq;
    }

    public void setCpuFreq(float cpuFreq) {
        this.cpuFreq = cpuFreq;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public int getCpuThreads() {
        return cpuThreads;
    }

    public void setCpuThreads(int cpuThreads) {
        this.cpuThreads = cpuThreads;
    }

    public int getCpuTdp() {
        return cpuTdp;
    }

    public void setCpuTdp(int cpuTdp) {
        this.cpuTdp = cpuTdp;
    }

    public float getCpuPrice() {
        return cpuPrice;
    }

    public void setCpuPrice(float cpuPrice) {
        this.cpuPrice = cpuPrice;
    }
}
