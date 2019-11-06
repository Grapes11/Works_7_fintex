package com.company.Map;

import java.util.Random;

public class User {
    String login;
    String password;


    User(String login) {
        this.login = login;
        this.password = generateRandomWords();
    }

    public static String generateRandomWords()
    {
        Random random = new Random();
            char[] word = new char[8];
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
        return new String(word);
    }

}
