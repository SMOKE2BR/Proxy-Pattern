package proxy;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        IRelatorio relatorio = new RelatorioProxy("Vinícius", Arrays.asList(8, 9, 10));

        Usuario professor = new Usuario("Carlos", true);
        Usuario aluno = new Usuario("Maria", false);

        System.out.println("Aluno: " + relatorio.getNomeAluno());
        System.out.println("Notas (professor): " + relatorio.getNotas(professor));

        try {
            System.out.println("Notas (aluno): " + relatorio.getNotas(aluno));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
