package factoryMethod2;

import javax.swing.JOptionPane;

public class Client {

    public static void main(String[] args){

        CarCreator creator1 = new FiatConcretCreator();
        creator1.buildCar();

        CarCreator creator2 = new VolksConcretCreator();
        creator2.buildCar();
    }
}