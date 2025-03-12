import java.util.*;

public class Poke {
    private HashMap<String, Pokemon> pokemonMap;
    private ArrayList<String> userCollection;
    
    public Poke() {
        this.pokemonMap = new HashMap<>();
        this.userCollection = new ArrayList<>();
    }
    
    public void registerPokemon(String name, String type1, String ability) {
        if (pokemonMap.containsKey(name)) {
            System.out.println("Error: El Pokémon ya está registrado.");
        } else {
            Pokemon pokemon = new Pokemon(name, type1, ability);
            pokemonMap.put(name, pokemon);
            System.out.println("Pokémon registrado exitosamente: " + name);
        }
    }
    
    public void addPokemonToCollection(String name) {
        if (!pokemonMap.containsKey(name)) {
            System.out.println("Error: Pokémon no encontrado.");
            return;
        }
        if (userCollection.contains(name)) {
            System.out.println("Ese Pokémon ya está en la colección.");
        } else {
            userCollection.add(name);
            System.out.println(name + " agregado a la colección.");
        }
    }
    
    public void showPokemonDetails(String name) {
        if (pokemonMap.containsKey(name)) {
            Pokemon p = pokemonMap.get(name);
            System.out.println("Nombre: " + p.getName() + ", Tipo: " + p.getType1() + ", Habilidad: " + p.getAbility());
        } else {
            System.out.println("Pokémon no encontrado.");
        }
    }
    
    public void showUserCollection() {
        if (userCollection.isEmpty()) {
            System.out.println("La colección del usuario está vacía.");
        } else {
            for (String name : userCollection) {
                Pokemon p = pokemonMap.get(name);
                System.out.println(name + " - " + p.getType1());
            }
        }
    }
    
    public void showAllPokemon() {
        if (pokemonMap.isEmpty()) {
            System.out.println("No hay Pokémon registrados en el sistema.");
        } else {
            for (Pokemon p : pokemonMap.values()) {
                System.out.println(p.getName() + " - " + p.getType1());
            }
        }
    }
    
    public void showPokemonByAbility(String ability) {
        boolean found = false;
        for (Pokemon p : pokemonMap.values()) {
            if (p.getAbility().equalsIgnoreCase(ability)) {
                System.out.println(p.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontraron Pokémon con esa habilidad.");
        }
    }
}

