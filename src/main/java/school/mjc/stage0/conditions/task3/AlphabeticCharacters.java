package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if ("AEIOUaeiou".indexOf(character) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
