package com.company.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsersActions {
  private int numberUsers;

  private Map<String, String> map = new HashMap<>();

  public void countingUsers() {
      Scanner scanner =  new Scanner(System.in);
      System.out.println("Введите количество пользователей");
      this.numberUsers = scanner.nextInt();
  }

  public void createUsers() {
      for(int i = 0; i < numberUsers; i++) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Введите ваш логин");
          String s = scanner.nextLine();
          User user = new User(s);
          map.put(user.login, user.password);
      }
      System.out.println(map);
  }

  public void authorization() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Чтобы получить ваш пароль, введите логин");
      String s = scanner.nextLine();
      System.out.println("Ваш пароль: " + map.get(s));
  }
}
