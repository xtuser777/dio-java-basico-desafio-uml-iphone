package br.com.xt.dio.challenge.java.iphone;

import br.com.xt.dio.challenge.java.iphone.functions.Cellphone;
import br.com.xt.dio.challenge.java.iphone.functions.MusicPlayer;
import br.com.xt.dio.challenge.java.iphone.functions.WebBrowser;

public class IPhone implements MusicPlayer, Cellphone, WebBrowser {

	@Override
	public void showPage() {
		System.out.println("Visualizando a página da Web");
	}

	@Override
	public void addNewTab() {
		System.out.println("Adicinando nova aba da Web");
	}

	@Override
	public void updatePage() {
		System.out.println("Atualizando a página da Web");
	}

	@Override
	public void call() {
		System.out.println("Realizando a chamada");
	}

	@Override
	public void answer() {
		System.out.println("Atendendo a chamada");
	}

	@Override
	public void startVoiceMall() {
		System.out.println("Iniciando correio de voz");
	}

	@Override
	public void play() {
		System.out.println("Reproduzindo a música");
	}

	@Override
	public void pause() {
		System.out.println("Pausando a música");
	}

	@Override
	public void selectMusic() {
		System.out.println("Selecionando a música");
	}
	
	public void power() {
		System.out.println("Ligando o dispositivo");
	}
	
	public void volumeUp() {
		System.out.println("Aumentando o volume do som");
	}
	
	public void volumeDown() {
		System.out.println("Diminuindo o volume do som");
	}

}
