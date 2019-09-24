package compiladores;

public class Principal {
	public static void main(String[] args){
		
		AnalisadorLexico analisador = new AnalisadorLexico(1);
		
		// precisa ler o arquivo fonte e passar para o analisador lexico
		// o devolver ainda precisa ser desenvolvido
		
		analisador.Analisar("id1a3= \n aaç");
		System.out.println(analisador.registroLexico.lexema);
	}	
}
