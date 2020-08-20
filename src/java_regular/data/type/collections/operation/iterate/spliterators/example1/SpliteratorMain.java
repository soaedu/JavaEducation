package java_regular.data.type.collections.operation.iterate.spliterators.example1;

import Utils.CollectionHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/**
 * Example src: https://www.baeldung.com/java-spliterator
 */
public class SpliteratorMain {
    public static void main(String[] args) {
        List<Author> article1AuthorList = List.of(new Author("Cay S. Horstmann", 12),
                new Author("Joshua Bloch", 13));
        Article article1 = new Article(article1AuthorList, 1000, "Java books");

        List<Author> article2AuthorList = List.of(new Author("Aleksei Sedunov ", 22),
                new Author("Ken Kousen", 23));
        Article article2 = new Article(article2AuthorList, 2000, "Kotlin books");

        ArrayList<Article> articleList = new ArrayList<>(); 
        articleList.add(article1);
        articleList.add(article2);

        // tryAdvance() - used for stepping through a sequence.
        //                  The method takes a "Consumer" that’s used to consume elements of the "Spliterator" one by
        //                  one sequentially and returns "false" if there’re no elements to be traversed.
        call(articleList.spliterator());
        CollectionHelper.printCollection(articleList, "articleList");
    }

    public static String call(Spliterator<Article> spliterator) {
        int current = 0;

        while (spliterator.tryAdvance(a -> a.setName(a.getName().concat("- published by Baeldung")))) {
            current++;
        }

        return Thread.currentThread().getName() + ":" + current;
    }
}
