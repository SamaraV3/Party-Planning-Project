import java.util.*;

public class Party {

  Scanner sc = new Scanner(System.in);

  private String name;
  private String date;
  private String occasion;

  private static double budget;
  final private double rn = Math.random();
  final private double max = Integer.MAX_VALUE - 2147480000;
  //evaluates to 3,647
  final private double min = 1000.0;
  final private double possibleCost = (int) (rn * (max - min + 1)) + min + Math.pow(2, 3) + Math.abs(-5)
      - Math.sqrt(625);

  private String location;
  private String time;
  private ArrayList<String> guestList = new ArrayList<String>();
  private String email;

  public String toString() {
    return "Customer\'s Name: " + name + "\nDate: " + date + "\nOccasion: " + occasion + "\nBudget: " + budget
        + "\nLocation: " + location + "\nTime: " + time + "\nGuest List: " + guestList + "\nEmail: " + email;
  }

  public Party() {
    // sets name for client
    System.out.println("Welcome to Sam\'s Party Planning Service! What\'s your name?");
    String n = sc.nextLine();
    name = n;
    System.out.println("Hello " + n + "!");

    // sets date for party
    System.out.println("Which date will your party take place?");
    String d = sc.nextLine();
    date = d;
    System.out.println("The date of your party is: " + date + ".");

    // sets reason/occasion for party
    System.out.println("And what occasion is this party for?");
    String o = sc.nextLine();
    occasion = o;
  }

  public Party(String n, String d, String o) {
    name = n;
    date = d;
    occasion = o;
  }

  public void printParty() {
    System.out.println("Customer\'s Name: " + name);
    System.out.println("Date: " + date);
    System.out.println("Occasion: " + occasion);
  }

  public void setBudget() {
    System.out.println("The assumed/randomized cost for this party is " + possibleCost);
    System.out.println(
        "Is this cost too high? If so, then please type in your budget. If not, type in \'no\'\nPlease don\'t type in a value lower than 1000.00.");
    String b = sc.nextLine();

    if (b.equals("no")) {
      budget = possibleCost;
    }
    else {
      budget = Double.valueOf(b);
      if (budget == possibleCost) {
        System.out.println("Just as a heads up, you typed in the predicted cost.");
      }
    }

  }


  public void setBudget(double b) {
    budget = b;
  }


  public double getBudget() {
    return budget;
  }


  public void printBudget() {
    if (budget < 1000) {
      System.out.println("Budget: To Be Decided, as you input a value less that 1,000");
    }
    else {System.out.println("Budget: " + budget);}
  }


  public void setLocation() {
    System.out.println(
        "Let\'s decide a location for your party! Would you prefer to have your party here or elsewhere? Please type in one for here or two for elsewhere.");
    String answer = sc.nextLine();

    if (answer.equals("one") || answer.equals("One")) {
      System.out.println(
          "We have three different party rooms: Room 1 holds up to twenty guests, Room 2 holds a maximum of thirty guests, while our largest room, Room 3, holds a maximum of fifty guests. Please type only the number of the room you would like to choose for your party, in numerical form.");
      String room = sc.nextLine();
      if (room.equals("1")) {
        location = "7336 E. Richardson Street New York, NY 10011: Room 1";
      }

      if (room.equals("2")) {
        location = "7336 E. Richardson Street New York, NY 10011: Room 2";
      }

      if (room.equals("3")) {
        location = "7336 E. Richardson Street New York, NY 10011: Room 3";
      }

    }
    else {
      System.out.println("Okay then! Please type out the location where you would like to have your party.");
      String newl = sc.nextLine();
      location = newl;
    }

    System.out.println("The location of your party is: " + location);
  }


  public void setLocation(String l) {
    location = l;
  }


  public void printLocation() {
    System.out.println("Location: " + location);
  }


  // a really big method
  public void setTime() {
    System.out.println("Let's set a time for your party!");

    if (location.equals("7336 E. Richardson Street New York, NY 10011: Room 1")) {
      System.out.println(
          "As you chose room one at our location, the only available times are:\nChoice 1: 1pm to 6pm \nChoice 2: 7pm to 12am.\nPlease type in the number of the time frame you would like to choose.");
      String nextInt = sc.nextLine();

      if (nextInt.equals("1")) {time = "1pm to 6pm";}
      else if (nextInt.equals("2")) {time = "7pm to 12am";}
      else {
        System.out.println("You have not entered a viable choice. The default choice is choice 2, and I will be setting your party time to this choice until further notice.");
        time = "7pm to 12am";
        }

      }

    else if (location.equals("7336 E. Richardson Street New York, NY 10011: Room 2")) {
      System.out.println(
          "As you chose room two at our location, the only available times are:\nChoice1: 11am to 3pm \nChoice 2: 4pm to 8pm \nChoice 3: 9pm to 1am.\nPlease type in the number of the time frame you would like to choose.");
      String secInt = sc.nextLine();

      if (secInt.equals("1")) {time = "11am to 3pm";}
      else if (secInt.equals("2")) {time = "4pm to 8pm";}
      else if (secInt.equals("3")) {time = "9pm to 1am";}
      else {
        System.out.println("You have not entered a viable chocie. The default choice is choice 2, and I will be setting your party time to this choice until further notice.");
        time = "4pm to 8pm";
      }

    }
    
    else if (location.equals("7336 E. Richardson Street New York, NY 10011: Room 3")) {
      System.out.println(
          "As you chose room three at our location, the only available times are:\nChoice 1: 1pm to 6pm \nChoice 2: 7pm to 12am.\nPlease type in the number of the time frame you would like to choose.");
      String thirdInt = sc.nextLine();

      if (thirdInt.equals("1")) {time = "1pm to 6pm";}
      else if (thirdInt.equals("2")) {time = "7pm to 12am";}
      else {
        System.out.println("You have not entered a viable choice. The default choice is choice 2, and I will be setting your party time to this choice until further notice.");
        time = "7pm to 12am";
      }

    }
    
    else {
      System.out.println("From what time frame would you like your party to last?");
      String timeFrame = sc.nextLine();
      time = timeFrame;
    }
    System.out.println("The time frame for your party is from " + time);
  }

  public void setTime(String t) {
    time = t;
  }

  public void printTime() {
    System.out.println("Time: " + time);
  }

  public void setGuests() {
    System.out.println(
        "Now let\'s create your guest list! Please type in your list of guests, including their first name and last initial, with a space between each seperate guest.");
    String list1 = sc.nextLine();
    String str[] = list1.split(" ");
    for (String item : str) {
      guestList.add(item);
    }
  }

  public void setGuests(String guests) {
    String str[] = guests.split(" ");
    for (String item : str) {
      guestList.add(item);
    }
  }

  public void printGuestList() {
    System.out.println("Guest List: " + guestList);
  }

  public void setEmail() {
    System.out.println(
        "Okay! Now I need your email address so I can send a reciept of your choices to you. Please type your email address in");
    email = sc.nextLine();
    sc.close();
  }

  public void setEmail(String em) {
    email = em;
  }

}