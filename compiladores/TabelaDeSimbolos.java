package compiladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TabelaDeSimbolos {	
	
	HashMap<String, Integer> tabelaSimbolos;
	List<ElementoTabelaSimbolo> palavrasReservadas;
	
	public TabelaDeSimbolos() {
		
		this.tabelaSimbolos = new HashMap<String, Integer>();
		this.palavrasReservadas = DefinirPalavrasReservadas();
		
		for(int i = 0; i < palavrasReservadas.size(); i++) {
	    	tabelaSimbolos.put(palavrasReservadas.get(i).lexema, palavrasReservadas.get(i).token.ordinal());
	    }
		
		// Integer pos = InserirNaTabela(38, "id123", tabelaSimbolos);	    
	    //System.out.println(pos);   
	    //System.out.println(tabelaSimbolos);
	}	 
	 	 
	 public Integer InserirNaTabela(Token token, String lexema) {
		 
		 tabelaSimbolos.put(lexema, token.ordinal());
		 return tabelaSimbolos.get(lexema);
	 }
	 
	 public Integer PesquisarNaTabela(String lexema) {
		 
		 if(tabelaSimbolos.get(lexema) != null)
			 return tabelaSimbolos.get(lexema);
		 else 
			 return null;
	 }	 
	 
	 private static List<ElementoTabelaSimbolo> DefinirPalavrasReservadas(){
		 
		 List<ElementoTabelaSimbolo> tabelaSimbolos = new ArrayList<>();			 
		 
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.CONST, "const"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.INTEGER, "integer"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.BYTE, "byte"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.STRING, "string"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.WHILE, "while"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.IF, "if"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.ELSE, "ELSE"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.AND, "and"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.OR, "or"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.NOT, "not"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.IGUAL, "="));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.ATRIBUICAO, "=="));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.ABRE_PARENTESES, "("));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.FECHA_PARENTESES, ")"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MENOR_QUE, "<"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MAIOR_QUE, ">"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.DIFERENTE_DE, "!="));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MAIOR_OU_IGUAL_QUE, ">="));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MENOR_OU_IGUAL_QUE, "<="));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.VIRGULA, ","));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MAIS, "+"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MENOS, "-"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MULTIPLICACAO, "*"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.DIVISAO, "/"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.PONTO_VIRGULA, ";"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.BEGIN, "begin"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.END, "end"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.THEN, "then"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.READLN, "readln"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.MAIN, "main"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.WRITE, "write"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.WRITELN, "writeln"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.TRUE, "true"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.FALSE, "false"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.BOOLEAN, "boolean"));
		 tabelaSimbolos.add(new ElementoTabelaSimbolo(Token.QUEBRA_LINHA, "\n"));
		 
		 return tabelaSimbolos;
	 }
}