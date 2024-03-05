package Zad_25_Wyjatki;

import Zad_24_Basket.Element;

import java.util.LinkedList;
import java.util.List;

public class Basket {

    private Element element;
    private List<Element> elementList;
    //private int state = elementList.i;

    public Basket() {
        this.elementList = new LinkedList<>();
    }

    public void addToBasket(Element element) {
        if (elementList.size() < 10) {
            elementList.add(element);
        } else {
            //throw new BasketFullException();
        }
    }

    public void removeFromBasket(Element element) {
        if (elementList.size() >= 1) {
            elementList.remove(element);
        } else {
            //throw new BasketEmptyException();
        }
    }


    public static class BasketFullException extends Exception {} // Exception jest checked...robimy RunTime kiedy unchecked
    public static class BasketEmptyException extends Exception {}

}
