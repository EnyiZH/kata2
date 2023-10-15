package enyi.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvFilePokemonLoader implements PokemonLoader{
    private final File file;

    public TsvFilePokemonLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Pokemon> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Pokemon> load(FileReader reader) throws IOException {
        return load(new BufferedReader(reader));
    }

    private List<Pokemon> load(BufferedReader reader) throws IOException {
        reader.skip(1);
        List<Pokemon> pokemons = new ArrayList<>();
        while(true){
            String line = reader.readLine();
            if (line== null) return pokemons;
            pokemons.add(toPokemon(line));
        }
    }

    private Pokemon toPokemon(String line) {
        return toPokemon(line.split(","));
    }

    private Pokemon toPokemon(String[] field) {
        return new Pokemon(
                field[0],
                field[1],
                field[2],
                field[3],
                field[4],
                field[5],
                field[6],
                field[7],
                field[8],
                field[9],
                field[10],
                field[11],
                field[12]
        );
    }
}
