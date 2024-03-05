package Zad_24_Basket;

import java.util.LinkedList;
import java.util.List;

public class Basket {

    private Element element;
    private List<Element> elementList;

    public Basket() {
        this.elementList = new LinkedList<>();
    }

    public void addToBasket(Element element) {
        if (elementList.size() < 10) {
            elementList.add(element);
        } else {
            throw new BasketFullException();
        }
    }

    public void removeFromBasket(Element element) {
        if (elementList.size() >= 1) {
            elementList.remove(element);
        } else {
            throw new BasketEmptyException();
        }
    }


    public static class BasketFullException extends RuntimeException {}
    public static class BasketEmptyException extends RuntimeException {}

}

