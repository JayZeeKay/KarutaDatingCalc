public class Print {

  Action action;
  Calc calc;
  int meter[];
  int loseCounter[];

  public Print(Action a, Calc c) {
    action = a;
    calc = c;
    meter = action.getMeter();
    loseCounter = calc.getLoseCounter();
  }

  public void gas() {
    System.out.println("Gas: " + meter[0]);
  }

  public void food() {
    System.out.println("Food: " + meter[1]);
  }

  public void drink() {
    System.out.println("Drink: " + meter[2]);
  }

  public void entertainment() {
    System.out.println("Entertainment: " + meter[3]);
  }

  public void time() {
    System.out.println("Time: " + meter[4]);
  }

  public void meter() {
    gas();
    food();
    drink();
    entertainment();
    time();
    newline();
  }

  // public void action(int[] action) {
  //   System.out.print("The action granted: ");
  //   System.out.print(action[0] + " Gas");
  //   System.out.print(action[1] + " Food");
  //   System.out.print(action[2] + " Drink");
  //   System.out.print(action[3] + " Entertainment");
  // }

  public void turn() {
    System.out.println("Turn: " + action.getTurn());
  }

  public void loseCounter() {
    System.out.println("You will use up all your");
    System.out.println("Gas in " + loseCounter[0] + " turns");
    System.out.println("Food in " + loseCounter[1] + " turns");
    System.out.println("Drink in " + loseCounter[2] + " turns");
    System.out.println("Entertainment in " + loseCounter[3] + " turns");
    System.out.println("Time in " + loseCounter[4] + " turns");
    newline();
  }

  public void newline() {
    System.out.println("-----");
  }

}