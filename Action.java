public class Action implements Rate {

  int meter[] = new int[5];
  int action[] = new int[5];
  boolean healthy[] = { true, true, true, true, true };
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
    turn = 26 - (meter[4] / 4);
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
          System.out.print("You have run out of ");
          switch (i) {
          case 0:
            System.out.println("Gas");
            break;
          case 1:
            System.out.println("Food");
            break;
          case 2:
            System.out.println("Drink");
            break;
          case 3:
            System.out.println("Entertainment");
            break;
          case 4:
            System.out.println("Time (which is good)");
          }
        }
      }
    // for (int i = 0; i < meter.length; i++) {
    //   if (!meter[i]) {
    //     return false;
    //   }
    // }
    // return true;
  }

  private void addAction(boolean isMoving) {
    if (!isMoving)
      meter[0] += 10;
    addMeter(rate);
    boundMeter();
    checkMeter();
    turn++;
  }

  public void left() {
    //turn();
    System.out.println("You went left\n");
    addAction(true);
    setAction(none);
  }

  public void right() {
    //turn();
    System.out.println("You went right\n");
    addAction(true);
    setAction(none);
  }

  public void up() {
    //turn();
    System.out.println("You went up\n");
    addAction(true);
    setAction(none);
  }

  public void down() {
    //turn();
    System.out.println("You went down\n");
    addAction(true);
    setAction(none);  
  }

  public void sandwich() {
    //turn();
    System.out.println("You went to the Sandwich Shop\n");
    addMeter(sandwichShop);
    addAction(false);
    setAction(sandwichShop);
  }

  public void nightclub() {
    //turn();
    System.out.println("You went to the Nightclub\n");
    addMeter(nightclub);
    addAction(false);
    setAction(nightclub);
  }

  public void italian() {
    //turn();
    System.out.println("You went to the Italian Restaurant\n");
    addMeter(italianRestaurant);
    addAction(false);
    setAction(italianRestaurant);
  }

  public void gas() {
    //turn();
    System.out.println("You went to the Gas Station\n");
    addMeter(gasStation);
    addAction(false);
    setAction(gasStation);
  }

  public void airport() {
    //turn();
    System.out.println("You went to the Airport\n");
    addMeter(airport);
    addAction(false);
    setAction(airport);
  }

  public void flower() {
    //turn();
    System.out.println("You went to the Flower Garden\n");
    addMeter(flowerGarden);
    addAction(false);
    setAction(flowerGarden);
  }

  public void coffee() {
    //turn();
    System.out.println("You went to the Coffee House\n");
    addMeter(coffeeHouse);
    addAction(false);
    setAction(coffeeHouse);
  }

  public void taco() {
    //turn();
    System.out.println("You went to the Taco Stand\n");
    addMeter(tacoStand);
    addAction(false);
    setAction(tacoStand);
  }

  public void ferrisWheel() {
    //turn();
    System.out.println("You went to the Ferris Wheel\n");
    addMeter(ferrisWheel);
    addAction(false);
    setAction(ferrisWheel);
  }

  public void ballroom() {
    //turn();
    System.out.println("You went to the Ballroom\n");
    addMeter(ballroom);
    addAction(false);
    setAction(ballroom);
  }

  public void theatre() {
    //turn();
    System.out.println("You went to the theatre\n");
    addMeter(theatre);
    addAction(false);
    setAction(theatre);
  }

  public void juice() {
    //turn();
    System.out.println("You went to get juice at the Juice Box\n");
    addMeter(juice);
    addAction(false);
    setAction(juice);
  }

  public void fair() {
    //turn();
    System.out.println("You went to the fair\n");
    addMeter(fair);
    addAction(false);
    setAction(fair);
  }

  public void ring() {
    //turn();
    System.out.println("You got the ring\n");
    addAction(false);
    setAction(none);
  }

  public void mall() {

  }

  public void setAction(int[] a) {
    action = a;
  }

  public void turn() {
    System.out.println("Turn: " + turn);
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

  public int[] getAction() {
    return action;
  }

  public boolean[] getHealthy() {
    return healthy;
  }
}