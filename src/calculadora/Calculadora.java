package calculadora;

public class Calculadora {

    static Modelo mod = new Modelo();

    public static void main(String[] args) {
        Vista.introducir(mod);
        mod.setResultado(Calculadora.realizaOperacion(mod.getNum1(), mod.getNum2(), mod.getOperacion()));
        Vista.imprimir(mod);  
    }

    public static float realizaOperacion(float n1, float n2, String op) {
        
        
        float resul = 10;
        if ("sumar".equals(op)) {
            resul = (n1 + n2);
            mod.setResultado(resul);
            return resul;
        }
        if ("restar".equals(op)) {
            resul = n1 - n2;
            mod.setResultado(resul);
            return resul;
        }
        if ("multiplicar".equals(op)) {
            resul = n1 * n2;
            mod.setResultado(resul);
            return resul;
        }
        if ("dividir".equals(op)) {
            resul = n1 / n2;
            mod.setResultado(resul);
            return resul;
        }
        return resul;

    }

}
