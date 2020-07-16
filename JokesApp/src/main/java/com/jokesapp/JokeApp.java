package com.jokesapp;

import com.jokeserver.JokeServer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ServiceLoader;

public class JokeApp {
    public static void main(String[] args) {
        Map<String, JokeServer> jokesMap = new HashMap<>();
//
//        jokesMap.put("1", new KidsJokeServer());
//        jokesMap.put("2", new ProgrammerJokeServer());

        ServiceLoader<JokeServer> loader = ServiceLoader.load(JokeServer.class);

        int key = 1;
        for (JokeServer server : loader) {
            jokesMap.put(String.valueOf(key), server);
            key++;
        }

        String input = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter your choice..");
            input = scanner.nextLine();
            if (jokesMap.containsKey(input)) {
                System.out.println("Printing Joke - ");
                System.out.println(jokesMap.get(input).getJoke());
            } else if (input != "q") {
                System.out.println("Please re try");
            }
        } while (!input.equalsIgnoreCase("q"));
    }
}
