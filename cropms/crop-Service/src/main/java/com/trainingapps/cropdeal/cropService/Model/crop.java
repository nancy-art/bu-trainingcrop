package com.trainingapps.cropdeal.cropService.Model;

public class crop {
    private int cropId;
    private String cropType;
    private String cropName;
    private String cropDescription;
    private double price;


    public crop(int cropId, String cropType, String cropName, String cropDescription, double price) {
        this.cropId = cropId;
        this.cropType = cropType;
        this.cropName = cropName;
        this.cropDescription = cropDescription;
        this.price = price;
    }

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCropDescription() {
        return cropDescription;
    }

    public void setCropDescription(String cropDescription) {
        this.cropDescription = cropDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
