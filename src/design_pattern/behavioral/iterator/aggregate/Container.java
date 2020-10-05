package design_pattern.behavioral.iterator.aggregate;

import design_pattern.behavioral.iterator.Iterator;

// Aggregate
public interface Container {
    Iterator getIterator();
}
