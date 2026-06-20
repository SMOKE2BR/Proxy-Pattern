package proxy;

import java.util.List;

public class Relatorio implements IRelatorio {
    private String nomeAluno;
    private List<Integer> notas;

    public Relatorio(String nomeAluno, List<Integer> notas) {
        this.nomeAluno = nomeAluno;
        this.notas = notas;
    }

    @Override
    public String getNomeAluno() {
        return nomeAluno;
    }

    @Override
    public List<Integer> getNotas(Usuario usuario) {
        return notas;
    }
}
