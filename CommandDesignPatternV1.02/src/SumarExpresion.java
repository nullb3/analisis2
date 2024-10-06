// Expresion no terminal: se realiza la suma de dos expresiones terminales o mas (numero en cada lado de la operacion)
//construye el operador (+ - * / %) que seran utlizados en la operacion, tambien se encarga de su posicionamiento)


class SumarExpresion implements Expresion {
    private Expresion expresionIzquierda;
    private Expresion expresionDerecha;

    public SumarExpresion(Expresion expresionIzquierda, Expresion expresionDerecha) {
        this.expresionIzquierda = expresionIzquierda;
        this.expresionDerecha = expresionDerecha;
    }

    @Override //Utiliza override porque estamos haciendo referencia al metodo interpret() en la interfaz expresion
    public int interpret() {
        return expresionIzquierda.interpret() + expresionDerecha.interpret();
    }
}
