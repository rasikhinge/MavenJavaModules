module KidsJokeServer {
    requires JokeServer;

//    exports com.kidsjokeserver;

    provides com.jokeserver.JokeServer with com.kidsjokeserver.KidsJokeServer;
}