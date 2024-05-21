import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("digite o numero da agência ");
        String agencia = scanner.next();

        System.out.println("Digte o nome do cliente ");
        String nomeCliente = scanner.next();

        System.out.println("digite o seu saldo");
        double saldo = scanner.nextDouble();

        

        System.out.println(" olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque ");

       
    }



    
}
