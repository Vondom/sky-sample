package com.sky.sample;

/**
 * Created by jcooky on 2014. 6. 19..
 */
public class Algorithm1 {

  private static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a%b);
  }

  public static void main(String[] args) throws InterruptedException {
    final int a1 = 129381023, b1 = 1289300, a2 = 12839015, b2 = 12325;

    Thread t1 = new Thread() {
      public void run() {
        System.out.printf("gcd(%d, %d) = %d\n", a1, b1, gcd(a1, b1));
      }
    }, t2 = new Thread() {
      public void run() {
        System.out.printf("gcd(%d, %d) = %d\n", a2, b2, gcd(a2, b2));
      }
    };

    t1.start();
    t2.start();

    t1.join();
    t2.join();
  }


}