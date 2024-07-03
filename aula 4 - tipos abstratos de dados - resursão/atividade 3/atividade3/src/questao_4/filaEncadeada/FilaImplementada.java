package questao_4.filaEncadeada;

public class FilaImplementada implements Fila{
    private No primeiroNo, ultimoNo;

    public FilaImplementada(){
        primeiroNo = null;
        ultimoNo = null;
    }

    public void adicionar(int dado){
        No novoNo = new No(dado);

        if(estaVazio()){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.definirProximo(novoNo);
            ultimoNo = novoNo;
        }
    }
    
    public int remover(){
        if(estaVazio()){
            throw new IllegalStateException("Fila está vazia.");
        }
        int valor = primeiroNo.obterDado();
        primeiroNo = primeiroNo.obterProximo();

        if(primeiroNo == null){
            ultimoNo = null;
        }

        return valor;
    }

    public int obterNoPrimeiro(){
        if(estaVazio()){
            throw new IllegalStateException("Fila está vazia");
        }

        return primeiroNo.obterDado();
    }

    public boolean estaVazio(){
        return primeiroNo == null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        No noAtual = primeiroNo;

        while(noAtual != null){
            sb.append(noAtual.obterDado()).append(" ");
            noAtual = noAtual.obterProximo();
        }
        return sb.toString();
    }
}