import java.util.ArrayList;

// Classe que representa a playlist (coleção de músicas)
public class Playlist {
    // aqui guardamos todas as músicas
    private ArrayList<Musica> musicas = new ArrayList<>();

    // adiciona uma música na playlist
    public void adicionar(Musica m) {
        musicas.add(m);
        System.out.println("Música adicionada!");
    }

    // remove músicas pelo título (ignora maiúscula/minúscula)
    public void removerPorTitulo(String titulo) {
        boolean achou = false;

        // percorre a lista procurando pelo título
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                musicas.remove(i);
                System.out.println("Música removida!");
                achou = true;
                break; // para no primeiro que achar
            }
        }

        if (!achou) {
            System.out.println("Música não encontrada.");
        }
    }

    // lista todas as músicas
    public void listar() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
        } else {
            for (int i = 0; i < musicas.size(); i++) {
                System.out.println((i + 1) + ". " + musicas.get(i));
            }
        }
    }

    // calcula a duração total da playlist
    public void duracaoTotal() {
        double total = 0;

        // soma a duração de cada música
        for (Musica m : musicas) {
            total += m.getDuracaoMin();
        }

        int minutos = (int) total;
        int segundos = (int) Math.round((total - minutos) * 60);

        System.out.println("Duração total: " + total + " min (~" + String.format("%02d:%02d", minutos, segundos) + ")");
    }
}
