package com.company;

public class Pet {
    private String name;
    private EnumClass enumClass;
    private Shelter shelter;

    public Pet(String name, EnumClass enumClass, Shelter shelter) {
        this.name = name;
        this.enumClass = enumClass;
        this.shelter = shelter;
    }


    public String getName() {
        return name;
    }


    public EnumClass getEnumClass() {
        return enumClass;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public  String getInfo(){
        return "Имя попугая: " + name +
                "\nBreed: " + enumClass;

    }
}
