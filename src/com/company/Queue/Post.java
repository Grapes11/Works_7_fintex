package com.company.Queue;

import java.util.*;

public class Post {

    private int numberPensioners;

    private Deque<Integer> intQueue = new ArrayDeque<>();

    public void queueForMail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество человек, пришедших на почту");
        int b = scanner.nextInt();
        while (b>0) {
            System.out.println("Введите ваш возраст: ");
            int a = scanner.nextInt();
            if (a >= 65) {
                int [] A= new int[numberPensioners];
                for (int k = numberPensioners;k>0;k--) {
                    A[k-1] = intQueue.removeFirst();
                }
                intQueue.addFirst(a);
                for (int k = 0;k < numberPensioners;k++) {
                    intQueue.addFirst(A[k]);
                }
                numberPensioners++;
            } else {
                intQueue.addLast(a);
            }
            b--;
        }
        System.out.println("Очередь ожидания: ");
        while( !intQueue.isEmpty() ) {
            System.out.println( intQueue.poll() );
        }
    }




}
