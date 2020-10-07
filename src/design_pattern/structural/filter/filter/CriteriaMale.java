package design_pattern.structural.filter.filter;

import design_pattern.structural.filter.CONST;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<Person>();

        for(Person person: persons) {
            if(person.getGender().equalsIgnoreCase(CONST.Gender.male.toString())) {
                malePerson.add(person);
            }
        }

        return malePerson;
    }
}
