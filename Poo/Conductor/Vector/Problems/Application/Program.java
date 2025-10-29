package Conductor.Vector.Problems.Application; // Define o pacote onde esta classe está localizada

import java.util.Scanner; // Importa a classe Scanner (para ler entrada do usuário)
import Conductor.Vector.Problems.entities.People; // Importa a definição da classe 'People'

public class Program {
    
    public static void main( String[ ] args ){ // Método principal, ponto de entrada da aplicação

        Scanner sc = new Scanner( System.in ); // Cria um objeto Scanner para ler do teclado

        // --- 1. DEFINIÇÃO DO TAMANHO DO VETOR ---
        System.out.print( "How many people will be added? " ); // Pede ao usuário a quantidade de pessoas
        int n = sc.nextInt(  ); // Lê o número (int) e armazena na variável 'n'

        // --- 2. CRIAÇÃO DO VETOR ---
        // Cria um vetor (array) chamado 'people' do tipo 'People', com 'n' posições
        People[ ] people = new People[ n ]; 

        // --- 3. LEITURA DOS DADOS (LOOP) ---
        // Loop 'for' que executa 'n' vezes (de i=0 até i < n)
        for( int i = 0; i < people.length; i++ ){ 

            System.out.printf( "Dados da %d pessoa: \n", i + 1 ); // Imprime o número da pessoa (ex: "Dados da 1 pessoa:")
            
            // !! IMPORTANTE !! Consome o "Enter" pendente deixado pelo 'sc.nextInt()' da linha 14
            sc.nextLine(); 
            
            System.out.print( "name: " ); // Pede o nome
            String name = sc.nextLine( ); // Lê o nome (String)
            
            // O '\n' no início força uma quebra de linha ANTES de mostrar a mensagem "age: "
            System.out.print( "\nage: " ); 
            int age = sc.nextInt( ); // Lê a idade (int)
            
            System.out.print( "\nheight: " ); // Pede a altura (também quebra a linha antes)
            double height = sc.nextDouble( ); // Lê a altura (double)
            
            System.out.println(  ); // Pula uma linha no console para organizar a visualização
            
            // Cria um novo objeto 'People' usando o construtor...
            // ...e armazena esse novo objeto na posição 'i' do vetor 'people'
            people[ i ] = new People( name , age, height ); 

        } // Fim do loop de leitura

        // --- 4. IMPRESSÃO DOS DADOS CADASTRADOS ---
        System.out.println("\n--- PESSOAS CADASTRADAS ---"); // Imprime um título de seção
                
        // Loop 'for-each' (mais simples) para percorrer cada objeto 'p' dentro do vetor 'people'
        for ( People p : people ) { 
            // Imprime o objeto 'p'. O Java chama automaticamente o método p.toString()
            System.out.println( p ); 
            System.out.println("--------------------------"); // Imprime um separador
        }

        // --- 5. CÁLCULO DA MÉDIA DE ALTURA ---
        double sum = 0.0; // Variável acumuladora para guardar a soma das alturas

        for( int i = 0; i < people.length; i ++ ){ // Loop 'for' tradicional para somar
            sum += people[ i ].getHeight(  ); // Acessa a altura (getHeight) de cada pessoa e soma
        }

        double avg = sum / people.length; // Calcula a média aritmética (soma total / quantidade)
        
        // !! ATENÇÃO (BUG) !! O cálculo acima foi da média de ALTURA (avg), mas o texto imprime "Média de Idades"
        System.out.printf( "Média de Idades = %f", avg );
    
        sc.close( ); // Fecha o Scanner (boa prática para liberar recursos)

    } // Fim do método main

} // Fim da classe Program