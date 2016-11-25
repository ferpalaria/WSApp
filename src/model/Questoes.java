package rovapp;

import java.util.ArrayList;

public class Questoes {
	private int numDaQuestao;
	private String enunciado;
	private String respErrada1;
	private String respErrada2;
	private String respCerta;
	
	public int getNumDaQuestao() {
		return numDaQuestao;
	}
	public void setNumDaQuestao(int numDaQuestao) {
		this.numDaQuestao = numDaQuestao;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getRespErrada1() {
		return respErrada1;
	}
	public void setRespErrada1(String respErrada1) {
		this.respErrada1 = respErrada1;
	}
	public String getRespErrada2() {
		return respErrada2;
	}
	public void setRespErrada2(String respErrada2) {
		this.respErrada2 = respErrada2;
	}
	public String getRespCerta() {
		return respCerta;
	}
	public void setRespCerta(String respCerta) {
		this.respCerta = respCerta;
	}

	

	public ArrayList<Questoes> listarQuestao(){
		
		ArrayList<Questoes> listarQuestao = new ArrayList<Questoes>();
		
		
		Questoes q1 = new Questoes();
		q1.setNumDaQuestao(1);
		q1.setEnunciado("Quais Tecnologias são usadas no IoT?");
		q1.setRespErrada1("iptable, virtualização e docker");
		q1.setRespErrada2("Aws, jenkins e GIT");
		q1.setRespCerta("Bluetooth, Wi-fi e NFC");
		
		Questoes q2 = new Questoes();
		q2.setNumDaQuestao(2);
		q2.setEnunciado("O que é M2M?");
		q2.setRespErrada1("Mecanismo de comunicação dos elementos Metal a Madeira");
		q2.setRespErrada2("Método ágil de comunicação Maquina a Maquina");
		q2.setRespCerta("Mecaninsmo de comunicação Maquina a Maquina");
		
		listarQuestao.add(q1);
		listarQuestao.add(q2);
		
		return listarQuestao;
	}
	
}
