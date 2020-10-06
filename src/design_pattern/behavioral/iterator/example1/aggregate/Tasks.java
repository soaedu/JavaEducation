package design_pattern.behavioral.iterator.example1.aggregate;

import design_pattern.behavioral.iterator.example1.Iterator;

// Concrete Aggregate
public class Tasks implements Container {
    String[] tasks = {
            "Build a house",
            "Born a child",
            "Plant a tree"
    };

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    // Concrete Iterator
    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return (index < tasks.length);
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
