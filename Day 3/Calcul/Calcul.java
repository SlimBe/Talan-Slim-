import java.util.Scanner;
public class Calcul{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int a,b;
double f = 1;
System.out.println("donner le premier entier");
a = s.nextInt();
System.out.println("donner le dexieme entier");
b = s.nextInt();
int R = a+b;
if (a < b) {
if (b!=0) {
for (int i =1 ; i<b+1 ; i++) {
f=f*i; }
} else
{f=1 ;}
} else { for (int i =2 ; i<a+1 ; i++) {
f=f*i; }
}
System.out.println("la Somme est" + R);
System.out.println("la factorielle est" + f);
}
}