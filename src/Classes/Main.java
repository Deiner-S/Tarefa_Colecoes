package Classes;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("==================== ATIVIDADE PARTE 1 ===================.\n\n");
		lerNomePessoas();
		System.out.println("\n\n==================== ATIVIDADE PARTE 2 ===================.\n\n");
		grupoGenero();

	}

	

	/**
	 * <h1>Exercicio parte 1</h1>
	 * <ul>
	 * 	<li>Ler do console nome de pessoas separadas por virgula.</li>
	 * 	<li>Separar esses valores que foram lidos.</li>
	 * 	<li>Guardar em um dos tipos de variáveis que vimos neste módulo</li>
	 * 	<li>Ordenar em ordem alfabética</li>
	 *  <li>Imprimir no console</li>
	 * </ul>
	 * 	 
	 */
	private static void lerNomePessoas() {
		
		Scanner scan = new Scanner(System.in);
		List<String> listaNomes = new ArrayList<>();
		
		
		System.out.println("Informe nome de pessoas separados por virgula: \n\n");		
		String nomes = scan.nextLine();
		
		String[] nomesSeparados = nomes.split(",");
		
		for(String i : nomesSeparados) {
			
			listaNomes.add(i);
			
		}
		
		System.out.println("\nNão ordenada"+listaNomes);
		
		Collections.sort(listaNomes);
		
		System.out.println("\nOrdenada"+listaNomes);
		
		
		
		
	}
	
	/**
	 * <h1>Exercicio parte 2</h1>
	 * <ul>
	 * 	<li>Ler do console nome de pessoas e genero .</li>
	 * 	<li>Nome e Genero deve ser separados por ífen(-)</li>
	 * 	<li>Cada nome e genero separados um do outro por virgula</li>
	 * 	<li>Separar homens de mulheres e colocalos em listas diferentes</li>
	 *  <li>Imprimir no console</li>
	 * </ul>
	 * 
	 */
	
	private static void grupoGenero() {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> homens = new ArrayList<>();
		List<String> mulheres = new ArrayList<>();
		
		System.out.println("Informe nome-genero de pessoas separadas por virgula: \n\n");
		String nomes = scan.nextLine();
		String[] nomesGeneros = nomes.split(",|-");
		
		for(int i = 0;i < nomesGeneros.length; i++) {
			
			if( nomesGeneros[i].equalsIgnoreCase("h")) {
				
				homens.add(nomesGeneros[i-1]+ " - Homen   ");
				//System.out.println(nomesGeneros[i-1]);
				
			}else if(nomesGeneros[i].equalsIgnoreCase("m")) {
				mulheres.add(nomesGeneros[i-1]+" - Mulher   ") ;
				//System.out.println(nomesGeneros[i-1]);
			}
			
		}
		
		System.out.println("\n\n============== Desordenadas =============\n\n");
		
		System.out.println("Homens: "+homens);
		System.out.println("Mulheres: "+mulheres);
		
		
		Collections.sort(homens);
		Collections.sort(mulheres);
		
		System.out.println("\n\n\n============== Ordenadas =============\n\n");
		
		System.out.println("Homens: "+homens);
		System.out.println("Mulheres: "+mulheres);

		
		
		
		
		
	}
}
