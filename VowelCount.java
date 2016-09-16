import java.util.*;

/**
 * Created by pkuzlu on 9/16/2016.
 */
public class VowelCount {

    public static void main(String[] args) {

        System.out.println("Enter a string to count vowels: ");
        Scanner reader = new Scanner(System.in);
        String input = reader.next().toLowerCase();
        int counter = 0;

        for(int i =0; i<input.length(); i++)
        {
            switch (input.charAt((i)))
            {
                case 'a' :
                {
                    counter++;
                    break;
                }

                case 'e' :
                {
                    counter++;
                    break;
                }

                case 'i' :
                {
                    counter++;
                    break;
                }

                case 'o' :
                {
                    counter++;
                    break;
                }

                case 'u' :
                {
                    counter++;
                    break;
                }
            }
        }

        System.out.println(counter);
    }
}
