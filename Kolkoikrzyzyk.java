import java.util.Scanner;

public class Kolkoikrzyzyk {
    public static void main(String[] args) {

        //Kółko i krzyżyk

        Scanner skankik = new Scanner(System.in); //definiowanie skanera
        String[][] kolkoikrzyzyk = new String[3][3]; //definiowanie wymiarów i typu tablicy

        kolkoikrzyzyk[0][0] = "|1|";
        kolkoikrzyzyk[0][1] = "|2|";
        kolkoikrzyzyk[0][2] = "|3|";
        kolkoikrzyzyk[1][0] = "|4|";
        kolkoikrzyzyk[1][1] = "|5|";
        kolkoikrzyzyk[1][2] = "|6|";
        kolkoikrzyzyk[2][0] = "|7|";
        kolkoikrzyzyk[2][1] = "|8|";
        kolkoikrzyzyk[2][2] = "|9|";

        int z = 1000; //posłuży nam to ustalenia, kto wygrał
        int y = 0; //potrzebna do skończenia gry w przypadku remisu

        System.out.println("");
        System.out.println("Gramy w kółko i krzyżyk!");
        System.out.println("Gracz 1. Podaj swoje imię i zatwierdź Enterem.");
        String imie1 = skankik.nextLine();
        System.out.println("Gracz 1: " + imie1);
        System.out.println("Teraz Gracz 2. Podaj swoje imię i zatwierdź Enterem.");
        String imie2 = skankik.nextLine();
        System.out.println("Gracz 2: " + imie2);

        for (int i = 0; i < kolkoikrzyzyk.length; i++) {
            for (int j = 0; j < kolkoikrzyzyk[i].length; j++) {
                System.out.print(kolkoikrzyzyk[i][j]);
                //wyświetlamy pustą tablicę do grania w kółko i krzyżyk
            }
            System.out.println("");
        }

        while (z == 1000 && y < 9) { //////////////////////////początek while//////////////////////////////////
            System.out.println("Teraz ruch ma " + imie1);
            System.out.println("Wybierz cyfrę, w miejscu której chcesz postawić krzyżyk i zatwierdź Enterem");
            int a = skankik.nextInt();

            while ((a == 1 && !kolkoikrzyzyk[0][0].equals("|1|")) || (a == 2 && !kolkoikrzyzyk[0][1].equals("|2|"))
                    || (a == 3 && !kolkoikrzyzyk[0][2].equals("|3|")) || (a == 4 && !kolkoikrzyzyk[1][0].equals("|4|"))
                    || (a == 5 && !kolkoikrzyzyk[1][1].equals("|5|")) || (a == 6 && !kolkoikrzyzyk[1][2].equals("|6|"))
                    || (a == 7 && !kolkoikrzyzyk[2][0].equals("|7|")) || (a == 8 && !kolkoikrzyzyk[2][1].equals("|8|"))
                    || (a == 9 && !kolkoikrzyzyk[2][2].equals("|9|"))) {
                System.out.println("Wskazałeś niewłaściwe pole - jest ono już zajęte. Wskaż inne");
                a = skankik.nextInt();
            }

            if (a == 1 && kolkoikrzyzyk[0][0].equals("|1|")) {
                kolkoikrzyzyk[0][0] = " x ";
            }
            if (a == 2 && kolkoikrzyzyk[0][1].equals("|2|")) {
                kolkoikrzyzyk[0][1] = " x ";
            }
            if (a == 3 && kolkoikrzyzyk[0][2].equals("|3|")) {
                kolkoikrzyzyk[0][2] = " x ";
            }
            if (a == 4 && kolkoikrzyzyk[1][0].equals("|4|")) {
                kolkoikrzyzyk[1][0] = " x ";
            }
            if (a == 5 && kolkoikrzyzyk[1][1].equals("|5|")) {
                kolkoikrzyzyk[1][1] = " x ";
            }
            if (a == 6 && kolkoikrzyzyk[1][2].equals("|6|")) {
                kolkoikrzyzyk[1][2] = " x ";
            }
            if (a == 7 && kolkoikrzyzyk[2][0].equals("|7|")) {
                kolkoikrzyzyk[2][0] = " x ";
            }
            if (a == 8 && kolkoikrzyzyk[2][1].equals("|8|")) {
                kolkoikrzyzyk[2][1] = " x ";
            }
            if (a == 9 && kolkoikrzyzyk[2][2].equals("|9|")) {
                kolkoikrzyzyk[2][2] = " x ";
            }

            for (int i = 0; i < kolkoikrzyzyk.length; i++) {
                for (int j = 0; j < kolkoikrzyzyk[i].length; j++) {
                    System.out.print(kolkoikrzyzyk[i][j]);
                }
                System.out.println("");
            }

            if ((kolkoikrzyzyk[0][0].equals(" x ") && kolkoikrzyzyk[0][1].equals(" x ") && kolkoikrzyzyk[0][2].equals(" x "))
                    || (kolkoikrzyzyk[1][0].equals(" x ") && kolkoikrzyzyk[1][1].equals(" x ") && kolkoikrzyzyk[1][2].equals(" x "))
                    || (kolkoikrzyzyk[2][0].equals(" x ") && kolkoikrzyzyk[2][1].equals(" x ") && kolkoikrzyzyk[2][2].equals(" x "))
                    || (kolkoikrzyzyk[0][0].equals(" x ") && kolkoikrzyzyk[1][0].equals(" x ") && kolkoikrzyzyk[2][0].equals(" x "))
                    || (kolkoikrzyzyk[0][1].equals(" x ") && kolkoikrzyzyk[1][1].equals(" x ") && kolkoikrzyzyk[2][1].equals(" x "))
                    || (kolkoikrzyzyk[0][2].equals(" x ") && kolkoikrzyzyk[1][2].equals(" x ") && kolkoikrzyzyk[2][2].equals(" x "))
                    || (kolkoikrzyzyk[0][0].equals(" x ") && kolkoikrzyzyk[1][1].equals(" x ") && kolkoikrzyzyk[2][2].equals(" x "))
                    || (kolkoikrzyzyk[0][2].equals(" x ") && kolkoikrzyzyk[1][1].equals(" x ") && kolkoikrzyzyk[2][0].equals(" x "))) {
                z = 999;
                break;
            }//koniec if
            y = y + 1;
            if (y == 9) {
                System.out.println("REMIS!");
                break;
            }

            System.out.println("Teraz ruch ma " + imie2);
            System.out.println("Wybierz cyfrę, w miejscu której chcesz postawić kółko i zatwierdź Enterem");

            int b = skankik.nextInt();

            while ((b == 1 && !kolkoikrzyzyk[0][0].equals("|1|")) || (b == 2 && !kolkoikrzyzyk[0][1].equals("|2|"))
                    || (b == 3 && !kolkoikrzyzyk[0][2].equals("|3|")) || (b == 4 && !kolkoikrzyzyk[1][0].equals("|4|"))
                    || (b == 5 && !kolkoikrzyzyk[1][1].equals("|5|")) || (b == 6 && !kolkoikrzyzyk[1][2].equals("|6|"))
                    || (b == 7 && !kolkoikrzyzyk[2][0].equals("|7|")) || (b == 8 && !kolkoikrzyzyk[2][1].equals("|8|"))
                    || (b == 9 && !kolkoikrzyzyk[2][2].equals("|9|"))) {
                System.out.println("Wskazałeś niewłaściwe pole - jest ono już zajęte. Wskaż inne");
                b = skankik.nextInt();
            }

            if (b == 1 && kolkoikrzyzyk[0][0].equals("|1|")) {
                kolkoikrzyzyk[0][0] = " o ";
            }
            if (b == 2 && kolkoikrzyzyk[0][1].equals("|2|")) {
                kolkoikrzyzyk[0][1] = " o ";
            }
            if (b == 3 && kolkoikrzyzyk[0][2].equals("|3|")) {
                kolkoikrzyzyk[0][2] = " o ";
            }
            if (b == 4 && kolkoikrzyzyk[1][0].equals("|4|")) {
                kolkoikrzyzyk[1][0] = " o ";
            }
            if (b == 5 && kolkoikrzyzyk[1][1].equals("|5|")) {
                kolkoikrzyzyk[1][1] = " o ";
            }
            if (b == 6 && kolkoikrzyzyk[1][2].equals("|6|")) {
                kolkoikrzyzyk[1][2] = " o ";
            }
            if (b == 7 && kolkoikrzyzyk[2][0].equals("|7|")) {
                kolkoikrzyzyk[2][0] = " o ";
            }
            if (b == 8 && kolkoikrzyzyk[2][1].equals("|8|")) {
                kolkoikrzyzyk[2][1] = " o ";
            }
            if (b == 9 && kolkoikrzyzyk[2][2].equals("|9|")) {
                kolkoikrzyzyk[2][2] = " o ";
            }

            for (int i = 0; i < kolkoikrzyzyk.length; i++) {
                for (int j = 0; j < kolkoikrzyzyk[i].length; j++) {
                    System.out.print(kolkoikrzyzyk[i][j]);
                }
                System.out.println("");
            }
            if ((kolkoikrzyzyk[0][0].equals(" o ") && kolkoikrzyzyk[0][1].equals(" o ") && kolkoikrzyzyk[0][2].equals(" o "))
                    || (kolkoikrzyzyk[1][0].equals(" o ") && kolkoikrzyzyk[1][1].equals(" o ") && kolkoikrzyzyk[1][2].equals(" o "))
                    || (kolkoikrzyzyk[2][0].equals(" o ") && kolkoikrzyzyk[2][1].equals(" o ") && kolkoikrzyzyk[2][2].equals(" o "))
                    || (kolkoikrzyzyk[0][0].equals(" o ") && kolkoikrzyzyk[1][0].equals(" o ") && kolkoikrzyzyk[2][0].equals(" o "))
                    || (kolkoikrzyzyk[0][1].equals(" o ") && kolkoikrzyzyk[1][1].equals(" o ") && kolkoikrzyzyk[2][1].equals(" o "))
                    || (kolkoikrzyzyk[0][2].equals(" o ") && kolkoikrzyzyk[1][2].equals(" o ") && kolkoikrzyzyk[2][2].equals(" o "))
                    || (kolkoikrzyzyk[0][0].equals(" o ") && kolkoikrzyzyk[1][1].equals(" o ") && kolkoikrzyzyk[2][2].equals(" o "))
                    || (kolkoikrzyzyk[0][2].equals(" o ") && kolkoikrzyzyk[1][1].equals(" o ") && kolkoikrzyzyk[2][0].equals(" o "))) {
                z = 1001;
            }//koniec if
            y = y + 1;
        }//koniec while
        System.out.println("KONIEC!");
        if (z == 1001) {

            System.out.println("Wygrał: " + imie2);
        } else if (z == 999) {
            System.out.println("Wygrał: " + imie1);
        }

    }
}
