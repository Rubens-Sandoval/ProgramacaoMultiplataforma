package factoryMethod2;

public class FiatConcretCreator extends CarCreator {
    protected Car factoryMethod(){
        return new ConcretProductPalio();
    }
}
