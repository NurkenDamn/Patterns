package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone = SmartPhoneFactory.getInstance("iphone", "13 Pro Max");
        System.out.println(iPhone);

        SmartPhone samsung = SmartPhoneFactory.getInstance("samsung", "S20 Galaxy");
        System.out.println(samsung);
    }
}