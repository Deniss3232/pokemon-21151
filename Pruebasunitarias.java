import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokeTest {
    private Poke manager;

    @BeforeEach
    void setUp() {
        manager = new Poke(); // Se ejecuta antes de cada prueba
    }

    @Test
    void testRegisterPokemon() {
        manager.registerPokemon("Bulbasaur", "Planta", "Espesura");
        assertEquals(1, manager.getPokemonMapSize(), "El Pokémon debería haberse registrado.");
    }

    @Test
    void testAddPokemonToCollection() {
        manager.registerPokemon("Charmander", "Fuego", "Mar de llamas");
        manager.addPokemonToCollection("Charmander");
        assertEquals(1, manager.getUserCollectionSize(), "El Pokémon debería estar en la colección.");
    }
}
