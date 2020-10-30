public class Card {
    // Clubs = Klöver ♣
    // Diamonds = Ruter ♦
    // Hearts = Hjärter ♥
    // Spades = Spader ♠

    //Konstanter = klassvariabler
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 1;
    public static final int SPADES = 3;

    //Instansvariabler / Egenskaper
    public int suit; // Färg - använder konstanterna
    public int rank; // Valör - Heltal mellan 1 och 13

    public static final String[] RANKS = {null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] SUITS_SYMBOLS = {"♣", "♦", "♥", "♠"};
    public static final String[] SUITS_UNICODE = {"\u2667", "\u2662", "\u2661", "\u2664"};


    // Flera konstanter
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static void print(Card c) {
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS[c.suit]);
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS_SYMBOLS[c.suit]);
        System.out.println(Card.RANKS[c.rank] + " of " + Card.SUITS_UNICODE[c.suit]);
    }

    public static Card getInstance(int suit, int rank) {
        Card c = new Card();
        c.suit = suit;
        c.rank = rank;
        return c;
    }

    public static Card getInstance() {
        Card c = new Card();
        c.suit = (int) (Math.random() * 4 );
        c.rank = (int) (Math.random() * 13 ) + 1;
        return c;
    }
}
