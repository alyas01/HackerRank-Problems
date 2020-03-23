import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        char[] stringAnalysis = s.toCharArray(); //create chars array of String 
        //creating values of rows and columns 
        //lower is rows and higher is columns 
        float sqrtValue = Math.sqrt(stringAnalysis.length); //square root the array length 
        int lower = Math.floor(sqrtValue); 
        int higher = Math.ceil(sqrtValue); 

        //logic behind providing the output 
        for(int a; a<stringAnalysis.length; a++)
        {
            for (int b = 0; b<higher; b++)
            {
                for (int c =0; c<lower; c++)
                {
                    outputResult [b][c] = stringAnalysis[a]; 
                }

            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
