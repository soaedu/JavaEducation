package design_pattern.behavioral.iterator.example1.aggregate;

import design_pattern.behavioral.iterator.example1.Iterator;

// Aggregate
public interface Container {
    Iterator getIterator();
}
