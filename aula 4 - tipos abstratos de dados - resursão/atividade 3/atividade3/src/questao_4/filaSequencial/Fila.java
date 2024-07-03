package questao_4.filaSequencial;

public interface Fila {
    public void inserir(int dado);
    public int remover();
    public int obterPrimeiro();
    public boolean estaVazio();
    public String toString();
}
