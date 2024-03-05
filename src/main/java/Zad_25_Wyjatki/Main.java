package Zad_25_Wyjatki;



public class Main {

    // Zadanie 24
    /* Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku.
    Dodaj metodę addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1)
    oraz metodę removeFromBasket(), która usuwa element z koszyka (zmniejszając aktualny stan o 1).

Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia
przy stanie 0 lub dodania przy stanie 10,
rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException). */

    /* Zadanie 25.
Zamień wyjątki BasketFullException oraz BasketEmptyException z poprzedniego zadania na wyjątki typu checked exception.
Obsłuż je. */


    /*public static void main(String[] args) {

        Zad_24_Basket.Element element = new Zad_24_Basket.Element("1");
        Zad_24_Basket.Element element1 = new Zad_24_Basket.Element("2");
        Zad_24_Basket.Element element2 = new Zad_24_Basket.Element("3");
        Zad_24_Basket.Element element3 = new Zad_24_Basket.Element("4");
        Zad_24_Basket.Element element4 = new Zad_24_Basket.Element("5");
        Zad_24_Basket.Element element5 = new Zad_24_Basket.Element("6");
        Zad_24_Basket.Element element6 = new Zad_24_Basket.Element("7");
        Zad_24_Basket.Element element7 = new Zad_24_Basket.Element("8");
        Zad_24_Basket.Element element8 = new Zad_24_Basket.Element("9");
        Zad_24_Basket.Element element9 = new Zad_24_Basket.Element("10");
        Zad_24_Basket.Element element10 = new Element("11");


        Zad_24_Basket.Basket basket = new Basket();
        basket.addToBasket(element);
        basket.removeFromBasket(element);
        try {
            basket.removeFromBasket(element);
        } catch (Zad_25_Wyjatki.Basket.BasketEmptyException);

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
        try {
            basket.addToBasket(element9);
        } catch (Zad_25_Wyjatki.Basket.BasketFullException e) {
            e.printStackTrace();
        }


    }*/
}
