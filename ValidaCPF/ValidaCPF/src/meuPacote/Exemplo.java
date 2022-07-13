package meuPacote;
import meuPacote.validaCPF;
import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = ler.next();

        System.out.printf("\nResultado: ");
        // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (validaCPF.isCPF(CPF) == true)
            System.out.printf("%s\n", validaCPF.imprimeCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n");
    }
}
