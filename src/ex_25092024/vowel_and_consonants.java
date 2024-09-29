package ex_25092024;

public class vowel_and_consonants {
    public static void main(String[] args) {

        String name = "PrAmod";
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowels++;
            }
            else
                consonants++;
            }
            System.out.println("Vowels count is " + vowels);
            System.out.println("consonants count is " + consonants);
        }
    }