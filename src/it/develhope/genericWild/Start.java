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

        boolean intEquals = GenericsClass.isEqual(firstElement, secondElement);
        boolean stringEquals = GenericsClass.isEqual(thirdElement, fourthElement);
        System.out.printf("first element is equal to second element? %s %n", intEquals);
        System.out.printf("third element is equal to fourth element? %s %n", stringEquals);

    }
}
