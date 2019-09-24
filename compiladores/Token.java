package compiladores;

public enum Token {
	
	ERRO(0),
	ID(1),
	CONSTANTE(2),
	CONST(1),
	INTEGER(2),
	BYTE(3),
	STRING(4),
	WHILE(5),
	IF(6),
	ELSE(7),
	AND(8),
	OR(9),
	NOT(10),
	ATRIBUICAO(11),
	IGUAL(12),	
	ABRE_PARENTESES(13),
	FECHA_PARENTESES(14),
	MENOR_QUE(15),
	MAIOR_QUE(16),
	DIFERENTE_DE(17),
	MAIOR_OU_IGUAL_QUE(18),
	MENOR_OU_IGUAL_QUE(19),
	VIRGULA(20),
	MAIS(21),
	MENOS(22),
	MULTIPLICACAO(23),
	DIVISAO(24),
	PONTO_VIRGULA(25),
	BEGIN(26),
	END(27),
	THEN(28),
	READLN(29),
	MAIN(30),
	WRITE(31),
	WRITELN(32),
	TRUE(33),
	FALSE(34),
	BOOLEAN(35),
	EOF(36);
	
	public final Integer indice;
	
	private Token(Integer indice) {
		this.indice = indice;
	}
}
