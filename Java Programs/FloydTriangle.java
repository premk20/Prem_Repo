package Programs;

public class FloydTriangle {


public static void main(String args[]) {
int num, count = 5; //if you initialize value here output 1  2 3  4 5 6..

for (int i = 1; i <= count; i++) {
num=1; //if you initialize value  here output 1  1 2  1 2 3..
for (int j = 1; j <= i; j++) {
System.out.print(num + " ");
num++; // if you comment this it will be triangle with only 1 numbers
}

System.out.println(); // Moving to next row
}
}

}
