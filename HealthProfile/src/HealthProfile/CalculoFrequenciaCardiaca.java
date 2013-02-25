package HealthProfile;

public class CalculoFrequenciaCardiaca {
	private Pessoa pessoa;
	private int freqCardicacamax;
	private int freqCardiacaAlvo1;
	private int freqcaidiacaAlvo2;
	/**
	 * 
	 * @param pessoa Pessoa que vai receber o calculo de frequ�ncia card�aca
	 */
	public CalculoFrequenciaCardiaca(Pessoa p){
		this.pessoa= p;
	}
	/**
	 * M�todo que faz o calculo de frequ�ncia card�aca
	 */
	public void CalculoFreqCardiaca(){
		this.freqCardicacamax=220-pessoa.getIdade();
		this.freqCardiacaAlvo1=freqCardicacamax*50/100;
		this.freqcaidiacaAlvo2=freqCardicacamax*65/100;
	
	}
	/**
	 * M�todo que faz impress�o dos dados da pessoa junto com sua frequ�ncia card�aca e sua frequ�ncia card�aca alvo 
	 * 
	 */
	public void ImprimirDados(){
		pessoa.imprimeDados();
		System.out.println("Sua frequ�ncia card�aca m�xima durante o exerc�co �: "+freqCardicacamax);
		System.out.println("Sua frequ�ncia card�aca  alvo esta entre "+freqCardiacaAlvo1+" e "+freqcaidiacaAlvo2+" bpm");
	}
}
