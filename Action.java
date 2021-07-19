public class Action implements Rate {

  int meter[] = new int[5];
  int turn = 1;
  
  public Action(int[] m) {
    setMeter(m);
  }

  public Action() {
    setMeter(starting);
  }

  private void setMeter(int[] set) {
    for (int i = 0; i < meter.length; i++)
      meter[i] = set[i];
  }

  private void addMeter(int[] add) {
    for (int i = 0; i < meter.length; i++)
      meter[i] += add[i];
  }

  private void boundMeter() {
    for (int i = 0; i < meter.length; i++) {
      if (meter[i] > 100)
        meter[i] = 100;
    }
  }

  public void checkMeter() {
    for (int i = 0; i < meter.length; i++) {
      if (meter[i] < 0) {
        System.out.println("You have ran out of meter " + (i + 1));
      }
    }
    // for (int i = 0; i < meter.length; i++) {
    //   if (!meter[i]) {
    //     return false;
    //   }
    // }
    // return true;
  }

  private void addAction() {
    addMeter(rate);
    boundMeter();
    checkMeter();
    turn++;
  }

  public void left() {
    addAction();
    System.out.println("You went left");
  }

  public void right() {
    addAction();
    System.out.println("You went right");
  }

  public void up() {
    addAction();
    System.out.println("You went up");
  }

  public void down() {
    addAction();
    System.out.println("You went down");
  }

  public void sandwichShop() {
    addMeter(sandwichShop);
    addAction();
    System.out.println("You went to the Sandwich Shop");
    actionInfo(sandwichShop);
  }

  public void nightclub() {
    addMeter(nightclub);
    addAction();
    System.out.println("You went to the Nightclub");
    actionInfo(nightclub);
  }

  public void italianRestaurant() {
    addMeter(italianRestaurant);
    addAction();
    System.out.println("You went to the Italian Restaurant");
    actionInfo(italianRestaurant);
  }

  public void gas() {
    addMeter(gasStation);
    addAction();
    System.out.println("You went to the Gas Station");
    actionInfo(gasStation);
  }

  public void airport() {
    addMeter(airport);
    addAction();
    System.out.println("You went to the Airport");
    actionInfo(airport);
  }

  public void flowerGarden() {
    addMeter(flowerGarden);
    addAction();
    System.out.println("You went to the Flower Garden");
    actionInfo(flowerGarden);
  }

  public void coffeeHouse() {
    addMeter(coffeeHouse);
    addAction();
    System.out.println("You went to the Coffee House");
    actionInfo(coffeeHouse);
  }

  public void tacoStand() {
    addMeter(tacoStand);
    addAction();
    System.out.println("You went to the Taco Stand");
    actionInfo(tacoStand);
  }

  public void ferrisWheel() {
    addMeter(ferrisWheel);
    addAction();
    System.out.println("You went to the Ferris Wheel");
    actionInfo(ferrisWheel);
  }

  public void ballroom() {
    addMeter(ballroom);
    addAction();
    System.out.println("You went to the Ballroom");
    actionInfo(ballroom);
  }

  public void theatre() {
    addMeter(theatre);
    addAction();
    System.out.println("You went to the theatre");
    actionInfo(theatre);
  }

  public void juice() {
    addMeter(juice);
    addAction();
    System.out.println("You went to get juice");
    actionInfo(juice);
  }

  public void fair() {
    addMeter(fair);
    addAction();
    System.out.println("You went to the fair");
    actionInfo(fair);
  }

  public int getGas() {
    return meter[0];
  }

  public int getFood() {
    return meter[1];
  }

  public int getDrink() {
    return meter[2];
  }

  public int getEntertainment() {
    return meter[3];
  }

  public int getTime() {
    return meter[4];
  }

  public int[] getMeter() {
    return meter;
  }

  public int getTurn() {
    return turn;
  }

  public void actionInfo(int[] action) {
    System.out.println("The action granted: ");
    System.out.println(action[0] + " Gas");
    System.out.println(action[1] + " Food");
    System.out.println(action[2] + " Drink");
    System.out.println(action[3] + " Entertainment");
    System.out.println("-----");
  }
}