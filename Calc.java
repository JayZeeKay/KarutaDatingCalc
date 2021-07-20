public class Calc {

  public Action a;
  public Print p;
  int loseCounter[] = new int[5];
  int weakMeter = 0;
  int meter[] = new int[5];
  double AP, AR;

  public Calc() {
    a = new Action();
    p = new Print(a, this);
    meter = a.getMeter();
  }

  public Calc(int[] m) {
    a = new Action(m);
    p = new Print(a, this);
    meter = a.getMeter();
  }

  public void loseCounter() {
    for (int i = 0; i < meter.length; i++) {
      int count = 0;
      int start = meter[i];
      while (start > 0) {
        start += a.rate[i];
        count++;
      }
      loseCounter[i] = count;
    }
  }

  public void weakMeter() {
    int weak = loseCounter[0];
    weakMeter = 0;
    for (int i = 0; i < loseCounter.length - 1; i++) {
      //System.out.println(i + " " + loseCounter[i]);
      //System.out.println(weak);
      if (loseCounter[i] < weak) {
        weak = loseCounter[i];
        weakMeter = i;
        //System.out.println("weakMeter: " + weakMeter);
      }
    }
  }

  public void info() {
    p.turn();
    p.action();
    p.meter();
    loseCounter();
    p.loseCounter();
    weakMeter();
    p.weak();
    p.healthy();
  }

  public int[] getLoseCounter() {
    return loseCounter;
  }

  public int getWeakMeter() {
    return weakMeter;
  }
}