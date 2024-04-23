public class Main {

    public static void main(String[] args) {
        System.out.println("Questa Ã¨ la somma degli elementi nella prima riga della matrice: " + sommaElementiMatrice());
        ;    }

    public static int sommaElementiMatrice() {
        int[][] matrice = {{5, 8, 4, 2, 9}, {3, 6, 10, 7}};
        int sum = 0;

        for (int i = 0; i < matrice[0].length ; i++) {
            sum += matrice[0][i];
        }

        return sum;
    }

}