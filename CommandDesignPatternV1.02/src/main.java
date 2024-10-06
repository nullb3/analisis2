import java.util.Scanner;

public class main {
	//codigo que inicializa a cada ejemplo
    private static void command() {
    	Cookie cookie = new Cookie();
        Server server = new Server();
        Command GenCookieCommand = new GenCookieCommand(cookie);

        server.setCommand(GenCookieCommand);
        server.runGenCookie();
    };
    
    private static void iterator() {
    	
    };
    
    private static void interpreter() {

        //Crea clase Scanner con input como parametro
        Scanner scannerNumeros = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        // Usuario inserta 1er numero
        try {
            System.out.print("Digita el 1er número (entero): ");
            numero1 = scannerNumeros.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un número entero.");
            return; // Sale para volver a empezar debido a valor no valido
        }

        // Usuario inserta 2do  numero
        try {
            System.out.print("Digita el 2do número (entero): ");
            numero2 = scannerNumeros.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un número entero.");
            return; // Sale para volver a empezar debido a valor no valido
        }

        Expresion expresionNumero1 = new NumeroExpresion(numero1);
        Expresion expresionNumero2 = new NumeroExpresion(numero2);

        // Creamos la expresión de suma
        Expresion sumarExpresion = new SumarExpresion(expresionNumero1, expresionNumero2);

        // Interpretamos la expresión y mostramos el resultado
        int result = sumarExpresion.interpret();
        System.out.println("El resultado es: " + result);

    };

    private static int validateInput(Scanner scanner) {
    	int choice = -1;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                //parse el ingreso del usuario para probar si es int o no
            	choice = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Ingreso invalido");
                System.out.print("Ingrese el numero de la opcion que desea correr: ");
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
            System.out.println("Cerrando programa");
            return true;

        default:
            System.out.println("Ingreso invalido, por favoir ingrese una de las opciones.");
            return false;
    	}
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Command");
            System.out.println("2. Iterator");
            System.out.println("3. Interpreter");
            System.out.println("4. Exit");
            System.out.print("Ingrese el numero de la opcion que desea correr: ");

            int choice = -1;
            //validateInput toma el ingreso del usuario, lo valida y lo devleuve
            choice = validateInput(scanner);
            
            //selector devuelve false en case de elegir uno de los ejemplos o un ingreso invalido
            //devuelve true en caso de que el usuario quiera salir
            exit = selector(choice);
        }

        scanner.close();
    }
}
