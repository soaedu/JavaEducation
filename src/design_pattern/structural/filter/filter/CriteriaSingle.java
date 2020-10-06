package design_pattern.structural.filter.filter;

import design_pattern.structural.filter.CONST;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for(Person person: persons) {
            if(person.getMaritalStatus().equalsIgnoreCase(CONST.MaritalStatus.single.toString())) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
