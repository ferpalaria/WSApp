package model;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	//metodo fake para retornar lista de pessoas
	public ArrayList<Pessoa> listaPessoa(){
		
		ArrayList<Pessoa> listPessoa = new ArrayList<>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Julio");
		p1.setIdade(29);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Anderson");
		p2.setIdade(21);
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Keivin");
		p3.setIdade(22);
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Gilson");
		p4.setIdade(20);
		
		Pessoa p5 = new Pessoa();
		p5.setNome("Guilherme");
		p5.setIdade(25);
		
		listPessoa.add(p1);
		listPessoa.add(p2);
		listPessoa.add(p3);
		listPessoa.add(p4);
		listPessoa.add(p5);
		
		
		return listPessoa;
	}
	
	
}