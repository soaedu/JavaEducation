package design_pattern.behavioral.iterator;

import design_pattern.behavioral.iterator.aggregate.Tasks;

public class IteratorMain {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Iterator tasksIterator = tasks.getIterator();

        while(tasksIterator.hasNext()) {
            System.out.println((String) tasksIterator.next());
        }
    }
}
