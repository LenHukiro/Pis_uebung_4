package pokemon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pokedex<T extends Nameable> {

    public Map<String, T> pokedex;

    public Pokedex() {
        pokedex = new HashMap<>();
    }

    public void add(T nameable) {
        if (nameable != null)
            pokedex.put(nameable.getName(), nameable);
    }

    public void swap(String name, Pokedex<T> other, String otherName) {
        T pokemon = pokedex.get(name);
        T otherPokemon = other.pokedex.get(otherName);

        if (pokemon == null || otherPokemon == null) return;

        pokedex.remove(name);
        other.pokedex.remove(otherName);

        add(otherPokemon);
        other.add(pokemon);
    }

    public Set<T> getUniqueObjectsOf(Pokedex<T> other) {
        Set<T> set = new HashSet<>();
        for (String pokemon : other.pokedex.keySet()) {
            if (pokedex.get(pokemon) == null) set.add(other.pokedex.get(pokemon));
        }
        return set;
    }

    @Override
    public String toString() {
        return "Pokedex" + pokedex.keySet();
    }
}
