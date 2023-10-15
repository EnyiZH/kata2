package enyi.kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PokemonLoader loader = new TsvFilePokemonLoader(new File("Pokemoncopia.txt"));
        List<Pokemon> pokemons = loader.load();
        HashMap<String, Integer> chart = new HashMap<>();
        for(Pokemon pokemon: pokemons){
            String type1 = pokemon.getType1();
            chart.put(type1, chart.getOrDefault(type1,0)+1);
        }
        for(String key: chart.keySet()){
            System.out.println(key + ":" + chart.get(key));
        }
    }
}
