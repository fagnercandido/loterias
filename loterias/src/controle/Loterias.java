package controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author eduardo.andrade
 * @since 01/09/2014
 */
public class Loterias {

	private List<Integer> listaDeNumeros = new ArrayList<Integer>();

	private String numerosSorteados;

	private String mensagemBancaria = "Ajude o desenvolvedor " + "\n" + "dados bancários para depósito: " + "\n" +
			"Banco Santander 033, Ag 0815  CC 01003288-8" + "\n" + "Eduardo Monteiro de Andrade";

	/**
	 * Metodo responsavel por popular a lista de numeros 
	 * mais sorteados da megasena.
	 */
	private void popularListaDeNumerosMaisSorteadosMegaSena(){
		listaDeNumeros = new ArrayList<>();

		Integer numerosMaisSorteadosMegaSena[] = {5,4,53,54,51,42,33,17,24,52,49,43,13,10,29,41,36,28,50,32,44,23,16,47,30,12,2,8,31,27,7,59,34,6,37,56,38,58,46,18,40,20,60,3,11,35,57,14,19,45,25,48,15,55,21,39,9,26,22,9,7,3,1};
		listaDeNumeros.addAll(Arrays.asList(numerosMaisSorteadosMegaSena));
	}

	/**
	 * Metodo responsavel por popular a lista de numeros
	 * mais sorteados da lotofacil.
	 */
	private void popularListaDeNumerosMaisSorteadosLotofacil(){
		listaDeNumeros = new ArrayList<>();

		Integer numerosMaisSorteadosLotoFacil[] = {11, 2, 24, 13, 4, 21, 1, 23, 12, 19, 6, 22, 14, 10, 25, 3, 9, 20, 17, 15, 07, 5, 18, 16, 8, 3};
		listaDeNumeros.addAll(Arrays.asList(numerosMaisSorteadosLotoFacil));
	}

	private Integer numerosSorteados(Integer numero){
		return (int)(Math.random() * numero);
	}

	/**
	 * Metodo responsavel por popular a lista de numeros
	 * mais sorteados da Quina.
	 */
	private void popularListaDeNumerosMaisSorteadosQuina(){
		listaDeNumeros = new ArrayList<>();

		Integer numerosMaisSorteadosQuina[] = {19,7,74,51,45,76,48,68,13,37,77,75,69,22,12,34,62,46,33,70,9,41,25,80,55,36,60,50,8,2,66,78,32,63,43,30,57,11,21,47,65,24,58,35,23,67,17,3,20,6,39,4,52,49,53,16,40,44,29,73};
		listaDeNumeros.addAll(Arrays.asList(numerosMaisSorteadosQuina));
	}

	public void sortearNumerosMegaSena(){
		numerosSorteados = new String();

		popularListaDeNumerosMaisSorteadosMegaSena();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());

		Integer valor1 = numerosSorteados(numero);
		valor1 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor2 = numerosSorteados(numero);
		valor2 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor3 = numerosSorteados(numero);
		valor3 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor4 = numerosSorteados(numero);
		valor4 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor5 = numerosSorteados(numero);
		valor5 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor6 = numerosSorteados(numero);
		valor6 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		numerosSorteados = "      " + valor1 + " - " + valor2 + " - " + valor3 + " - " + valor4 + " - " + valor5 + " - " + valor6;
	}

	public void sortearNumerosQuina() {
		numerosSorteados = new String();
		popularListaDeNumerosMaisSorteadosQuina();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());

		Integer valor1 = numerosSorteados(numero);
		valor1 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor2 = numerosSorteados(numero);
		valor2 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor3 = numerosSorteados(numero);
		valor3 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor4 = numerosSorteados(numero);
		valor4 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor5 = numerosSorteados(numero);
		valor5 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		numerosSorteados = "      " + valor1 + " - " + valor2 + " - " + valor3 + " - " + valor4 + " - " + valor5;
	}

	public void sortearNumerosLotofacil() {
		numerosSorteados = new String();

		popularListaDeNumerosMaisSorteadosLotofacil();
		Random random = new Random();
		int numero = random.nextInt(listaDeNumeros.size());

		Integer valor1 = numerosSorteados(numero);
		valor1 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor2 = numerosSorteados(numero);
		valor2 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor3 = numerosSorteados(numero);
		valor3 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor4 = numerosSorteados(numero);
		valor4 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor5 = numerosSorteados(numero);
		valor5 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor6 = numerosSorteados(numero);
		valor6 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor7 = numerosSorteados(numero);
		valor7 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor8 = numerosSorteados(numero);
		valor8 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor9 = numerosSorteados(numero);
		valor9 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor10 = numerosSorteados(numero);
		valor10 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor11 = numerosSorteados(numero);
		valor11 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor12 = numerosSorteados(numero);
		valor12 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor13 = numerosSorteados(numero);
		valor13 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor14 = numerosSorteados(numero);
		valor14 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		Integer valor15 = numerosSorteados(numero);
		valor15 = listaDeNumeros.remove(numero);
		Collections.shuffle(listaDeNumeros);

		numerosSorteados =  "  " + valor1 + " -"
					  		+ valor2 + " -" + valor3 + " -" + valor4 + " -" + valor5 + " -" + valor6 + " -" + valor7 + " -" + valor8 + " -"
					  		+ valor9 + " -" + valor10 + " -" + valor11 + " -" + valor12 + " -" + valor13 + " -" + valor14 + " -" + valor15;
	}

	public List<Integer> getListaDeNumeros() {
		return listaDeNumeros;
	}

	public String getNumerosSorteados() {
		return numerosSorteados;
	}

	public String getMensagemBancaria() {
		return mensagemBancaria;
	}

}
