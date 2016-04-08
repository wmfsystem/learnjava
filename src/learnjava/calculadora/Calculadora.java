package learnjava.calculadora;

/**
 *
 * @author fernando
 */
public class Calculadora implements Calculavel {

    @Override
    public double somar(double... numeros) {
        double resultado = 0;
        for (double d : numeros) {
            resultado = resultado + d;
        }
        return resultado;
    }

    @Override
    public double subtrair(double... numeros) {
        double resultado = 0;
        for (int x = 0; x < numeros.length; x++) {
            if (x == 0) {
                resultado = numeros[x];
            } else {
                resultado = resultado - numeros[x];
            }
        }
        return resultado;
    }

    @Override
    public double dividir(double... numeros) {
        double resultado = 0;
        for (int x = 0; x < numeros.length; x++) {
            if (x == 0) {
                resultado = numeros[x];
            } else {
                resultado = resultado / numeros[x];
            }
        }
        return resultado;
    }

    @Override
    public double multiplicar(double... numeros) {
        double resultado = 0;
        for (int x = 0; x < numeros.length; x++) {
            if (x == 0) {
                resultado = numeros[x];
            } else {
                resultado = resultado * numeros[x];
            }
        }
        return resultado;
    }

}
