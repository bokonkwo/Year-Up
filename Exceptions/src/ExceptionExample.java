public class ExceptionExample {

public static void main(String[] args) throws Exception {

try{
System.out.println("Huh");
try{
System.out.println("that");
int b = 9876/0;
}catch(Exception e){
System.out.println("is");
}finally{
System.out.println("Final");
}
}catch(Exception j){
System.out.println("\n\n\n\n");
}finally{
System.out.println("out of here");
}
try {
int a = 54 / 0;
} catch (ArithmeticException m) {

System.out.println("woo");
}
try {
int[] A = null;
AddArray(A);
} catch (ArrayIndexOutOfBoundsException l) {
System.out.println("!");
} catch (NullPointerException n) {
System.out.println("!!!");

try {
int[] A = {1, 3, 5, 7};
AddArray(A);
} catch (ArrayIndexOutOfBoundsException ar) {
System.out.println("I!");
} catch (NullPointerException n12) {
System.out.println("I!");
} catch (ArithmeticException lo) {
System.out.println("!!");
}finally{
System.out.println("Hahaha");
}
}
}
private static void AddArray(int[] A) throws Exception {
int sum = 0;
if (A == null) {
System.out.println("There aint nothing there!");
throw new NullPointerException();
}
for (int i = 0; i <= A.length; i++) {
sum = sum + A[i];
}
System.out.println("Sum is " + sum);
}
}
