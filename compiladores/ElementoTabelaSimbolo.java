package compiladores;

public class ElementoTabelaSimbolo {
	//Token token;
	byte token_;
	String lexema;	
	
	public ElementoTabelaSimbolo(byte token_,  String lexema) {
		//this.token = token;
		this.token_=token_;
		this.lexema = lexema;
	}	
	
	public String getLexema() {
		return lexema;
	}
	public void setLexema(String lexema){
		this.lexema = lexema;	
	}
	public byte getToken() {
		return token_;
	}
	public void setToken(byte token_){
		this.token_ = token_;	
	}
}
