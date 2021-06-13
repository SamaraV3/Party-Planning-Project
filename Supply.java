import java.util.*;

public class Supply {

  private ArrayList<String> supplyList = new ArrayList<String>();

  //made an arraylist incase i  want to add more alcoholic beverages
  private ArrayList<String> a1 = new ArrayList <String>();
  private Scanner s = new Scanner(System.in);


  public Supply () {
    String supply = " ";
    System.out.println("Now we will make a list of supplies. Please enter your list, and seperate each supply with a space. Supplies can include drinks, food, and other things you would need to throw a party.");
    String list1 = s.nextLine();
    String str[] = list1.split(" ");
    for (String item : str) {
      supply = item.toLowerCase();
      supplyList.add(supply);
    }
  }

  public Supply(String list) {
    String supply = " ";
    String str[] = list.split(" ");
    for (String item : str) {
      supply = item.toLowerCase();
      supplyList.add(supply);
    }
  }


  public void printSupplies () {
    System.out.println("Supplies: " + supplyList);
    }


  //sets ach to 10 alcoholic beverages

  public void setAlcoholicDrinks () {
    a1.add("alcohol");
    a1.add("beer");
    a1.add("stout");
    a1.add("wine");
    a1.add("red wine");
    a1.add("white wine");
    a1.add("sparkling wine");
    a1.add("whiskey");//bcuz some ppl spell it this way
    a1.add("whisky"); //while others spell it this way
    a1.add("liquor");
    a1.add("sake");
    a1.add("soju");
    a1.add("rum");
    a1.add("sorrel");
    a1.add("gin");
    a1.add("tequila");
    a1.add("brandy");
    a1.add("tequila");
    a1.add("rose");
    a1.add("mead");
    a1.add("cider");
    a1.add("vodka");
  } 

  public void checkForAlcohol() {
    Scanner g = new Scanner(System.in);
    for (String drink : a1) {

      if (supplyList.contains(drink)) {
        System.out.println("Your supply list contains " + drink + ".\nWill the majority of your guests be of the legal drinking age? Please type in yes or no");
        String answer = g.nextLine();
        if (answer.equals("yes") || answer.equals("Yes")) {
          System.out.println("Okay!");
        }
        else {
          System.out.println("I will remove " + drink + " from your list. You may buy this item seperately.");
          int deletedItem = supplyList.indexOf(drink);
          supplyList.set(deletedItem, "deleted item");
        }

      }
    }
  }


  public boolean hasAlcohol() {
    boolean containsDrink = false;
    for (String drink : a1) {
      if (supplyList.contains(drink)) {
        containsDrink = true;
      }
    }
  return containsDrink;
  }

  public void checkForAlcohol(boolean ofAge) {
    for (String drink : a1) {

      if (!ofAge && supplyList.contains(drink)) {
        int deletedItem = supplyList.indexOf(drink);
        supplyList.set(deletedItem, "deleted item");
      }
      
    }
  }

}