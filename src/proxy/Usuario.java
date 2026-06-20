package proxy;

public class Usuario {
    private String nome;
    private boolean professor;

    public Usuario(String nome, boolean professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() { return nome; }
    public boolean isProfessor() { return professor; }
}
