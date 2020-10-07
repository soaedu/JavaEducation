package design_pattern.behavioral.iterator.example2.aggregate;

import design_pattern.behavioral.iterator.example2.Iterator;

// Aggregate
public interface Container {
    public Iterator getIterator();
}
