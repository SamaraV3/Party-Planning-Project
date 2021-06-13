import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);
    System.out.println("\nHello! My name is Samara Vassell, and I am a party planner at Sam\'s Party Planning Service! Would you like to record your oral answers , or would you like to fill out a program form? Please type in one to record your oral answers. If you choose the other option, please fill out the form under the \'else\' block in the program,stop the program, run it again, then type \'two\'");
    String answer = type.nextLine();


    if (answer.equals("one") || answer.equals("one")) {
      Party one = new Party();
      one.setBudget();
      one.setLocation();
      one.setTime();
      one.setGuests();

      //supplies section
      Supply three = new Supply();
      three.setAlcoholicDrinks();
      three.checkForAlcohol();
      one.setEmail();

      //printing section
      one.printParty();
      one.printBudget();
      one.printLocation();
      one.printTime();
      one.printGuestList();
      three.printSupplies();
    }



    else {
      /*type in your name, date of party, and occasion of party. All as strings
      
      Fill this out first, then run the program again, then pick option two*/
      Party two = new Party(null, null, null);

      //please don't set a budget less than 1000.00
      two.setBudget(0.00);

      //as a string
      two.setLocation(null);

      //as a string
      two.setTime(null);

      /*Please seperate each guest with a space, and include their first and last initial. Ex: SamaraV. This should all be done within one string*/
      two.setGuests(null);


      /*Please seperate each supply item with a space, while keeping them in one single string*/
      Supply four = new Supply(null);
      four.setAlcoholicDrinks();

      /*set to false if the majority of guests are under the legal drinking age. Set to true if the majority are of age*/
      boolean majorityOfAge = false;
      four.checkForAlcohol(majorityOfAge);

      //as a string
      two.setEmail(null);

      //printing section
      two.printParty();
      two.printBudget();
      two.printLocation();
      two.printTime();
      two.printGuestList();
      four.printSupplies();
    }
    
    System.out.println("Thank you for coming to Sam\'s Party Planning Service! Have a good day");
    type.close();
  }
}