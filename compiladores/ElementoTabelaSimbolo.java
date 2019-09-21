package compiladores;

public class ElementoTabelaSimbolo {
	Token token;
	String lexema;	
	
	public ElementoTabelaSimbolo(Token const1, String lexema) {
		this.token = const1;
		this.lexema = lexema;
	}	
	
	public String getLexema() {
		return lexema;
	}
}
