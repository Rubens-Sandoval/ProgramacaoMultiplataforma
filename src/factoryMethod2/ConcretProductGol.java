package factoryMethod2;

public class ConcretProductGol extends Car {
    public ConcretProductGol() {
        this.setModel("Gol");
        this.setFactory("Volks");
        this.setCategory("Hatch");
        this.showInformation();
    }
}