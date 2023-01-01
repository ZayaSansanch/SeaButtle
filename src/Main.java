public class Main {
    private int[][] arrayOur;
    private int[][] arrayTheir;
    private window window;
    public Main() {
        arrayOur = new int[10][10];
        for (int i = 0; i < arrayOur.length; i++) {
            for (int j = 0; j < arrayOur[i].length; j++) {
                arrayOur[i][j] = 0;
            }
        }
        arrayTheir = new int[10][10];
        for (int i = 0; i < arrayTheir.length; i++) {
            for (int j = 0; j < arrayTheir[i].length; j++) {
                arrayTheir[i][j] = 0;
            }
        }

        window = new window();
        window.SeaBattlePrint(arrayOur, arrayTheir);
    }

    public static void main(String[] args) {
        new Main();
    }
}

class window {
    public void SeaBattlePrint(int[][] arrayOur, int[][] arrayTheir) {
        System.out.println("   A B C D E F G H I J   ");
        for (int i = 0; i < arrayOur.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < arrayOur.length; j++) {
                System.out.print(arrayOur[i][j] + " ");
            }
            System.out.println(" :" + i);
        }
        System.out.println("   A B C D E F G H I J   ");
    }
}