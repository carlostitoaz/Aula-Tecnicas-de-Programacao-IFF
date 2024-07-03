package questao_4.filaEncadeada;

public interface Fila { //queue
    public void adicionar(int dado);
    public int remover();
    public int obterNoPrimeiro();
    public boolean estaVazio();
    public String toString();
}
