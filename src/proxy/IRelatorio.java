package proxy;

import java.util.List;

public interface IRelatorio {
    String getNomeAluno();
    List<Integer> getNotas(Usuario usuario);
}
