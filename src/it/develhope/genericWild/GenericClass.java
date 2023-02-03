package it.develhope.genericWild;

public class GenericClass<T> {
    private T t;

    public T getT(){
        return t;
    }

    public void setT(T valueToSet){
        this.t = valueToSet;
    }
}
