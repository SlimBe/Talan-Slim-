import java.util.Arrays;
import java.util.Scanner;

public class Tableau{

public static void main(String[] args) {

int max1 =0,max2 =0,min1 =0,min2 =0;
boolean found1 = false, found2 = false;

 Scanner sc = new Scanner(System.in);
 System.out.println("donner la taille des 2 tableaux : ");
 int size = sc.nextInt();
 int tableau1[] = new int[size];
 int tableau2[] = new int[size];
 

 System.out.println("donner les elements du 1er tableau : ");
 for(int i=0;i<size;i++){
   tableau1[i] = sc.nextInt();
  }


 System.out.println("donner les elements du 2eme tableau : ");
 for(int i=0;i<size;i++){
   tableau2[i] = sc.nextInt();
  }

System.out.println("donner l'entier x : ");
int x = sc.nextInt();

for(int i=1;i<size;i++){
  
  if(tableau1[i] >tableau1[max1]){
   max1 =i;}

   
  if(tableau2[i] >tableau2[max2]){
   max2 =i;}

 if(tableau1[i] < tableau1[min1]){
   min1 =i;}

 
  if(tableau2[i] < tableau2[min2]){
   min2 =i;}


   }

System.out.println("le maximum du premier tableau est : "+tableau1[max1]);
System.out.println("le maximum du deuxieme tableau est : "+tableau2[max2]);
System.out.println("le minimum du premier tableau est : "+tableau1[min1]);
System.out.println("le minimum du deuxieme tableau est : "+tableau2[min2]);

System.out.println("le resultat de l'existence de x dans le tableau1 est : ");
for(int i=0; i<size;i++){
  if(tableau1[i] ==x){
     found1 = true;
   }}
System.out.println(found1);


System.out.println("le resultat de l'existence de x dans le tableau2 est : ");
for(int i=0; i<size;i++){
  if(tableau2[i] ==x){
     found2 = true;
   }}
System.out.println(found2);

    

      
}}

