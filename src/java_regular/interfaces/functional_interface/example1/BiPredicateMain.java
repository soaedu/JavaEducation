package java_regular.interfaces.functional_interface.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateMain {
    public static void main(String[] args) {
        // #1 Simple example
        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("kotlin", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false

        // #2 Complex example
        List<Domain> domainList = Arrays.asList(
               new Domain("google.com", 1),
               new Domain("oracle.com", 10),
               new Domain("tutorialspoint.com", 18),
               new Domain("medium.com", 0)
        );

        BiPredicate<String, Integer> biPredicate = (domain, score) -> {
          return (domain.equalsIgnoreCase("google.com") || score == 0);
        };

        // if google or score == 0
        List<Domain> biPredicateResult1 = filterBadDomain(domainList, biPredicate);
        System.out.println(biPredicateResult1); // google.com, medium.com

        //  if score == 0
        List<Domain> biPredicateResult2 = filterBadDomain(domainList, (domain, score) -> score == 0);
        System.out.println(biPredicateResult2); // medium.com

        // if start with i or score > 5
        List<Domain> biPredicateResult3 = filterBadDomain(domainList, (domain, score) -> domain.startsWith("t") &&
                score > 8);
        System.out.println(biPredicateResult3); // tutorialspoint.com

        // chaining with or
        List<Domain> biPredicateResult4 = filterBadDomain(domainList, biPredicate.or(
                (domain, x) -> domain.equalsIgnoreCase("oracle.com"))
        );
        System.out.println(biPredicateResult4); // google.com, medium.com, oracle.com
    }

    public static <T extends Domain> List<T> filterBadDomain(List<T> list, BiPredicate<String, Integer> biPredicate) {
        return list.stream().filter(x -> biPredicate.test(x.getName(), x.getScore()))
                .collect(Collectors.toList());
    }
}

class Domain {
    private String name;
    private Integer score;

    public Domain(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
