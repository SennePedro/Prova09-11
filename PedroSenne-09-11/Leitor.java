public class Leitor implements Runnable{

    private String nome;

    private Recurso recursoAtual;

    private int tedio;

    private int leituras;

    private final static int LEITURAS_TOTAIS = 20;

    private String estado = "levantando";

    public Leitor(String nome) {

    }

    public String getNome() {
        return nome;
    }

    public Recurso getRecursoAtual() {
        return recursoAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRecursoAtual(Recurso recurso) {
        this.recursoAtual = recurso;
    }

    public boolean temRecurso() {
        if (recursoAtual != null){
            return true;
        }
        else {
            return false;
        }
    }

    private void relaxar() {
        this.estado = "relaxando";
        this.tedio++;
        this.relaxando();
    }

    private void relaxando() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {

        }
    }

    private void ler() {
        this.estado = "procurando recursos";
        
        while (!this.temRecurso()) {
            
        }
    }
    @Override
    public void run() {
        try {
            while (this.leituras < LEITURAS_TOTAIS) {
                this.
            }
        }
    }
}
