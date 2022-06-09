package com.company;

public final class Parrot extends Pet {
    private String color;

    public Parrot(String name, String color, Shelter shelter, EnumClass enumClass) {
        super(name, enumClass, shelter);
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void voice(){
        System.out.println("Голос: чирик-чирик ");
    }


    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nColor: " + color;
    }
}
