import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Poke manager = new Poke();
        
        while (true) {
            System.out.println("\n1. Registrar un Pokémon");
            System.out.println("2. Agregar Pokémon a colección");
            System.out.println("3. Mostrar detalles de un Pokémon");
            System.out.println("4. Mostrar colección");
            System.out.println("5. Mostrar todos los Pokémon");
            System.out.println("6. Buscar Pokémon por habilidad");
            System.out.println("7. Salir");
            System.out.print("Seleccione opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if (option == 7) break;
            
            switch (option) {
                case 1:
                    System.out.print("Ingrese nombre del Pokémon: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese tipo: ");
                    String type = scanner.nextLine();
                    System.out.print("Ingrese habilidad: ");
                    String ability = scanner.nextLine();
                    manager.registerPokemon(name, type, ability);
                    break;
                case 2:
                    System.out.print("Ingrese nombre del Pokémon a agregar: ");
                    name = scanner.nextLine();
                    manager.addPokemonToCollection(name);
                    break;
                case 3:
                    System.out.print("Ingrese nombre del Pokémon a mostrar: ");
                    name = scanner.nextLine();
                    manager.showPokemonDetails(name);
                    break;
                case 4:
                    manager.showUserCollection();
                    break;
                case 5:
                    manager.showAllPokemon();
                    break;
                case 6:
                    System.out.print("Ingrese habilidad: ");
                    ability = scanner.nextLine();
                    manager.showPokemonByAbility(ability);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
