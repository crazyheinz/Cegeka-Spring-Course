package com.cegeka.springcourse.axon.command.event;

import java.util.Objects;

public class HighEmissionDriverCreatedEvent {

    private String licensePlate;
    private int emissionScore;
    private String carBrand;
    private String carType;


    public HighEmissionDriverCreatedEvent(String licensePlate, int emissionScore, String carBrand, String carType) {
        this.licensePlate = licensePlate;
        this.emissionScore = emissionScore;
        this.carBrand = carBrand;
        this.carType = carType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getEmissionScore() {
        return emissionScore;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HighEmissionDriverCreatedEvent that = (HighEmissionDriverCreatedEvent) o;
        return emissionScore == that.emissionScore &&
                Objects.equals(licensePlate, that.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate, emissionScore);
    }
}