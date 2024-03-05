package Zad_24_Basket;

public class Main {

    // Zadanie 24
    /* Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku.
    Dodaj metodę addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1)
    oraz metodę removeFromBasket(), która usuwa element z koszyka (zmniejszając aktualny stan o 1).

Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia
przy stanie 0 lub dodania przy stanie 10,
rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException). */


    public static void main(String[] args) {

        Element element = new Element("1");
        Element element1 = new Element("2");
        Element element2 = new Element("3");
        Element element3 = new Element("4");
        Element element4 = new Element("5");
        Element element5 = new Element("6");
        Element element6 = new Element("7");
        Element element7 = new Element("8");
        Element element8 = new Element("9");
        Element element9 = new Element("10");
        Element element10 = new Element("11");


        Basket basket = new Basket();
        /*basket.addToBasket(element);
        basket.removeFromBasket(element);
        basket.removeFromBasket(element);*/

        basket.addToBasket(element);
        basket.addToBasket(element1);
        basket.addToBasket(element2);
        basket.addToBasket(element3);
        basket.addToBasket(element4);
        basket.addToBasket(element5);
        basket.addToBasket(element6);
        basket.addToBasket(element7);
        basket.addToBasket(element8);
        basket.addToBasket(element9);
        basket.addToBasket(element9);
        basket.addToBasket(element9);


    }
}
