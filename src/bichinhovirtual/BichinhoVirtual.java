package bichinhovirtual;

import java.util.Scanner;

public class BichinhoVirtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar o animal
        System.out.println("Crie seu novo animal");

        // Nome do animal
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();

        // Escolher a classe do animal
        System.out.println("Escolha a classe do animal:");
        System.out.println("1 - Mammalia (Mamíferos)");
        System.out.println("2 - Aves (Pássaros)");
        System.out.println("3 - Reptilia (Répteis)");
        System.out.println("4 - Amphibia (Anfíbios)");
        System.out.println("5 - Pisces (Peixes)");
        System.out.println("6 - Insecta (Insetos)");

        int classeEscolhida = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        String classe = "";

        switch (classeEscolhida) {
            case 1 -> classe = "Mammalia";
            case 2 -> classe = "Aves";
            case 3 -> classe = "Reptilia";
            case 4 -> classe = "Amphibia";
            case 5 -> classe = "Pisces";
            case 6 -> classe = "Insecta";
            default -> {
                System.out.println("Opção inválida. Usando classe padrão: Mammalia.");
                classe = "Mammalia";
            }
        }

        // Escolher a família do animal
        System.out.println("Escolha a família do animal:");
        String familia = "";

        switch (classeEscolhida) {
            case 1 -> {
                System.out.println("1 - Felidae (Leões, Tigres)");
                System.out.println("2 - Canidae (Lobos, Raposas, Cães)");
                System.out.println("3 - Ursidae (Ursos)");
                System.out.println("4 - Cervidae (Veados)");
                int familiaEscolhida = scanner.nextInt();
                scanner.nextLine();
                switch (familiaEscolhida) {
                    case 1 -> familia = "Felidae";
                    case 2 -> familia = "Canidae";
                    case 3 -> familia = "Ursidae";
                    case 4 -> familia = "Cervidae";
                    default -> familia = "Felidae"; // Valor padrão
                }
            }
            case 2 -> {
                System.out.println("1 - Accipitridae (Águias, Gaviões)");
                System.out.println("2 - Strigidae (Corujas)");
                System.out.println("3 - Psittacidae (Papagaios)");
                System.out.println("4 - Columbidae (Pombas, Rolinha)");
                int familiaEscolhida = scanner.nextInt();
                scanner.nextLine();
                switch (familiaEscolhida) {
                    case 1 -> familia = "Accipitridae";
                    case 2 -> familia = "Strigidae";
                    case 3 -> familia = "Psittacidae";
                    case 4 -> familia = "Columbidae";
                    default -> familia = "Accipitridae";
                }
            }
            case 3 -> {
                System.out.println("1 - Testudinidae (Tartarugas)");
                System.out.println("2 - Serpentes (Cobras)");
                System.out.println("3 - Crocodylidae (Crocodilos)");
                System.out.println("4 - Iguanidae (Iguanas)");
                int familiaEscolhida = scanner.nextInt();
                scanner.nextLine();
                switch (familiaEscolhida) {
                    case 1 -> familia = "Testudinidae";
                    case 2 -> familia = "Serpentes";
                    case 3 -> familia = "Crocodylidae";
                    case 4 -> familia = "Iguanidae";
                    default -> familia = "Testudinidae";
                }
            }
            case 4 -> {
                System.out.println("1 - Ranidae (Rãs)");
                System.out.println("2 - Bufonidae (Sapos)");
                System.out.println("3 - Hylidae (Pererecas)");
                System.out.println("4 - Ambystomatidae (Salamandras)");
                int familiaEscolhida = scanner.nextInt();
                scanner.nextLine();
                switch (familiaEscolhida) {
                    case 1 -> familia = "Ranidae";
                    case 2 -> familia = "Bufonidae";
                    case 3 -> familia = "Hylidae";
                    case 4 -> familia = "Ambystomatidae";
                    default -> familia = "Ranidae";
                }
            }
            case 5 -> {
                System.out.println("1 - Cyprinidae (Carpas)");
                System.out.println("2 - Characidae (Tetras)");
                System.out.println("3 - Cichlidae (Ciclídeos)");
                System.out.println("4 - Salmonidae (Salmões)");
                int familiaEscolhida = scanner.nextInt();
                scanner.nextLine();
                switch (familiaEscolhida) {
                    case 1 -> familia = "Cyprinidae";
                    case 2 -> familia = "Characidae";
                    case 3 -> familia = "Cichlidae";
                    case 4 -> familia = "Salmonidae";
                    default -> familia = "Cyprinidae";
                }
            }
            case 6 -> {
                System.out.println("1 - Formicidae (Formigas)");
                System.out.println("2 - Apidae (Abelhas)");
                System.out.println("3 - Culicidae (Mosquitos)");
                System.out.println("4 - Papilionidae (Borboletas)");
                int familiaEscolhida = scanner.nextInt();
                scanner.nextLine();
                switch (familiaEscolhida) {
                    case 1 -> familia = "Formicidae";
                    case 2 -> familia = "Apidae";
                    case 3 -> familia = "Culicidae";
                    case 4 -> familia = "Papilionidae";
                    default -> familia = "Formicidae";
                }
            }
            default -> System.out.println("Classe inválida.");
        }

        // Criar o objeto Animal e exibir os dados iniciais
        Animal animal = new Animal(nome, classe, familia);
        animal.exibirStatus();

        // Loop de ações
        int opcao = 0;
        while (animal.isVivo()) {
            System.out.println("O que o " + nome + " vai fazer agora?");
            System.out.println("1- Comer");
            System.out.println("2- Correr");
            System.out.println("3- Dormir");
            System.out.println("4- Morrer");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1 -> animal.comer();
                case 2 -> animal.correr();
                case 3 -> animal.dormir();
                case 4 -> animal.morrer();
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            
            // Verifica se o animal ainda está vivo após cada ação
            if (!animal.isVivo()) {
                System.out.println("O animal morreu!");
                System.out.println("GAME OVER!");
                break;
            }
            
            // Exibir status do bichinho após a ação
            animal.exibirStatus();

            // Pausar para que o usuário veja as informações
            try {
                Thread.sleep(1500); // Pausa de 1,5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
