package HealthProfile;

import java.util.Calendar;

public class Pessoa {
	private double IMC;
	private String nome;
	private String sobreNome;
	private int mesNascimento;
	private int anoNascimnento;
	private int diaNascimento;
	private int idade;
	private double peso;
	private double altura;
	private int freqCardicacamax;
	private int freqCardiacaAlvo1;
	private int freqcaidiacaAlvo2;

	/**
	 * * @param freqCardiacamax mostra o calculo da frequencia cardicaca maxima
	 * de uma pessoa * @param IMC massa corporal da pessoa
	 * 
	 * @param nome
	 *            nome da pessoa
	 * @param sobrenome
	 *            sobrenome da pessoa
	 * @param mesNascimento
	 *            Mês nascimento da pessoa
	 * @param anoNascimento
	 *            Ano de nascimento da pessoa
	 * @param diaNascimento
	 *            Dia de nascimento da pessoa
	 * @param idade
	 *            idade da pessoa após o calculo através da data de nascimento
	 * @param peso
	 *            Peso da pessoa
	 * @param Altura
	 *            da pessoa
	 */


	public Pessoa(String nome, String sobreNome, int diaNascimento,
		  int mesNasciemnto,int anoNascimento, double peso, double altura) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.anoNascimnento = anoNascimento;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNasciemnto;
		this.altura = altura;
		this.peso = peso;
	}
	
	/**
	 * 
	 * Metodo que faz perfil de Saude de uma pessoa
	 */

	
	public void registroSaude() {
		this.calculoIdade(diaNascimento, mesNascimento, anoNascimnento);
		this.CalculoFreqCardiaca();
		this.CalculoImC();
		this.imprimeDados();

	}
	/**
	 * 
	 * Metodo que faz o calculo de massa corporal de uma pessoa
	 */

	public void CalculoImC() {
		this.IMC = this.peso / (this.altura * this.altura);
		if (IMC < 18.5) {
			System.out.println("Sob peso");

		}
		if (IMC > 18.5 && IMC < 24.9) {
			System.out.println("Peso Normal " + this.peso + "Kg");
		}
		if (IMC > 25 && IMC < 29.9) {
			System.out.println("Acima do peso " + this.peso + "Kg");
		}
		if (IMC > 30) {
			System.out.println("Obeso");
		}

	}



	
/**
 * 
 * Metodo que faz o calculo da idade, atrav�s da data de nascimento
 */
public void calculoIdade(int dia, int mes, int ano) {
		Calendar dataAtual = Calendar.getInstance();
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.set(ano, mes, dia);
		int anoNasc = dataNasc.get(Calendar.YEAR);
		int anoAtual = dataAtual.get(Calendar.YEAR);
		if (dataNasc.get(Calendar.MONTH) == dataAtual.get(Calendar.MONTH)) {
			if (dataNasc.get(Calendar.DAY_OF_MONTH) >= dataAtual
					.get(Calendar.DAY_OF_MONTH)) {
				this.idade = anoAtual - anoNasc;
			}
		} else {
			this.idade = anoAtual - anoNasc;
			this.idade = idade - 1;
		}

	}
	/**
	 * 
	 * Metodo que faz o calculo frequência cardíaca da pessoa
	 */
	 
	 public void CalculoFreqCardiaca() {
		this.freqCardicacamax = 220 - this.idade;
		this.setFreqCardiacaAlvo1(freqCardicacamax * 50 / 100);
		this.setFreqcaidiacaAlvo2(freqCardicacamax * 65 / 100);
		System.out
				.println("Sua frequência cardíaca máxima durante o exercíco é: "
						+ freqCardicacamax);
		System.out.println("Sua frequência cardíaca  alvo esta entre "
				+ freqCardiacaAlvo1 + " e " + freqcaidiacaAlvo2 + " bpm");

	}


	
	
/**
 * Metdodo que faz impress�o dos dados da pessoa
 */
	public void imprimeDados() {
		System.out.println("Nome " + nome + " " + sobreNome);
		System.out.println("Idade " + idade);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimnento() {
		return anoNascimnento;
	}

	public void setAnoNascimnento(int anoNascimnento) {
		this.anoNascimnento = anoNascimnento;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
