package design_pattern.behavioral.iterator.example2;

import design_pattern.behavioral.iterator.example2.aggregate.NameRepository;

public class IteratorMain {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
