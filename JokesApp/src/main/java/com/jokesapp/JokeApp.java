package com.jokesapp;

import com.jokeserver.JokeServer;
import com.kidsjokeserver.KidsJokeServer;
import com.programmerjokeserver.ProgrammerJokeServer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JokeApp {
    public static void main(String[] args) {
        Map<String, JokeServer> jokesMap = new HashMap<>();

        jokesMap.put("1", new KidsJokeServer());
        jokesMap.put("2", new ProgrammerJokeServer());

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
