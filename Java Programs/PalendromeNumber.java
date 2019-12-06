package Programs;

public class PalendromeNumber {

/**
* @param args
*/

int reverse = 0, original = 0;

public void execute(int num) {
original = num;
while (num != 0) {
reverse = reverse * 10;
reverse = reverse + num % 10; // get remainder
num = num / 10;

}
if (original == reverse) {
System.out.println("Reverse of entered number is palindrome "
+ reverse);
} else {
System.out.println("Reverse of entered number is not palindrome  "
+ reverse);
}

}

public static void main(String[] args) {
PalendromeNumber obj = new PalendromeNumber();
obj.execute(121);

}
}