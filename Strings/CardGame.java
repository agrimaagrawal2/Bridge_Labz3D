package Level3;

import java.util.Scanner;

public class CardGame {

    // Suits and Ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                              "Jack", "Queen", "King", "Ace"};

    // Method to initialize deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            // Swap deck[i] with deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cannot distribute " + n + " cards equally to " + players + " players.");
            return null;
        }
        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    // Method to print cards of players
    public static void printPlayers(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("   " + card);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();

        // Distribute cards
        String[][] distributed = distributeCards(deck, n, players);

        // Print cards of players
        printPlayers(distributed);
    }
}
