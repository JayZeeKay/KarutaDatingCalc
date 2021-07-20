public class Print {

  Action action;
  Calc calc;
  int meter[];
  int a[];
  int loseCounter[];
  boolean healthy[];

  public Print(Action a, Calc c) {
    action = a;
    calc = c;
    meter = action.getMeter();
    loseCounter = calc.getLoseCounter();
    healthy = action.getHealthy();
  }

  public void gas() {
    bar(meter[0]);
    System.out.println("Gas: " + meter[0]);
  }

  public void food() {
    bar(meter[1]);
    System.out.println("Food: " + meter[1]);
  }

  public void drink() {
    bar(meter[2]);
    System.out.println("Drink: " + meter[2]);
  }

  public void entertainment() {
    bar(meter[3]);
    System.out.println("Entertainment: " + meter[3]);
  }

  public void time() {
    bar(meter[4]);
    System.out.println("Time: " + meter[4]);
  }

  public void meter() {
    gas();
    food();
    drink();
    entertainment();
    time();
    //marker();
    nl();
  }

  public void bar(int count) {
    int length = count / 10;
    System.out.print("[");
    for (int i = 0; i < length; i++) {
      System.out.print("■");
    }
    for (int i = length; i < 10; i++) {
      System.out.print(" ");
    }
    System.out.print("]");
  }

  public void action() {
    a = action.getAction();
    System.out.println("The action granted: ");
    if (a[0] != 0)
      System.out.println(a[0] + " Gas");
    if (a[1] != 0)
      System.out.println(a[1] + " Food");
    if (a[2] != 0)
      System.out.println(a[2] + " Drink");
    if (a[3] != 0)
      System.out.println(a[3] + " Entertainment");
    if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0)
      System.out.println("Nothing");
    nl();
  }

  public void turn() {
    System.out.println("Turn: " + action.getTurn() + "\n");
  }

  public void loseCounter() {
    System.out.println("You will use up all your");
    System.out.println("Gas in " + loseCounter[0] + " turns");
    System.out.println("Food in " + loseCounter[1] + " turns");
    System.out.println("Drink in " + loseCounter[2] + " turns");
    System.out.println("Entertainment in " + loseCounter[3] + " turns");
    System.out.println("Time in " + loseCounter[4] + " turns");
    //marker();
    nl();
  }

  public void weak() {
    int w = calc.getWeakMeter();
    switch (w) {
      case 0:
        System.out.print("Gas");
        break;
      case 1:
        System.out.print("Food");
        break;
      case 2:
        System.out.print("Drink");
        break;
      case 3:
        System.out.print("Entertainment");
        break;
    }
    System.out.println(" is your weakest meter");
    marker();
  }

  public void healthy() {
    for (int i = 0; i < healthy.length; i++) {
      if (!healthy[i]) {
        System.out.print("You have run out of ");
      }
    }
  }

  public void marker() {
    System.out.println("-----");
  }

  public void nl() {
    System.out.println("");
  }
}