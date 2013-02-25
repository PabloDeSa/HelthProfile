package HealthProfile;

public class CalculoFrequenciaCardiaca {
	private Pessoa pessoa;
	private int freqCardicacamax;
	private int freqCardiacaAlvo1;
	private int freqcaidiacaAlvo2;
	/**
	 * 
	 * @param pessoa Pessoa que vai receber o calculo de frequência cardíaca
	 */
	public CalculoFrequenciaCardiaca(Pessoa p){
		this.pessoa= p;
	}
	/**
	 * Método que faz o calculo de frequência cardíaca
	 */
	public void CalculoFreqCardiaca(){
		this.freqCardicacamax=220-pessoa.getIdade();
		this.freqCardiacaAlvo1=freqCardicacamax*50/100;
		this.freqcaidiacaAlvo2=freqCardicacamax*65/100;
	
	}
	/**
	 * Método que faz impressão dos dados da pessoa junto com sua frequência cardíaca e sua frequência cardíaca alvo 
	 * 
	 */
	public void ImprimirDados(){
		pessoa.imprimeDados();
		System.out.println("Sua frequência cardíaca máxima durante o exercíco é: "+freqCardicacamax);
		System.out.println("Sua frequência cardíaca  alvo esta entre "+freqCardiacaAlvo1+" e "+freqcaidiacaAlvo2+" bpm");
	}
}
