import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            Calculadora calculadora = (Calculadora) registry.lookup("Calculadora");
            int resultado = calculadora.somar(2, 3);
            System.out.println("2 + 3 = " + resultado);
            resultado = calculadora.subtrair(5, 2);
            System.out.println("5 - 2 = " + resultado);
            resultado = calculadora.multiplicar(3, 4);
            System.out.println("3 * 4 = " + resultado);
            resultado = calculadora.dividir(10, 2);
            System.out.println("10 / 2 = " + resultado);
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
