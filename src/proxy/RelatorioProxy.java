package proxy;

import java.util.List;

public class RelatorioProxy implements IRelatorio {
    private Relatorio relatorio;
    private String nomeAluno;
    private List<Integer> notas;

    public RelatorioProxy(String nomeAluno, List<Integer> notas) {
        this.nomeAluno = nomeAluno;
        this.notas = notas;
    }

    @Override
    public String getNomeAluno() {
        return nomeAluno;
    }

    @Override
    public List<Integer> getNotas(Usuario usuario) {
        if (usuario.isProfessor()) {
            if (relatorio == null) {
                relatorio = new Relatorio(nomeAluno, notas);
            }
            return relatorio.getNotas(usuario);
        } else {
            throw new RuntimeException("Acesso negado: apenas professores podem visualizar as notas.");
        }
    }
}
