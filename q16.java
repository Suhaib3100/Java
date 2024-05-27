import java.util.Scanner;
public class q16
{
    public static int countVowels(char[] message)
    {
        int vowelCount = 0;
        for (char c : message) {
            char lowercase = Character.toLowerCase(c);
            if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u') {
                if (Character.isLetter(lowercase)) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message:");
        String str = sc.nextLine();
        str = str.replaceAll("\\s", "");
        char[] chararray=str.toCharArray();
        System.out.print("Vowel Count:"+countVowels(chararray));
    }
}
