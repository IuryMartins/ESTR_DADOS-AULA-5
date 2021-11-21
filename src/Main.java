import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int linha;
        int coluna;
        int contador=1;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o numero de linhas da matriz:");
        linha = in.nextInt();

        System.out.println("Informe o numero de Colunas da matriz:");
        coluna = in.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++){
                matriz[i][j]= contador;
                contador++;
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }


        String[][] matriz_string = new String[4][4];
        matriz_string[0][0] = "zero";
        matriz_string[0][1] = "um";
        matriz_string[0][2] = "dois";
        matriz_string[0][3] = "tres";
        matriz_string[1][0] = "quatro";
        matriz_string[1][1] = "cinco";
        matriz_string[1][2] = "seis";
        matriz_string[1][3] = "sete";
        matriz_string[2][0] = "oito";
        matriz_string[2][1] = "nove";
        matriz_string[2][2] = "dez";
        matriz_string[2][3] = "onze";
        matriz_string[3][0] = "doze";
        matriz_string[3][1] = "treze";
        matriz_string[3][2] = "quatorze";
        matriz_string[3][3] = "quinze";

        String texto = "oi";

        System.out.println(ProcuraParametros(matriz_string, texto));

    }

    public static String ProcuraParametros(String[][] matriz, String texto){
        String str = "O texto procurado não faz parte da matriz informada.";
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++){
                if (matriz[i][j].contains(texto)) {
                    str = " Texto encontrado na posição["+i+"]["+j+"] da matriz";
                }
            }
        }
        return str;
    }
}
