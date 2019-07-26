import algorea.Scanner;
/**
 *
 * @author thomas (lamford sur France-IOI)
 */
class Main
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int debut1= input.nextInt();
      int fin1 = input.nextInt();
      int debut2 = input.nextInt();
      int fin2 = input.nextInt();
      
      String res = " ";

      if ((fin2 < debut1) || (fin1 < debut2))
      
         res = "Pas amis";
      else
         res = "Amis";
         
      System.out.println(res);
   }
}