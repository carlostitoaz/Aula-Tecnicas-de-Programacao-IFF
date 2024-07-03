package questao_4.filaSequencial;

public class FilaImplementada implements Fila{
    private static final int TAMANHO_MAXIMO = 20;
    private int[] array;
    private int tamanho;

    public FilaImplementada(){
        this.array = new int[TAMANHO_MAXIMO];
        this.tamanho = 0;
    }

    public void inserir(int dado){
        if(tamanho >= TAMANHO_MAXIMO){
            throw new IllegalStateException("Fila cheia");
        }

        array[this.tamanho] = dado;
        tamanho++;
    }

    public int remover(){
        if(estaVazio()){
            throw new IllegalStateException("Fila esta vazia");
        }

        int valor = array[0];
        //array[this.primeiro] = null;

        for(int i=0; i < this.tamanho - 1; i++){
            array[i] = array[i + 1];
        }

        array[tamanho - 1] = 0;
        tamanho--;
        return valor;
    }

    public int obterPrimeiro(){
        if(estaVazio()){
            throw new IllegalStateException("Fila esta vazia");
        }

        return array[0];
    }

    public boolean estaVazio(){
        return tamanho == 0;
    }   
    
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i <= TAMANHO_MAXIMO - 1; i++){
            sb.append(array[i]).append(" ");
        }
        return sb.toString();
    }
}
