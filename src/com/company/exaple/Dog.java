package com.company.exaple;

public class Dog {

    String name;
    char gender;
    int age;
    boolean fur;
    int legs;
    double weight;
    String furColor;

    public Dog(String name, char gender, int age, int legs, double weight, String furColor) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.legs = legs;
        this.weight = weight;
        this.furColor = furColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
