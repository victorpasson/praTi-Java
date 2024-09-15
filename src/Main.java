import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte byteVar = 127;
//        short shortVar = 32000;
//        int intVar = 21000000;
//        long longVar = 9000000000000000000L;
//
//        float floatVar = 3.1415F;
//        double doubleVar = 3.14159265;
//
//        char charVar = 'A';
//        boolean booleanVar = true;
//
//        System.out.println("Byte: " + byteVar);
//        System.out.println("Short: " + shortVar);
//        System.out.println("Int: " + intVar);
//        System.out.println("Long: " + longVar);
//        System.out.println("Float: " + floatVar);
//        System.out.println("Double: " + doubleVar);
//        System.out.println("Char: " + charVar);
//        System.out.println("Boolean: " + booleanVar);
//
//        String name = "Jaques";
//        System.out.println("String: " + name);
//
//        System.out.printf("%.2f\n", floatVar);
//
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.2f\n", floatVar);
//
//        int a;
//        int b;
//        int c;
//        double area;
//
//        a = 5;
//        b = 7;
//        c = 3;
//
//        area = (double) (a + b)/2 * c;
//
//        System.out.println(area);
//
//        Scanner sc = new Scanner(System.in);
//
//        String nome = sc.next();
//        System.out.println("Seu nome é: " + nome);
//
//        int idade = sc.nextInt();
//        System.out.println("Sua idade é: " + idade);
//
//        double ano = sc.nextDouble();
//        System.out.println("O ano é: " + ano);
//
//        char character = sc.next().charAt(0);
//        System.out.println("O caracter é: " + character);
/////////////////////////// Aula 2 ////////////////////////////////////////
//        Scanner sc = new Scanner(System.in);
//        // Conversão de celsius para fahrenheit
//        float celsius = sc.nextFloat();
//        System.out.println(celsius * 1.8 + 32);

//////////////// Estruturas de controle
//        int idade = 17;
//        if(idade >= 18) {
//            System.out.println("Você é maior de idade.");
//        } else {
//            System.out.println("Você é menor de idade.");
//        }
//// Exercicio par ou impar
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Digite um número inteiro: ");
//        int numero = sc.nextInt();

//        if ((numero % 2) == 0) {
//            System.out.println("Número é par.");
//        } else {
//            System.out.println("Número é ímpar.");
//        }

        // De para de dias com switch case
//        int dia = 8;
//        switch (dia) {
//            case 1:
//                System.out.println("Domingo!");
//                break;
//            case 2:
//                System.out.println("Segunda!");
//                break;
//            case 3:
//                System.out.println("Terça!");
//                break;
//            case 4:
//                System.out.println("Quarta!");
//                break;
//            case 5:
//                System.out.println("Quinta!");
//                break;
//            case 6:
//                System.out.println("Sexta!");
//                break;
//            case 7:
//                System.out.println("Sabado!");
//                break;
//            default:
//                System.out.println("Dia inválido.");
//        }
        ///// Exercício 3: Verificar se um ano é bissexto.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o ano: ");
