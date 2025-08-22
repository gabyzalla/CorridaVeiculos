import java.util.Scanner;

public class CorridaVeiculos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Corrida de Veículos!");
        System.out.println("1: Carro");
        System.out.println("2: Moto");
        System.out.println("3: Bicicleta");

        System.out.print("Escolha o primeiro veículo: ");
        int escolha1 = scanner.nextInt();
        Veiculo veiculo1 = criarVeiculo(escolha1);

        System.out.print("Escolha o segundo veículo: ");
        int escolha2 = scanner.nextInt();
        Veiculo veiculo2 = criarVeiculo(escolha2);

        scanner.close();

        if (veiculo1 != null && veiculo2 != null) {
            System.out.println("\nVeículos escolhidos: " + veiculo1.getNome() + " vs " + veiculo2.getNome());

            System.out.print(veiculo1.getNome() + ": ");
            veiculo1.mover();

            System.out.print(veiculo2.getNome() + ": ");
            veiculo2.mover();
        } else {
            System.out.println("\nEscolha inválida.");
        }
    }

    // Fábrica de veículos
    public static Veiculo criarVeiculo(int escolha) {
        if (escolha == 1) {
            return new Carro();
        } else if (escolha == 2) {
            return new Moto();
        } else if (escolha == 3) {
            return new Bicicleta();
        } else {
            return null;
        }
    }
}