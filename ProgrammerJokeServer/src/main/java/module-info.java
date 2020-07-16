module ProgrammerJokeServer {
    requires JokeServer;

//    exports com.programmerjokeserver;

    provides com.jokeserver.JokeServer with com.programmerjokeserver.ProgrammerJokeServer;
}