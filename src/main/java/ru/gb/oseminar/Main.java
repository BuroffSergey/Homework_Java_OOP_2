package ru.gb.oseminar;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        Human human3 = new Human("Petr");
        market.acceptToMarket(human3);
        market.acceptToMarket(human2);
        market.acceptToMarket(human1);
        market.update();
    }
}
