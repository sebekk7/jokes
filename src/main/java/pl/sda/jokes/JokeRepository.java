package pl.sda.jokes;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class JokeRepository {
    private static final Random RANDOM = new Random();
    private static final List<String> jokes = new ArrayList<>(List.of("joke1", "joke2", "joke3"));

    public String getRandomJoke(){
        return jokes.get(RANDOM.nextInt(jokes.size()));
    }

    public void add(String joke){
        jokes.add(joke);
    }

    public int jokesCount(){
        return jokes.size();
    }

    public Object getAll() {
        {


        }
        return jokes;
    }
}
