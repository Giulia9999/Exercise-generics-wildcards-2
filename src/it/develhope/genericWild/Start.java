package it.develhope.genericWild;

public class Start {
    public static void main(String[] args){
        GenericsClass<Integer> firstElement = new GenericsClass<>();
        GenericsClass<Integer> secondElement = new GenericsClass<>();

        GenericsClass<String> thirdElement  = new GenericsClass<>();
        GenericsClass<String> fourthElement = new GenericsClass<>();

        firstElement.setT(12);
        secondElement.setT(13);

        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");
    }
}
