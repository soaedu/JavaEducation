package java_regular.data.type.classes.type.character;

public class CharacterMain {
    public static void main(String[] args) {
        char ch = '8';

        Character objCharacter = new Character(ch);
        System.out.println("\nValue = " +objCharacter.charValue());

        // isDefined(), isLowerCase(), isJavaIdentifierStart()
        System.out.println("\nCharacter:" +
                "\n\t\"A\" as number is: " +Character.digit('A',16)+
                "\n\t\"A\" is lowercase: " +Character.isLowerCase('A')+
                "\n\t\"8\" is Unicode symbol: " +Character.isDefined('8')+
                "\n\t\"+\" can be the first symbol of identifier: " +Character.isJavaIdentifierStart('+')
        );
    }
}
