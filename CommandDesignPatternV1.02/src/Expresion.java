// Expresion Abstracta: usa una interfaz para declarar el metodo interpret
// Todas las clases deben utilizar el metodo en comun para definir una estructura de lenguaje o operacion matematica.
// una vez definido la interfaz en comun se puede reusar en varios tipos de operaciones
interface Expresion {
    int interpret();
}
