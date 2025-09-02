import java.util.Scanner;

// Classe principal - contém o menu e a interação com o usuário
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int op = -1; // opção do menu

        // laço que mantém o programa rodando até o usuário escolher sair (op = 0)
        while (op != 0) {
            // menu
            System.out.println("\n===== PLAYLIST =====");
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Remover música");
            System.out.println("3 - Listar músicas");
            System.out.println("4 - Duração total");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            op = sc.nextInt();
            sc.nextLine(); // consome o Enter que sobra no buffer

            // decisões do menu
            if (op == 1) {
                // adicionar
                System.out.print("Título: ");
                String t = sc.nextLine();

                System.out.print("Artista: ");
                String a = sc.nextLine();

                System.out.print("Duração (em minutos, ex: 3.5): ");
                double d = sc.nextDouble();
                sc.nextLine();

                Musica m = new Musica(t, a, d);
                playlist.adicionar(m);

            } else if (op == 2) {
                // remover
                System.out.print("Digite o título da música: ");
                String titulo = sc.nextLine();
                playlist.removerPorTitulo(titulo);

            } else if (op == 3) {
                // listar
                playlist.listar();

            } else if (op == 4) {
                // duração total
                playlist.duracaoTotal();

            } else if (op == 0) {
                // sair
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
