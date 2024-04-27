package factoryMethod2;

public class ConcretProductPalio extends Car{
    public ConcretProductPalio() {
        this.setModel("Palio");
        this.setFactory("Fiat");
        this.setCategory("Hatch");
        this.showInformation();
    }
}