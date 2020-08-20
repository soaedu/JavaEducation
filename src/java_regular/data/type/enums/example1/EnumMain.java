package java_regular.data.type.enums.example1;

public class EnumMain {
    public static void main(String[] args) {
        Faculty faculty = Faculty.GEO;
        FacultyWithHead facultyWithHead = FacultyWithHead.valueOf(faculty.name());

        String result = null;

        switch(faculty) {
            case GEO:
            case MMF:   result = "\tname: " +faculty.name() +
                                 "\n\thead: " +facultyWithHead.getName();
                        break;
            // case LAW: result = current.name(); // ошибка компиляции
            default:    result = "undefined";
        }

        if (result != null) {
            System.out.println("Faculty:\n" +result);
        }
    }
}


