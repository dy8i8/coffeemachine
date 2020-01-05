package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public enum options{
        buy,
        fill,
        take,
        remaining,
        exit;
    }

    public enum menu{
        espresso("1"),
        latte("2"),
        cappuccino("3"),
        back("back");

        private  String i;
        menu(String i) {
            this.i = i;
        }
        String getI(){
            return i;
        }
        }


    public static void printAmount(int water, int milk, int beans, int cups, int money){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water  = 400;
        int milk  = 540;
        int beans  = 120;
        int cups  = 9;
        int money = 550;
        printAmount(water,milk,beans,cups,money);


        System.out.println("write action (buy , fill , take, remaining, exit)");
        options option;
        option = options.valueOf(scanner.next());
        boolean stopped = false;
        while (!stopped) {
            switch (option) {
                case buy:
                    System.out.println(1 + " - espresso");
                    System.out.println(2 + " - latte");
                    System.out.println(3 + " - cappuccino");
                    System.out.println("back - to main menu");
                    String number = scanner.next() ;
                    menu coffee = null;
                    if (number.equals("1")){
                        coffee = menu.espresso;
                    } else if (number.equals("2")){
                        coffee = menu.latte;
                    } else if (number.equals("3")){
                        coffee = menu.cappuccino;
                    } else if (number.equals("back")){
                        coffee = menu.back;
                    }else {
                            System.out.println("Unsupported enum constant.");
                    }
                    switch (coffee) {
                        case espresso:
                            if (water <250){
                                System.out.println("Sorry, not enough water!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                water -= 250;
                            }
                            if (beans < 16){
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                beans -= 16;
                            }
                            if (cups < 1){
                                System.out.println("Sorry, not enough cups!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                cups -= 1;
                            }
                            money += 4;
                            System.out.println("I have enough resources, making you a coffee!\n");
                            System.out.println("write action (buy , fill , take, remaining, exit)");
                            option = options.valueOf(scanner.next());
                            break;
                        case latte:
                            if (water < 350){
                                System.out.println("Sorry, not enough water!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                water -= 350;
                            }
                            if (milk < 75){
                                System.out.println("Sorry, not enough milks!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                milk -= 75;
                            }
                            if (beans < 20){
                                System.out.println("Sorry, not enough beans!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                beans -= 20;
                            }
                            if (cups < 1){
                                System.out.println("Sorry, not enough cups!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                cups -= 1;
                            }
                            money += 7;
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            System.out.println("write action (buy , fill , take, remaining, exit)");
                            option = options.valueOf(scanner.next());
                            break;
                        case cappuccino:
                            if (water < 200){
                                System.out.println("Sorry, not enough water!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                water -= 200;
                            }
                            if (milk < 100){
                                System.out.println("Sorry, not enough milk!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                milk -= 100;
                            }
                            if (beans < 12){
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                beans -= 12;
                            }
                            if (cups < 1){
                                System.out.println("Sorry, not enough cups!");
                                System.out.println("write action (buy , fill , take, remaining, exit)");
                                option = options.valueOf(scanner.next());
                                break;
                            }else {
                                cups -= 1;
                            }
                            money += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            System.out.println("write action (buy , fill , take, remaining, exit)");
                            option = options.valueOf(scanner.next());
                            break;
                        case back:
                            System.out.println("write action (buy , fill , take, remaining, exit)");
                            option = options.valueOf(scanner.next());
                            break;
                        default:
                            System.out.println("Unsupported enum constant.");
                            break;
                    }
                    break;
                case fill:
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += scanner.nextInt();
                    System.out.println("write action (buy , fill , take, remaining, exit)");
                    option = options.valueOf(scanner.next());
                    break;
                case take:
                    System.out.println("I gave you $" + money);
                    money -= money;
                    System.out.println("write action (buy , fill , take, remaining, exit)");
                    option = options.valueOf(scanner.next());
                    break;
                case remaining:
                    printAmount(water,milk,beans,cups,money);
                    System.out.println("write action (buy , fill , take, remaining, exit)");
                    option = options.valueOf(scanner.next());
                    break;
                case exit:
                    stopped = true;
                    break;
            }
        }


    }
}