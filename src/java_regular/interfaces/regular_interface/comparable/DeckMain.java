package java_regular.interfaces.regular_interface.comparable;

import java.util.Comparator;

public class DeckMain {
    public static void main(String... args) {
        StandardDeck myDeck = new StandardDeck();
        myDeck.sort();

        System.out.println("\n======================================");
        System.out.println("Sorted deck: ");
        myDeck.print();
        myDeck.shuffle();

        // #1
        myDeck.sort(new SortByRankThenSuit());

        // #2 - Lambda expression
        myDeck.sort((firstCard, secondCard) ->
                        firstCard.getRank().value() - secondCard.getRank().value());

        // #3 - Lambda expression
        myDeck.sort(Comparator.comparing((card) -> card.getRank()));

        // #4 - Method reference
        myDeck.sort(Comparator.comparing(Card::getRank));

        // #5
        // Comparator instance that could compare objects with more than one criteria
        myDeck.sort(
            (firstCard, secondCard) -> {
                int compare = firstCard.getRank().value() - secondCard.getRank().value();

                if (compare != 0)
                    return compare;
                else
                    return firstCard.getSuit().value() - secondCard.getSuit().value();
            }
        );

        // #6
        myDeck.sort(Comparator.comparing(Card::getRank)
                        //reversed()
                        .thenComparing(Comparator.comparing(Card::getSuit)));

        System.out.println();
        System.out.println("======================================");
        System.out.println("Sorted by rank, then by suit: ");
        System.out.println();
        System.out.println(myDeck.deckToString());
        myDeck.shuffle();
        myDeck.sort(Comparator.comparing(Card::getRank).thenComparing(Comparator.comparing(Card::getSuit)));

        System.out.println();
        System.out.println("===================================================================");
        System.out.println("Sorted by rank, then by suit " + "with static and default methods: ");
        System.out.println();
        System.out.println(myDeck.deckToString());
        myDeck.sort(Comparator.comparing(Card::getRank)
                .reversed()
                .thenComparing(Comparator.comparing(Card::getSuit)));

        System.out.println();
        System.out.println("===========================================================================");
        System.out.println("Sorted by rank reversed, then by suit " + "with static and default methods: ");
        System.out.println();
        System.out.println(myDeck.deckToString());
    }
}
