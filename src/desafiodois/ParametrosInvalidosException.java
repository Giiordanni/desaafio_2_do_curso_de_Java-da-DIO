package desafiodois;


public class ParametrosInvalidosException extends Exception{

	ParametrosInvalidosException(int num1,int num2) throws ParametrosInvalidosException{
		
	}
	
	@Override
	public String toString() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}

}
