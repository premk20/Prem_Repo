package Programs;

public class PrimeNumbers {
public static void main(String[] args) {
//Prime no is greater than 1 and divided by 1 or itself and can't be divided by other no's
// Empty String
String primeNumbers = "";

for (int i = 1; i <= 100; i++) {
int counter = 0;
for (int num = i; num >= 1; num--) {
if (i % num == 0) {
counter = counter + 1;
}
}
if (counter == 2) {
// Appended the Prime number to the String
primeNumbers = primeNumbers + i + " ";
}
}
System.out.println("Prime numbers from 1 to 100 are :" + primeNumbers);

}
}
