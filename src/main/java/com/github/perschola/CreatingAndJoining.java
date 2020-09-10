package com.github.perschola;

import java.util.concurrent.CancellationException;

public class CreatingAndJoining extends Thread{
  public void run () {
    System.out.println(currentThread().getName() + " Hello World");
  }



  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new CreatingAndJoining();
    Thread thread2 = new CreatingAndJoining();
    Thread thread3 = new CreatingAndJoining();
    Thread thread4 = new CreatingAndJoining();
    Thread thread5 = new CreatingAndJoining();
    thread1.start();
    thread1.join(); // join doesn't work. CreatingAndJoining needs to be separate file?
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();



  }


}


