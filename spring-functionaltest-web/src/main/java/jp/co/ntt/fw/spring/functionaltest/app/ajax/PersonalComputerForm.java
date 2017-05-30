/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.fw.spring.functionaltest.app.ajax;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonalComputerForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(min = 1, max = 50)
    private String personalComputerName;

    @NotNull
    @Size(min = 1, max = 50)
    private String os;

    @NotNull
    @Size(min = 1, max = 50)
    private String cpu;

    @NotNull
    @Size(min = 1, max = 50)
    private String ram;

    @NotNull
    @Size(min = 1, max = 50)
    private String videocard;

    @NotNull
    @Size(min = 1, max = 50)
    private String hdd;

    @NotNull
    @Size(min = 1, max = 50)
    private String power;

    @NotNull
    private int price;

    public String getPersonalComputerName() {
        return personalComputerName;
    }

    public void setPersonalComputerName(String personalComputerName) {
        this.personalComputerName = personalComputerName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}