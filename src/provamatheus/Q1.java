package provamatheus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {

    public static String gerarPais() {

        List<String> paises = Arrays.asList("brasil", "argentina", "uruguai",
                "paraguai", "estados unidos", "canadá", "mexico", "bolivia",
                "peru", "chile");

        Collections.shuffle(paises);
        return paises.get(0);
    }
    
    public static void main(String[] args) {
        System.out.println(gerarPais());
    }
}
