import java.util.Scanner;
public class InputFromKeyBoard{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String strname = keyboard.nextLine();
        System.out.println("How old are you?");
        int iage = keyboard.nextInt();
        System.out.println("How tall are you ?");
        double dheight = keyboard.nextDouble();

        System.out.println("Mrs/Ms " + strname + ", " + iage + " year old. " + "Your height is: "+ dheight +" (m).");
        keyboard.close();
    }
}