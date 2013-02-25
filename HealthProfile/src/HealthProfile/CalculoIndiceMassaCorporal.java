package HealthProfile;

public class CalculoIndiceMassaCorporal {
	private Pessoa pessoa;
	private double IMC;
	private CalculoFrequenciaCardiaca calculo;

	public CalculoIndiceMassaCorporal(Pessoa pessoa, CalculoFrequenciaCardiaca C) {
		this.pessoa = pessoa;
		this.calculo = C;

	}
	/**
	 * 
	 * IMC é sigla de Índice de Massa Corpórea, uma medida para se determinar se uma pessoa está abaixo, em seu peso ideal, ou acima do peso.
	 */

	public void CalculoImC() {
		this.IMC = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
		if (IMC < 18.5) {
			System.out.println("Sob peso");

		}
		if (IMC > 18.5 && IMC < 24.9) {
			System.out.println("Peso Normal "+pessoa.getPeso()+"Kg");
		}
		if (IMC > 25 && IMC < 29.9) {
			System.out.println("Acima do peso "+pessoa.getPeso()+"Kg");
		}
		if (IMC > 30) {
			System.out.println("Obeso");
		}

	}

	public void imprimeDados() {
		calculo.ImprimirDados();

	}

	public double getIMC() {
		return IMC;
	}

	public void setIMC(double iMC) {
		IMC = iMC;
	}

}
