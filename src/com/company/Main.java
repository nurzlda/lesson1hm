package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Мамотенок, ", "Округ И. ");
        System.out.println("Название приюта: " + shelter.getName() + "Адрес приюта: " + shelter.getAddress());

        Cat objectA = new Cat("Йоко", EnumClass.OUTBRED, shelter, "Серый ");
        System.out.println(objectA.getInfo());
        objectA.voice();
        objectA.voice("Мяу-мяу-мяу ");

        Parrot objectB = new Parrot("Голубок ", "Синий ", shelter, EnumClass.THOROUGHBRED );
        System.out.println(objectB.getInfo());
        objectB.voice();

        Parrot objectC = new Parrot("Гриша ", "Зеленый ", shelter, EnumClass.OUTBRED);
        System.out.println(objectC.getInfo());
        objectC.voice();
    }
}
