package java_regular.data.type.enums.example4;

public class Deck {
    private static Card[] cardArr;

    Deck() {
        populateDeck();
    }

    private void populateDeck() {
        cardArr = new Card[52];

        int i = 0;

        for (SuitEnum suit: SuitEnum.values()) {
            for (RankEnum rank: RankEnum.values()) {
                cardArr[i++] = new Card(rank, suit);
            }
        }
    }

    public void printDeck() {
        StringBuilder sb = new StringBuilder("\nDeck:");

        if (cardArr != null && cardArr.length > 0) {
            int pos = 1;
            for (Card card : cardArr) {
                sb.append("\n\tCard(" +pos+ "): \t" +card.toString());
                pos++;
            }
        } else {
            sb.append("\n\tis empty");
        }

        System.out.println(sb.toString());
    }

    static class Card {
        private final RankEnum rank;
        private final SuitEnum suit;

        public Card(RankEnum rank, SuitEnum suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public String toString() {
            return rank + " of " + suit;
        }
    }

    enum RankEnum {
        DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    enum SuitEnum {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }
}
