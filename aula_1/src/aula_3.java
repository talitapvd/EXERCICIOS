import java.util.Scanner;
public class aula_3 {
    public static void main(String[] args) {
        float salario;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário do Funcionario: ");
        salario = ler.nextFloat();
        System.out.println("Salário liquido: "+(salario * 1.05) * 0.93);
    }
}