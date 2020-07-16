package com.programmerjokeserver;

import com.jokeserver.JokeServer;

import java.util.List;

public class ProgrammerJokeServer implements JokeServer {

    private List<String> jokes = List.of("Programmer-Joke-1", "Programmer-Joke-2", "Programmer-Joke-3",
            "Programmer-Joke-4", "Programmer-Joke-5");

    @Override
    public String getJoke() {
        int randomNumber = (int) (Math.random() * jokes.size());
        return jokes.get(randomNumber);
    }

    @Override
    public int availableJokes() {
        return jokes.size();
    }

    @Override
    public String getName() {
        return "Programmers Joke Server";
    }
}
