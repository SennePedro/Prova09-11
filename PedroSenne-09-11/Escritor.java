public class Escritor {

    private String nome;

    private int ideias;

    private Recurso recurso;

    private String estado = "levantando";

    public Escritor(String nome, Recurso recurso) {
        this.nome = nome;
        this. recurso = recurso;
    }

    public String getnome() {
        return nome;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public int getIdeias() {
        return ideias;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
    
    public void setIdeias(int ideias) {
        this.ideias = ideias;
    }
}