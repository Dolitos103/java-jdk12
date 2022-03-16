
public class Main {
	
	private enum DIA_SEMANA {SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO};

	public static void main(String[] args) {
		novosMtodosString();
		
		System.out.println(switchTradicional(DIA_SEMANA.QUARTA));
	}
	
	// novas funcionalidade de indent e transform
	private static void novosMtodosString() {
		String resultado = "Olá\nMundo!".indent(3);
		System.out.println(resultado);
		
		
		resultado = "Olá".transform(s -> s + ", Mundo ?");
		System.out.println(resultado);
		
		resultado = "Olá"
				.transform(s -> s + "mundo!")
				.transform(String::toUpperCase);
		
		System.out.println(resultado);
				
	}
	
	private static String switchTradicional(DIA_SEMANA dia) {
		String resultado = null;
		
		switch(dia) {
			case SEGUNDA:
			case TERCA:
			case QUARTA:
			case QUINTA:
			case SEXTA:
				resultado = "Dia Ultil";
				break;
			case SABADO:
			case DOMINGO:
				resultado = "Final de semana";
				break;
			default: resultado = "Dia invalido";
		}
		
		return resultado;
	
	}
	
	// não é uma atualização real do java 12 liberado apenas no 13
//	private static String novoSwitch(DIA_SEMANA dia) {
//		String resultado = null;
//		
//		switch(dia) {
//			case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA  -> resultado = "Dia Ultil";
//
//			case SABADO, DOMINGO -> resultado = "Final de semana";
//
//			default: resultado = "Dia invalido";
//		}
//		
//		return resultado;
//		
//	}

}
