import java.io.*;
import java.util.*;

public class Mochila extends ComponentesDoJogo {
    private List<String> itens;

    public Mochila() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void removerItem(String item) {
        itens.remove(item);
    }

    public List<String> getItens() {
        return itens;
    }

    @Override
    public void renderizar() {
        System.out.println("Mochila:");
        for (String item : itens) {
            System.out.println("- " + item);
        }
    }


    // uso das interfaces de renderização e de salvamento para a mochila 
    @Override
    public void salvar (BufferedWriter writer) throws IOException {
        writer.write("Mochila\n");
        for (String item : itens) {
            writer.write(item + "\n");
        }
        writer.write("\n");
    }

    @Override
    public void carregar(BufferedReader reader) throws IOException {
        String line;
        itens.clear();
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            itens.add(line);
        }
    }

    @Override
    public void atualizar() {
        // Implementação para atualizar o estado da mochila, se necessário
    }
}
