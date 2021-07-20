class Main {
  public static void main(String[] args) {
    /*
    For setting own starting values:
    Gas, Food, Drink, Entertainment, Time
    Calc c = new Calc(new int[] { 0, 0, 0, 0, 0 });

    For default values:
    Calc c = new Calc();

    To access actions:
    c.a.<action>;

    List of actions:
    up(), down(), left(), right(), ring(), mall(), sandwich(),
    nightclub(), italian(), gas(), airport(), flower(),
    coffee(), taco(), ballroom(), theatre(), juice(),
    fair()

    To access info:
    c.info();
    */
    Calc c = new Calc(new int[] { 90, 42, 38, 49, 92});
    c.info();
    c.a.up();
    c.info();
    c.a.italian();
    c.info();
    c.a.right();
    c.info();
    c.a.up();
    c.info();
    c.a.right();
    c.info();
    c.a.fair();
    c.info();
    c.a.coffee();
    c.info();
    c.a.right();
    c.info();
    c.a.gas();
    c.info();
    c.a.up();
    c.a.flower();
    c.info();
    c.a.up();
    c.info();
    c.a.left();
    c.a.left();
    c.a.nightclub();
    c.info();
    c.a.up();
    c.info();
    c.a.taco();
    c.info();
    c.a.up();
    c.info();
    c.a.juice();
    c.a.left();
    c.info();
    c.a.gas();
    c.info();
    c.a.ballroom();
    c.info();
    // 100 70 67 100 4
    // c.a.ballroom();
    // c.info();
    // c.a.gas();
    // c.info();
    // 100 70 67 92
    // c.a.gas();
    // c.a.juice();
    // c.info();
    // c.a.up();
    // c.a.ballroom();
    // c.a.right();
    // c.info();
    // 80, 66, 65, 92, 0
  }
}