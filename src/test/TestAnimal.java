package test;

import domain.Dinosaur;

public class TestAnimal  {

    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur("Igor");
        System.out.println(dinosaur);
        dinosaur.kills();
        dinosaur.eat();
        dinosaur.speak();
        dinosaur.scare();
    }
}
