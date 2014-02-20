import java.util.*;

public class DialAHero {

    private static ArrayList<String> heroes = new ArrayList<String>() {
        {
            add("SUPERMAN");
            add("THOR");
            add("ROBIN");
            add("IRONMAN");
            add("GHOSTRIDER");
            add("CAPTAINAMERICA");
            add("FLASH");
            add("WOLVERINE");
            add("BATMAN");
            add("HULK");
            add("BLADE");
            add("PHANTOM");
            add("SPIDERMAN");
            add("BLACKWIDOW");
            add("HELLBOY");
            add("PUNISHER");
        }
    };

    private static HashMap<Integer, String> phoneKeypad = new HashMap<Integer, String>();

    static {
        phoneKeypad.put(2, "ABC");
        phoneKeypad.put(3, "DEF");
        phoneKeypad.put(4, "GHI");
        phoneKeypad.put(5, "JKL");
        phoneKeypad.put(6, "MNO");
        phoneKeypad.put(7, "PQRS");
        phoneKeypad.put(8, "TUV");
        phoneKeypad.put(9, "WXYZ");
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        String heroNumber = scanner.next();

        if (isAHeroCall(firstDigit)) {
            List<String> listOfWords = convertHeroNumber(heroNumber);
            matchAgainstHeroes(listOfWords);
        } else {
            System.out.println("Dial A Hero format is: 0 <number of hero>");
        }
    }

    private static boolean isAHeroCall(int firstDigit) {
        return (firstDigit == 0);
    }

    private static List<String> convertHeroNumber(String heroNumber) {
        List<String> letters = getLettersForPhoneDigit(heroNumber);
        return letters;
    }

    private static void outputHeroCalls(List<String> listOfWords) {
        for (String word : listOfWords) {
            if (heroes.contains(word)) {
                System.out.println(word);
            }
        }
    }

    private static List<String> getLettersForPhoneDigit(String heroNumber) {
        List<String> phoneLetters = new ArrayList<String>();
        for (char numberKey : heroNumber.toCharArray()) {
            phoneLetters.add(phoneKeypad.get(Character.getNumericValue(numberKey)));
        }
        return phoneLetters;
    }

    private static void matchAgainstHeroes(List<String> listOfWords) {
        for (String word : listOfWords) {
            System.out.println(word);
        }
    }
}
