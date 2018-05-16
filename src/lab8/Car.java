package lab8;
//1. Color - String
//2. Brand - String
//3. carID - String
//4. Engin (has-a relation) - Engine
public class Car {
    private String coler;
    private  String brand;    private  String carID;
    private  Engine engine;

    //constructor
    public Car (){}
    public Car(String coler, String brand, String carID, Engine engine) {
        this.coler = coler;
        this.brand = brand;
        this.carID = carID;
        this.engine = engine;
    }
    //tostring

    @Override
    public String toString() {
        return "Car{" +
                "coler='" + coler + '\'' +
                ", brand='" + brand + '\'' +
                ", carID='" + carID + '\'' +
                ", engine=" + engine +
                '}';
    }
//getter and setter

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}//class
