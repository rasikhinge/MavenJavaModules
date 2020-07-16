package com.kidsjokeserver;

import com.jokeserver.JokeServer;

import java.util.List;

public class KidsJokeServer implements JokeServer {
    List<String> jokes = List.of("Kids Joke 1", "Kids Joke 2", "Kids Joke 3", "Kids Joke 4", "Kids Joke 5");

    @Override
    public String getJoke() {
        int randomNumber = (int) (Math.random() * (jokes.size()));
        return jokes.get(randomNumber);
    }

    @Override
    public int availableJokes() {
        return jokes.size();
    }

    @Override
    public String getName() {
        return "Kids Joke Server";
    }
}
