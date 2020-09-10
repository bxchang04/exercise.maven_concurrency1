package com.github.perschola;

class SimpleSynchronization implements Runnable {
  public int x = 0;
  @Override
  public void run() {
    String test = Thread.currentThread().getName();
    for (int i = 0 ; i < 100 ; i++) {
//      synchronized (SimpleSynchronization.class) {

        System.out.println("[" + Thread.currentThread().getName() + "] before: " + x);
        x++;
        System.out.println("[" + Thread.currentThread().getName() + "] after: " + x);
//      }
    }

  }

  public static void main(String[] args) {

    Thread[] threads = new Thread[2];
      for (int i = 0; i < threads.length; i++) {
      threads[i] = new Thread(new SimpleSynchronization(), "thread-" + i);
      threads[i].start();

//        System.out.println(threads[i] + " " + threads[i].x);
    }
  }
}

