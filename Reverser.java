import java.util.Scanner;
public class Reverser {
    public static void main(String[] args) {
        System.out.println("Type the phrase you would like to reverse");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int length = word.length();
        String backwards = "";
        for (int i = length-1; i>=0; i--) {
            backwards = backwards + word.charAt(i);
        }
        System.out.println(backwards);
        in.close();
    }
}
