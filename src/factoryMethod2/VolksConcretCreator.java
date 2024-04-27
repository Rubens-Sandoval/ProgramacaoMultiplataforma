package factoryMethod2;

public class VolksConcretCreator extends CarCreator{
    protected Car factoryMethod(){
        return new ConcretProductGol();
    }
}
