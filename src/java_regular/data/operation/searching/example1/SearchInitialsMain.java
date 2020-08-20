package java_regular.data.operation.searching.example1;

public class SearchInitialsMain {
    public static void main(String[] args) {
        StringBuilder myInitials = new StringBuilder();

        String myName = "Fred F. Flintstone";
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("\nMy initials are: " + myInitials);
    }
}
