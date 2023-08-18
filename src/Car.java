public abstract class Car implements FuelStation{
    protected String brand;
    protected String model;
    protected String color;
    protected String carBody;
    protected Integer wheels;
    protected String fuelType;
    protected String transmissionType;
    protected Double engineCapacity;

    public Car(String brand, String model, String color, String carBody, Integer wheels, String fuelType,
               String transmissionType, Double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.carBody = carBody;
        this.wheels = wheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public abstract void move();

    public abstract void service();


    public abstract void shiftGear();


    public abstract void turnOnLights();


    public abstract void turnOnWipers();

    public void refuel() {
        System.out.println(brand + " " + model + " is refueling.");
    }

    @Override
    public void cleanWindshield() {
        System.out.println(brand + " " + model + " windshield is being cleaned.");
    }

    @Override
    public void cleanHeadlights() {
        System.out.println(brand + " " + model + " headlights are being cleaned.");
    }

    @Override
    public void cleanMirrors() {
        System.out.println(brand + " " + model + " mirrors are being cleaned.");
    }
}