//        int ano = sc.nextInt();
//
//        if ((((ano % 100) % 4) == 0) || (ano % 400 == 0) ){
//            System.out.println("O ano é bissexto!");
//        } else {
//            System.out.println("O ano não é bissexto!");
//        }

        ///// Exercício 4: Calculadora simples
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o número 1: ");
//        double numero1 = sc.nextDouble();
//
//        System.out.println("Digite o número 2: ");
//        double numero2 = sc.nextDouble();
//
//        System.out.println("Digite o operador: ");
//        char operador = sc.next().charAt(0);
//
//        switch (operador){
//            case '*':
//                System.out.println(numero1 * numero2);
//                break;
//            case '/':
//                System.out.println(numero1 / numero2);
//                break;
//            case '+':
//                System.out.println(numero1 + numero2);
//                break;
//            case '-':
//                System.out.println(numero1 - numero2);
//                break;
//            default:
//                System.out.println("Operador não encontrado");
//        }

        /////// Exercício 5: Simulem um login básico que permita somente três tentativas de login antes de bloquear o usuário.
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < 3; i++){
//            System.out.println("Tentativa " + (i + 1));
//            System.out.println("Digite o username: ");
//            String username = sc.next();
//
//            System.out.println("Digite o password: ");
//            String password = sc.next();
//
//            if (username.equals("username") && password.equals("password") && i != 2){
//                System.out.println("Usuário logado com sucesso!");
//                break;
//            } else if (i == 2) {
//                System.out.println("Usuário bloqueado");
//            }
//        }
        // Estruturas de Repetição: for
//        for (int i = 0; i < 10; i++){
//            System.out.println(i);
//        }

        // Estruturas de Repetição: while
//        int i = 0;
//        while(i < 10){
//            System.out.println(i);
//            i++;
//        }

        // Estruturas de Repetição: do while
//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i < 10);

        // Manipulação de String
//        String texto = "Java é melhor que aquela linguagem";
//        System.out.println(texto.length());
//        System.out.println(texto.toUpperCase());
//        System.out.println(texto.toLowerCase());
//        System.out.println(texto.contains("JavaScript"));
//        System.out.println(texto.replace("Java", "Python"));
//        System.out.println(texto.substring(5, 10));

        // Operação matemática
//        double num = 50.30;
//
//        System.out.println(Math.round(num));
//        System.out.println(Math.ceil(num));
//        System.out.println(Math.floor(num));
//        System.out.println(Math.sqrt(num));
//        System.out.println(Math.abs(num));
//        System.out.println(Math.random());

        // Exercício 6: Fatorial de um número
//        int numero = 10;
//        int fatorial = 1;
//        for (int i = 0; i < numero; i++){
//            fatorial = fatorial * (numero - i);
//        }
//        System.out.println(fatorial);

        // Exercício 7: Sequência de Fibonacci;
//        int termo = 2;
//        int ant1 = 1;
//        int ant2 = 0;
//        for (int i = 0; i < termo; i++) {
//            if (termo == 1) {
//                System.out.println();
//            }
//            int num = ant1 + ant2;
//            System.out.println(num);
//            ant2 = ant1;
//            ant1 = num;
//        }

        // Array em Java
        int[] vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        vetor[3] = 100;

//        System.out.println(vetor);
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println("Elemento na posição " + i + ":" + vetor[i]);
//        }

//        System.out.println("Soma do array 'vetor: ");
//        int sum = 0;

//        for(int i = 0; i < vetor.length; i++){
//            sum += vetor[i];
//        }

//        System.out.println(sum);

        // Exercício: Reverter o Array
//        int[] reversedArray = new int[5];
//
//        for(int i = 0; i < vetor.length; i++){
//            reversedArray[i] = vetor[vetor.length - i - 1];
//        }
//
//        for(int i = 0; i < reversedArray.length; i++){
//            vetor[i] = reversedArray[i];
//        }
//
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println("Elemento na posição " + i + ":" + vetor[i]);
//        }

        // Exercício: Adicionar elementos em um array
//        int addElement = 5;
//        int[] addVetor = new int[vetor.length + 1];
//        for(int i = 0; i < addVetor.length; i++){
//            if (i == (addVetor.length - 1)) {
//                addVetor[i] = addElement;
//            } else {
//                addVetor[i] = vetor[i];
//            }
//        }
//        vetor = addVetor;
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println("Elemento na posição " + i + ":" + vetor[i]);
//        }


        // Exercício: Excluir elemento de um array
//        int removeElement = 50;
//        int[] removeVetor = new int[vetor.length - 1];
//
//        int count = 0;
//        int index = 0;
//
//        while(count < vetor.length){
//            if(vetor[count] != removeElement){
//                removeVetor[index] = vetor[count];
//                index++;
//            }
//            count++;
//        }
//        vetor = removeVetor;
//
//        for(int i = 0; i < vetor.length; i++){
//            System.out.println("Elemento na posição " + i + ":" + vetor[i]);
//        }

        // Exercício: Pesquisar elemento de um array

//        int i = 0;
//        int valorProcurado = 20;
//        while(i < vetor.length){
//            if (vetor[i] == valorProcurado){
//                System.out.println("Elemento no vetor, na posição: " + i);
//            }
//            i++;
//        }
//
//        int[] vetorInicializado = {1, 2, 3, 4, 5};
//
//
//        String[] palavras = {"teste"};

        // Arrays Bidimensionais
        int[][] matrix = {
                {10, 20, 35},
                {30, 50, 60},
                {70, 80, 90}
        };

//        for (int[] row : matrix){
//            for(int value : row){
//                System.out.println(value + "");
//            }
//            System.out.println();
//        }

        int diagPrincipal = 0;
        int diagSecundaria = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i == j){
                    diagPrincipal += matrix[i][j];
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i + j ==  matrix.length - 1){
                    diagSecundaria += matrix[i][j];
                }
            }
        }

        System.out.println("Diagonal Principal: " + diagPrincipal);
        System.out.println("Diagonal Secundaria: " + diagSecundaria);

        // Rotacionar uma matrix
        int[][] rotateMatrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                rotateMatrix[j][i] = matrix[i][j];
            }
        }

        for (int[] row : rotateMatrix){
            String linha = "";
            for (int col: row){
                linha += col + " ";
            }
            System.out.println(linha);
        }

        // Procurar elemento em uma matrix
        int valorProcurado = 80;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == valorProcurado) {
                    System.out.println("Elemento procurado " + valorProcurado + " encontrado na linha " + i + " na coluna " + j);
                }
            }
        }

    }
}