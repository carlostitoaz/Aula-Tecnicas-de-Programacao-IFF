package questao_3;

public interface Fila { //queue
    public void adicionar(int dado);
    public int remover();
    public int obterNoPrimeiro();
    public boolean estaVazio();
    public String toString();
}
