public class Recurso {
    
    private String nome;
    
    private Escritor escritor;

    private boolean sendoUsado;

    public Escritor getEscritor() {
        return escritor;
    }

    public String getNome() {
        return nome;
    }

    public boolean getSendoUsado() {
        return sendoUsado;
    }

    public void setEscritor(Escritor escritor) {
        this.escritor = escritor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSendoUsado(boolean sendoUsado) {
        this.sendoUsado = sendoUsado;
    }

    
}
