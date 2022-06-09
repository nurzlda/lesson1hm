package com.company;

public class Cat extends Pet{
    private String color;

    public Cat(String name, EnumClass enumClass, Shelter shelter, String color) {
        super(name, enumClass, shelter);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void voice(){
        System.out.println("Мяу-мяу");
    }

    public void voice(String voice){
        System.out.println(voice);
    }

    public String getInfo(){
        return "Имя кошки: " + getName() +
                "\nBreed: " + getEnumClass() +
                "\nColor: " + color;
    }

}
