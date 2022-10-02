import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot bot1 = new ChatBot("Debbie", 10);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scan.nextLine();

        bot1.greeting(userName);
        System.out.println("Oh, talking with me will help you surely feel even better!");

        System.out.print(userName + ", do you want to know about the weather today? Type y for yes and n for no: ");
        String weatherConfirm = scan.nextLine();
        if(weatherConfirm == "y"){
            bot1.weather();
        } else {
            bot1.weather();
        }

        System.out.print(userName + ", one of the things I can do is become a feet to meter calculator! Give me a number of feet to convert: ");
        int userFeet = scan.nextInt();
        System.out.println("That is " + bot1.convertFeetToMeters(userFeet) + " meters!");

        System.out.print("By the way, what is your favorite number? ");
        int userFavNum = scan.nextInt();
        bot1.favoriteNumber(userFavNum);

        System.out.print("One last trick that I can perform is adding numbers! Give me three numbers to add. The first: ");
        int userFirstNum = scan.nextInt();
        System.out.print("The second: ");
        int userSecondNum = scan.nextInt();
        System.out.print("The third: ");
        int userThirdNum = scan.nextInt();
        System.out.println("The sum is " + bot1.addNumbers(userFirstNum,userSecondNum,userThirdNum) + "!");

        System.out.print(bot1.goodbye());
    }
}
