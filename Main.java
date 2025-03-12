import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Poke manager = new Poke();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar Pokémon");
            System.out.println("2. Agregar Pokémon a la colección");
            System.out.println("3. Mostrar colección");
            System.out.println("4. Mostrar todos los Pokémon");
            System.out.println("5. Buscar Pokémon por habilidad");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (choice) {
                case 1:
                    System.out.print("Nombre del Pokémon: ");
                    String name = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String type = scanner.nextLine();
                    System.out.print("Habilidad: ");
                    String ability = scanner.nextLine();
                    manager.registerPokemon(name, type, ability);
                    break;
                case 2:
                    System.out.print("Nombre del Pokémon a agregar a la colección: ");
                    String pokemonName = scanner.nextLine();
                    manager.addPokemonToCollection(pokemonName);
                    break;
                case 3:
                    System.out.println("Colección del usuario:");
                    manager.showUserCollection();
                    break;
                case 4:
                    System.out.println("Todos los Pokémon registrados:");
                    manager.showAllPokemon();
                    break;
                case 5:
                    System.out.print("Ingrese la habilidad para buscar Pokémon: ");
                    String searchAbility = scanner.nextLine();
                    manager.showPokemonByAbility(searchAbility);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
}

