package virtual_pet;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        Scanner input = new Scanner(System.in);
        System.out.println("pick a name for your pet: ");
        String nameChoice = input.nextLine();


        VirtualPet pet1 = new VirtualPet(nameChoice,35, 20, 15, 25);



        while (pet1.getFatigue() > 0 && pet1.getHappy() > 0 && pet1.getHunger() > 0 && pet1.getThirst() > 0) {
            System.out.println("What would you like to do?");
            System.out.println("1. Pet " + nameChoice + " to sleep.");
            System.out.println("2. Give " + nameChoice + " some chicken.");
            System.out.println("3. Give " + nameChoice + " some water.");
            System.out.println("4. Give " + nameChoice + " a toy.");
            System.out.println("5. Gives up");

            int option = input.nextInt();

            if (option == 1) {
                System.out.println("Give " + nameChoice + " fluffy pillow to sleep.");
                pet1.sleep();
            } else if (option == 2) {
                System.out.println("Give " + nameChoice + " some chicken.");
                pet1.feedChicken();
            } else if (option == 3) {
                System.out.println("Give " + nameChoice + " some water!");
                pet1.giveWater();
            } else if (option == 4) {
                System.out.println("You take " + nameChoice + " to play.");
                pet1.play();
            }
            else {
                System.out.println("Give up");
                break;
            }


            pet1.tick();
            pet1.statusReport();

        }
        System.out.println("Game Over!");

        input.close();
    }
}
