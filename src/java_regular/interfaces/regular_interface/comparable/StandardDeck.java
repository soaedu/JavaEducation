package java_regular.interfaces.regular_interface.comparable;

import java.util.*;
import java.util.stream.Collectors;

public class StandardDeck implements Deck {
    private List<Card> entireDeck;

    public StandardDeck(List<Card> existingList) {
        this.entireDeck = existingList;
    }

    public StandardDeck() {
        System.out.println("\nCreating deck:");
        this.entireDeck = new ArrayList<>();
        for (Card.Suit suit: Card.Suit.values()) {
            for (Card.Rank rank: Card.Rank.values()) {
                this.entireDeck.add(new CardImpl(rank, suit));
            }
        }
    }

    public Deck deckFactory() {
        return new StandardDeck(new ArrayList<>());
    }

    public int size() {
        return entireDeck.size();
    }

    public List<Card> getCards() {
        return entireDeck;
    }

    public void addCard(Card card) {
        entireDeck.add(card);
    }

    public void addCards(List<Card> cards) {
        entireDeck.addAll(cards);
    }


    public void addDeck(Deck deck) {
        List<Card> listToAdd = deck.getCards();
        entireDeck.addAll(listToAdd);
    }

    public void sort() {
        Collections.sort(entireDeck);
    }

    public void sort(Comparator<Card> c) {
        Collections.sort(entireDeck, c);
    }

    public void shuffle() {
        Collections.shuffle(entireDeck);
    }

    public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
        int cardsDealt = players * numberOfCards;
        int sizeOfDeck = entireDeck.size();
        if (cardsDealt > sizeOfDeck) {
            throw new IllegalArgumentException(
                    "Number of players (" + players +
                            ") times number of cards to be dealt (" + numberOfCards +
                            ") is greater than the number of cards in the deck (" +
                            sizeOfDeck + ").");
        }

        Map<Integer, List<Card>> dealtDeck = entireDeck
                .stream()
                .collect(
                        Collectors.groupingBy(
                                card -> {
                                    int cardIndex = entireDeck.indexOf(card);
                                    if (cardIndex >= cardsDealt) return (players + 1);
                                    else return (cardIndex % players) + 1;
                                }));

        // Convert Map<Integer, List<Card>> to Map<Integer, Deck>
        Map<Integer, Deck> mapToReturn = new HashMap<>();

        for (int i = 1; i <= (players + 1); i++) {
            Deck currentDeck = deckFactory();
            currentDeck.addCards(dealtDeck.get(i));
            mapToReturn.put(i, currentDeck);
        }
        return mapToReturn;
    }

    public String deckToString() {
        return this.entireDeck
                .stream()
                .map(Card::toString)
                .collect(Collectors.joining("\n"));
    }

    public void print() {
        System.out.println(deckToString());
    }
}
