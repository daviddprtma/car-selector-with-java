import java.util.Scanner;

public class carSelector {
    public static void main (String[]args)
    {
        System.out.println("Do you want a car?");

        Scanner scan = new Scanner(System.in);
        String txt = scan.next();

        if(txt.equals("yes")){
            System.out.println("What's your favourite color between red,blue, and yellow?");
            String txt2 = scan.next();

            if(txt2.equals("red")){
                System.out.println("We have it in stock. would you like it? Yes or No");
                String txt3 = scan.next();

                if(txt3.equals("yes")){
                    System.out.println("Great!Let's check the car");
                }
                else{
                    System.out.println("No worries we will check something else.");
                }
            }
            else if(txt2.equals("blue")){
                System.out.println("We can order it");
            }
            else{
                System.out.println("We don't have a stock.");
            }
        }
        else{
            System.out.println("No worries have a good day");
        }
    }
}
