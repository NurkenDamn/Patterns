package Creational.FactoryMethod;

public abstract class SmartPhone {
    public abstract  String getModelName();

    public String ToString() {
        return "Model: " + this.getModelName();
    }
}
