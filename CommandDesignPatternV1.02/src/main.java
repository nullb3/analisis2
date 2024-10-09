import java.util.Scanner;

public class main {
	// Método para limpiar la consola
    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Comando para limpiar consola en Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para limpiar consola en Linux/Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al intentar limpiar la consola.");
        }
    }

    // Código que inicializa cada ejemplo
    private static void command() {
    	Cookie cookie = new Cookie();
        Server server = new Server();
        Command GenCookieCommand = new GenCookieCommand(cookie);

        server.setCommand(GenCookieCommand);
        server.runGenCookie();
        System.out.println("Presiona Enter para continuar...");
        new Scanner(System.in).nextLine(); // Espera a que el usuario presione Enter
    }
    
    private static void iterator() {
        iCookieCollection iCookieCollection = new iCookieCollection(3);
        
        iCookieCollection.addiCookie(new iCookie("Chocolate"));
        iCookieCollection.addiCookie(new iCookie("Vainilla"));
        iCookieCollection.addiCookie(new iCookie("Fresa"));
    
        Iterator iterator = iCookieCollection.createIterator();
        
        while (iterator.hasNext()) {
            iCookie icookie = (iCookie) iterator.next();
            System.out.println(icookie);
        }
        System.out.println("Presiona Enter para continuar...");
        new Scanner(System.in).nextLine(); // Espera a que el usuario presione Enter
    }
    
    private static void interpreter() {
        Scanner scannerNumeros = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        try {
            System.out.print("\nDigita el 1er número (entero): ");
            numero1 = scannerNumeros.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un número entero.");
            return;
        }

        try {
            System.out.print("Digita el 2do número (entero): ");
            numero2 = scannerNumeros.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un número entero.");
            return;
        }

        Expresion expresionNumero1 = new NumeroExpresion(numero1);
        Expresion expresionNumero2 = new NumeroExpresion(numero2);

        Expresion sumarExpresion = new SumarExpresion(expresionNumero1, expresionNumero2);

        int result = sumarExpresion.interpret();
        System.out.println("El resultado es: " + result);
        
        System.out.println("\nPresiona Enter para continuar...");
        new Scanner(System.in).nextLine(); // Espera a que el usuario presione Enter
    }

    private static int validateInput(Scanner scanner) {
    	int choice = -1;
        boolean validInput = false;
        
        while (!validInput) {
            try {
            	choice = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Ingreso invalido. ");
                System.out.print("Ingrese el número de la opción que desea correr: ");
            }
        }
        
        return choice;
    }
    
    private static boolean selector(int choice) {
    	switch (choice) {
        case 1:
        	command();
            return false;

        case 2:
        	iterator();
            return false;

        case 3:
        	interpreter();
            return false;
            
        case 4:
            System.out.println("Cerrando programa.");
            return true;

        default:
            System.out.println("Ingreso inválido, por favor ingrese una de las opciones.");
            return false;
    	}
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            clearConsole();  // Limpiar la consola antes de mostrar el menú
            System.out.println("Menú:\n");
            System.out.println("1. Command");
            System.out.println("2. Iterator");
            System.out.println("3. Interpreter");
            System.out.println("4. Salir\n");
            System.out.print("Ingrese el número de la opción que desea correr:");

            int choice = validateInput(scanner);
            
            exit = selector(choice);
        }

        scanner.close();
    }
}
