package desafiodois;


public class ParametrosInvalidosException extends Exception{

	ParametrosInvalidosException(String message) {
		super(message);
	}
	
	
	ParametrosInvalidosException() {
		super("O segundo parâmetro deve ser maior que o primeiro");
	}
	

}
