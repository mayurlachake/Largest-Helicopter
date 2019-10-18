import java.io.*;
import java.util.*;
public class Helicopter {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);  
      String str[] = new String [sc.nextInt()+1]; 
      int i,largestlength=0,finallargestlength=0;
      int largestHelicopterlength=0;
      for(i=0;i<str.length;i++){
         str[i] = sc.nextLine();
      }
      for(i=1;i<str.length;i++){
         str[i] =str[i].replaceAll("[#]","");
         char[] elements = str[i].toCharArray();
         for(int j=0;j<elements.length-1;j++){
            if(elements[j]=='x'){
               largestlength=0;
            }
            else if(elements[j]==elements[j+1]){
               largestlength = largestlength+1;
               if(largestlength > finallargestlength){
                  finallargestlength = largestlength;
               }
            }
         } 
         
         if(finallargestlength>largestHelicopterlength){
            largestHelicopterlength = finallargestlength;
         }
      }
      System.out.print(largestHelicopterlength+1);
   }
}
