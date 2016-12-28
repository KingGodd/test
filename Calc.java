/*Ici je declare mes importations 
 * 
 * Des commengtaires.....asdnladksnkasl
 * 
 * fjdslfjdslfdsjklfjdsfdsjklfdsjkjk
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Ici je declare ma classe
public class CommandBlock
{
    //Ici je declare ma fonction MAIN
    public static void main(String[ ] args) throws IOException
    {
//Ici je declaire mes variables de calculs
double chiffre1;
double chiffre2;
double sum;
InputStreamReader lecteurDeClavier;
lecteurDeClavier = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(lecteurDeClavier);
for(int i=0;i<=3;i++)
{
   
    System.out.println("Please enter chiffre1:");
    chiffre1 = Double.parseDouble(in.readLine());
    System.out.println("La varible que tu as entre est le " + chiffre1);
     
        System.out.println("Please enter chiffre2:");
        chiffre2 = Double.parseDouble(in.readLine());
        System.out.println("La varible que tu as entre est le " + chiffre2);
         
        if(chiffre1 == chiffre2)
        {
            System.out.println("egale");
        }
        else
        {
            System.out.println("pas egale");
          
        }
        
        
        System.out.println("Je calcul...");
        System.out.println("J'ai find your reponse");
         
        sum = chiffre1 + chiffre2;
        System.out.println("Et ton calcul est." + sum);
        
        System.out.println("");
}

   }

}

