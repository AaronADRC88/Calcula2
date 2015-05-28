package calculadora;

public class Calculadora {

    static Modelo mod = new Modelo();

    public Calculadora() {
    }

    public static void main(String[] args) {
        Vista.introducir(mod);
        Calculadora cal=new Calculadora();
        mod.setResultado(cal.realizaOperacion(mod.getNum1(), mod.getNum2(), mod.getOperacion()));
        Vista.imprimir(mod);  
    }

    public  Float realizaOperacion(Float n1, Float n2, String op) {
        
        
        Float resul = 0.0F;
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
