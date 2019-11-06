package com.company;

import com.company.Comparator.Product;
import com.company.Comparator.ProductCountComparator;
import com.company.Comparator.ProductNameComparator;
import com.company.List.Stock;
import com.company.Map.UsersActions;
import com.company.Queue.Post;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /**
         * Задание по List
         */
      /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stock stock = new Stock();
        int a = 0;
        while (true) {
            try {
                System.out.println("Введите вещь, которую хотите положить на склад");
                String text = reader.readLine();
                stock.setThing(text);
                stock.viewThings(stock);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/

        /**
         * задание по Comparator
         */
        /*System.out.println("Сортировка по имени: ");
        ProductNameComparator productNameComparator = new ProductNameComparator();
        Set<Product> products = new TreeSet<>(productNameComparator);
        products.add(new Product("Samsung", 15));
        products.add(new Product("LG",3));
        products.add(new Product("iPhone", 10));
        products.add(new Product("Xiomi",7));
        for (Product s: products) {
            System.out.println(s.getName() + " - " + s.getCount() + ", ");
        }

        System.out.println("Сортировка по количеству: ");
        ProductCountComparator productCountComparator = new ProductCountComparator();
        products = new TreeSet<>(productCountComparator);
        products.add(new Product("Samsung", 15));
        products.add(new Product("LG",3));
        products.add(new Product("iPhone", 10));
        products.add(new Product("Xiomi",7));
        for (Product s: products) {
            System.out.println(s.getName() + " - " + s.getCount() + ", ");
        }*/

        /**
         * задание по Queue
         */
        //new Post().queueForMail();

        /**
         * задание по Map
         */
      /* UsersActions usersActions = new UsersActions();
       usersActions.countingUsers();
       usersActions.createUsers();
       usersActions.authorization();*/

    }

}
