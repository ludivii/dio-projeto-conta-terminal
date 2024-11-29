
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, digite o seu nome! ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o número da agência! ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da conta! ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o saldo da conta! ");
        double saldo = sc.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.println(conta.contaCriada());
    
        sc.close();
    }
}
