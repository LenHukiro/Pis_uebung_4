package pokemon;

import java.util.*;

public class Pokedex<T extends Nameable> {

    public Map<String,T> map;

    public Pokedex(){
        map = new HashMap<String,T>();
    }

    public void add(T nameable){
        map.put(nameable.getName(),nameable);
    }

    public void swap(String name, Pokedex<T> other, String otherName){
        T pokemon = map.get(name);
        T otherPokemon = other.map.get(otherName);

        map.remove(name);
        other.map.remove(otherName);

        add(otherPokemon);
        other.add(pokemon);

    }

     public Set<T> getUniqueObjectsOf(Pokedex<T> other){
        Set<T> notContainList = new HashSet<T>();
        for (String pokemon : other.map.keySet()) {
            if(map.get(pokemon) == null) notContainList.add(other.map.get(pokemon));
        }
        return notContainList;
    }

    @Override
    public String toString() {
        return "Pokedex" +  map.keySet();
    }
}
