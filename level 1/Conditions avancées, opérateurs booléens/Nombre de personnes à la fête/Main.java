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
      
      int nbPers= input.nextInt();
      int temp = 0;
      int max = 0;

      for(int i = 1; i <= nbPers*2; i++){
         int nb = input.nextInt();

         if(nb > 0)
            temp++;
         else
            temp--;
         
         if (temp > max) {
            max = temp;
         }
      }

      System.out.println(max);
   }
}