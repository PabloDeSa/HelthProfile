package HealthProfile;

import java.util.Calendar;

public class Pessoa {
	private String nome;
	private String sobreNome;
	private int mesNascimento;
	private int anoNascimnento;
	private int diaNascimento;
	private int idade;
	private double peso;
	private double altura;
	/**
	 * @param nome nome da pessoa
	 * @param sobrenome sobrenome da pessoa			
	 * @param mesNascimento Mês nascimento da pessoa
	 * @param 	anoNascimento Ano de nascimento da pessoa
	 * @param diaNascimento Dia de nascimento da pessoa
	 * @param idade idade da pessoa após o calculo através da data de nascimento
	 * @param  peso Peso da pessoa
	 * @param Altura da pessoa
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
/**
 * 
 * Metodo que faz o calculo da idade, através da data de nascimento
 */
	public void calculoIdade(int dia, int mes, int ano) {
		Calendar dataAtual = Calendar.getInstance();
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.set(ano, mes, dia);
		int anoNasc = dataNasc.get(Calendar.YEAR);
		int anoAtual = dataAtual.get(Calendar.YEAR);
		this.idade = anoAtual - anoNasc;

	}
	/**
	 * 
	 * Metodo que faz perfil de Saude de uma pessoa
	 */

	public void registroSaude() {
		Pessoa p = new Pessoa(nome, sobreNome, diaNascimento,anoNascimnento,mesNascimento,  peso, altura);
		p.calculoIdade(diaNascimento, mesNascimento, anoNascimnento);
		CalculoFrequenciaCardiaca calc= new CalculoFrequenciaCardiaca(p);
		calc.CalculoFreqCardiaca();
		CalculoIndiceMassaCorporal 	massa= new CalculoIndiceMassaCorporal(p,calc);
		massa.CalculoImC();
		massa.imprimeDados();
		
	}
/**
 * Metdodo que faz impressão dos dados da pessoa
 */
	public void imprimeDados() {
		System.out.println("Nome " + nome + " " + sobreNome);
		System.out.println("Idade " + idade);
		System.out.println("Data de nascimento : " + diaNascimento + "/"
				+ mesNascimento + "/" + anoNascimnento);
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
