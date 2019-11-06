package com.company.List;

import java.util.Arrays;
import java.util.Iterator;

public class Stock implements Iterable<String> {

    private int a=0;
    private int b=0;
    private String[] stock = new String[a];

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }
    private class Itr implements Iterator<String> {

        @Override
        public boolean hasNext() {
            return b < a;
        }

        @Override
        public String next() {
            String s = stock[b];
            b++;
            return s;

        }
    }

    public void setThing(String thing) {
        a++;
        stock = Arrays.copyOf(stock,a);
        stock[a-1]=thing;
    }

    public String getThing(int index) {
        return stock[index];
    }

    public void viewThings(Stock h) {
        System.out.println("На складе имеются следующие вещи: ");
        while (h.iterator().hasNext()) {
            System.out.println(h.iterator().next());
        }
        b=0;
    }

}
