public class Calc {

  public Action action;
  public Print print;
  int loseCounter[] = new int[5];
  int meter[] = new int[5];

  public Calc() {
    action = new Action();
    print = new Print(action, this);
    meter = action.getMeter();
  }

  public Calc(int[] m) {
    action = new Action(m);
    print = new Print(action, this);
    meter = action.getMeter();
  }

  public void loseCounter() {
    for (int i = 0; i < meter.length; i++) {
      int count = 0;
      int start = meter[i];
      while (start > 0) {
        start += action.rate[i];
        count++;
      }
      loseCounter[i] = count;
    }
  }

  public void info() {
    print.turn();
    print.meter();
    loseCounter();
    print.loseCounter();
  }

  public int[] getLoseCounter() {
    return loseCounter;
  }
}