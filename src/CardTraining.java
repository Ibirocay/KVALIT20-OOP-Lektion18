public class CardTraining {
    public static void main(String[] args) {

        System.out.println("---- Kort 1 ----");
        Card c1 = Card.getInstance(Card.SPADES, Card.QUEEN);
        Card.print(c1);

        System.out.println("---- Kort 2 ----");
        Card c2 = Card.getInstance(Card.CLUBS, 7);
        Card.print(c2);

        System.out.println("---- Slumpgenererat kort ----");
        for (int i = 0; i < 10; i++) {
            Card c = Card.getInstance();
            Card.print(c);
        }


    }
}
