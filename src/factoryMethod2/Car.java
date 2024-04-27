package factoryMethod2;

public class Car {
    
    private String model;
    private String factory;
    private String category;

    public void showInformation(){
        System.out.println("Model: " + this.getModel() + "\nFactory" + this.getFactory() + "\nCategory: " + this.getCategory());

    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFactory(){
        return factory;
    }

    public void setFactory(String factory){
        this.factory = factory;
    }
}