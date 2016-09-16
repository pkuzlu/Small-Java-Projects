/**
 * Created by pkuzlu on 9/16/2016.
 */
import java.util.*;

public class CeasersCipher {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[2];

        // Enter the cipher first and then a number to replace the each letter in cipher by the letter this number of positions down the alphabet
        for(int i = 0; i < inputs.length; i++) {
            System.out.println("Enter next var: ");
            inputs[i] = scanner.next();
        }

        StringBuffer mutableInput = new StringBuffer(inputs[0]);
        int pos = Integer.parseInt(inputs[1]);


        for(int i=0; i<mutableInput.length(); i++)
        {
            mutableInput.setCharAt(i, (char)(Character.valueOf(mutableInput.charAt(i)) + pos));
        }

        System.out.println(mutableInput);
    }


    }

