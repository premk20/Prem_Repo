package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Amstrong {

public static void main(String args[]) throws NumberFormatException,
IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int number = Integer.parseInt(br.readLine());

// int number = new Scanner(System.in).nextInt();
       //the sum of the cubes of its digits is equal to the number itself
if (isAmstrong(number)) {
System.out.println("amstrong");
}

else {
System.out.println("not amstrong");
}

}

//371 ams no
private static boolean isAmstrong(int number) {
int original = number;
int result = 0;

while (number != 0) {
int remainder = number % 10;
result = result + remainder * remainder * remainder;
number = number / 10;
}
if (original == result) {
System.out.println(result);
return true;
}

return false;
}

}
