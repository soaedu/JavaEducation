package design_pattern.behavioral.iterator.example1;

import design_pattern.behavioral.iterator.example1.aggregate.Tasks;

public class IteratorMain {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Iterator tasksIterator = tasks.getIterator();

        while(tasksIterator.hasNext()) {
            System.out.println((String) tasksIterator.next());
        }
    }
}
