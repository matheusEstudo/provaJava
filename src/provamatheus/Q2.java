package provamatheus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2 {
    
    

    public static String gerarNome() {
        List<String> listaNome = Arrays.asList("matheus", "jonathas", "vitor",
                "nataly", "luiza", "maria", "silvio",
                "joão", "vinicius", "heloisa", "livia",
                "luciana", "carlos", "carla", "mário");
        Collections.shuffle(listaNome);

        return listaNome.get(0);
    }

    public static void gerar2Nome() {
        String nome1 = gerarNome();
        String nome2 = "";

        while (true) {
            nome2 = gerarNome();

            if (!nome1.equals(nome2)) {
                break;
            }
        }
        System.out.println("1° nome: " + nome1);
        System.out.println("2° nome: " + nome2);

    }
    
    public static void main(String[] args) {
        gerar2Nome();
    }
}
