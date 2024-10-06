// Expresion terminal: se representa un valor por medio de esta clase, es la parte mas simple de las estructura interpretador
//Las entradas por parte del usuario son instancias a esta clase
//construye los valores que seran utlizados en la operacion


class NumeroExpresion implements Expresion {
    private int number;

    public NumeroExpresion(int number) {
        this.number = number;
    }

    // Una vez se logra interpretar hace RETURN del mismo
    //Override hace referencia al metodo interpret en la interfaz expresion
    @Override
    public int interpret() {
        return number;
    }
}
