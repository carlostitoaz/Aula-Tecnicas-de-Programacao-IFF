package lista_encadeada;
//package lista_encadeada;

public class principal {

	public static void main(String[] args) {
		ListaEncadeadaSimples listaEncadeada = new ListaEncadeadaSimples();
		
		System.out.println("\n------------ Incluir em ordem crescente ------------");
		listaEncadeada.incluiCrescente(10);
        listaEncadeada.incluiCrescente(5);
        listaEncadeada.incluiCrescente(20);
        listaEncadeada.incluiCrescente(3);

		System.out.println(listaEncadeada); //O mesmo que: System.out.println(listaEncadeada.toString());
			
		System.out.println("\n\n------------ Após a exclusão do elemento ------------");	
		System.out.println(listaEncadeada.excluirNoValor(20));
		System.out.println(listaEncadeada);

	}
}
