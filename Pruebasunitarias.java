import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PokeTest {

    @Test
    public void testRegisterPokemon() {
        Poke manager = new Poke();
        manager.registerPokemon("Pikachu", "Eléctrico", "Static");

        // Verificar que Pikachu fue agregado correctamente
        assertNotNull(manager.getPokemonMap().get("Pikachu"));
        assertEquals("Eléctrico", manager.getPokemonMap().get("Pikachu").getType1());
        assertEquals("Static", manager.getPokemonMap().get("Pikachu").getAbility());
    }

    @Test
    public void testAddPokemonToCollection() {
        Poke manager = new Poke();
        manager.registerPokemon("Charmander", "Fuego", "Blaze");
        manager.addPokemonToCollection("Charmander");

        // Verificar que Charmander está en la colección del usuario
        assertTrue(manager.getUserCollection().contains("Charmander"));
    }
}
