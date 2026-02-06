package sportnews;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class NewsMain {
    private static Scanner sc = new Scanner(System.in);
    private static int caso = 0;
    private static String input;
    private static ArrayList<Editors> redactores = new ArrayList<>();


    static void main(String[] args) {
        while (caso != 8) {
            System.out.println("Este es el programa de -->ERIC TARRES CABRISAS<--");
            System.out.println();
            System.out.println("--> DIGITAL DAILY NEWS<--");
            System.out.println();
            System.out.println("1. Insert Editor");
            System.out.println("2. Erase Editor");
            System.out.println("3. Insert new to an Editor");
            System.out.println("4. Erase New of Editor (Need the name of Editor and Titular)");
            System.out.println("5. Show the News of Editor");
            System.out.println("6. Calculate Score of News");
            System.out.println("7. Calculate Price of News");
            System.out.println("8. Exit");
            System.out.println();
            System.out.print("Elige una opción: ");
            input = sc.nextLine();
            caso = Integer.parseInt(input);


            switch (caso) {
                case 1:
                    insertEditor();
                    break;
                case 2:
                    if (redactores.isEmpty()) {
                        System.out.println("There aren't Editors to Erase!");
                    } else {
                        eraseEditor();
                    }
                    break;
                case 3:
                    addNewtoEditor();
                    break;
                case 4:
                    eraseNewstoEditor();
                    break;
                case 5:
                    showtheNewsofEditor();
                    break;
                case 6:
                    calculateScoreNews();
                    break;
                case 7:
                    calculatePriceNews();
                case 8:
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("Option not válid. Try again.");
            }
            if (caso != 8) {
                System.out.println("\nPress ENTER to continue...");
                sc.nextLine();   // <<< Here waiting to click ENTER
            }
        }
    }

    public static void insertEditor() {
        System.out.println("Name of Editor: ");
        String name = sc.nextLine();
        System.out.println("DNI of Editor: ");
        String dni = sc.nextLine();
        redactores.add(new Editors(name, dni));
    }

    public static void eraseEditor() {
        System.out.println("DNI of Editor to Erase: ");
        String dniErase = sc.nextLine();
        boolean dni = false;
        for (int i = 0; i < redactores.size(); i++) {
            if (redactores.get(i).getDni().equals(dniErase)) {
                dni = true;
                redactores.remove(i);
                System.out.println("Editor Erased!");
                break;
            }
        }
        if (!dni) {
            System.out.println("There aren't Editor with this DNI");
        }
    }

    public static void addNewtoEditor() {
        System.out.println("DNI of Editor: ");
        String dniEditor = sc.nextLine();

        Editors redactor = null;
        for (int i = 0; i < redactores.size(); i++) {
            Editors e = redactores.get(i);
            if (e.getDni().equals(dniEditor)) {
                redactor = e;
                break;
            }
        }
        if (redactor == null) {
            System.out.println("There aren't Editor with this DNI: " + dniEditor);
        } else {
            caso = 0;
            while (caso != 6) {
                System.out.println("--> TYPE OF NEWS<--");
                System.out.println();
                System.out.println("1. Football New");
                System.out.println("2. Basket New");
                System.out.println("3. Tennis New");
                System.out.println("4. F1 New");
                System.out.println("5. MotoGP New");
                System.out.println("6. Exit");
                System.out.println();
                System.out.print("Choose an Option: ");
                input = sc.nextLine();
                caso = Integer.parseInt(input);

                switch (caso) {
                    case 1:
                        System.out.println("Titular: ");
                        String titular = sc.nextLine();
                        System.out.println("Competition: ");
                        String competicio = sc.nextLine();
                        System.out.println("Club: ");
                        String club = sc.nextLine();
                        System.out.println("Player: ");
                        String jugador = sc.nextLine();
                        News noticia = new Football(titular, competicio, club, jugador);
                        redactor.addNoticia(noticia);
                        break;
                    case 2:
                        System.out.println("Titular: ");
                        titular = sc.nextLine();
                        System.out.println("Competition: ");
                        competicio = sc.nextLine();
                        System.out.println("Club: ");
                        club = sc.nextLine();
                        noticia = new Basketball(titular, competicio, club);
                        redactor.addNoticia(noticia);
                        break;
                    case 3:
                        System.out.println("Titular: ");
                        titular = sc.nextLine();
                        System.out.println("Competition: ");
                        competicio = sc.nextLine();
                        System.out.println("Tenista: ");
                        String tenista = sc.nextLine();
                        noticia = new Tennis(titular, competicio, tenista);
                        redactor.addNoticia(noticia);
                        break;
                    case 4:
                        System.out.println("Titular: ");
                        titular = sc.nextLine();
                        System.out.println("Escuderia: ");
                        String escuderia = sc.nextLine();
                        noticia = new F1(titular, escuderia);
                        redactor.addNoticia(noticia);
                        break;
                    case 5:
                        System.out.print("Titular: ");
                        titular = sc.nextLine();
                        System.out.print("Equip: ");
                        String equip = sc.nextLine();
                        noticia = new MotoGP(titular, equip);
                        redactor.addNoticia(noticia);
                        break;
                    case 6:
                        System.out.println("Returning to main Menu!");
                        break;
                    default:
                        System.out.println("Option not válid. Try again.");
                }
                if (caso != 6) {
                    System.out.println("\nWhat's next?...");
                }
            }
        }
    }


    public static void eraseNewstoEditor() {
        System.out.println("DNI of Editor: ");
        String dniEditor = sc.nextLine();

        Editors redactor = null;
        for (int i = 0; i < redactores.size(); i++) {
            Editors e = redactores.get(i);
            if (e.getDni().equals(dniEditor)) {
                redactor = e;
                break;
            }
        }
        if (redactor != null) {
            System.out.println("Titular: ");
            String titular = sc.nextLine();
            ArrayList<News> noticias = redactor.getNoticias();
            for (int i = 0; i < noticias.size(); i++) {
                if (noticias.get(i).getTitular().equals(titular)) {
                    noticias.remove(i);
                    System.out.println("New erased correctly!");
                    return;
                }
            }
            System.out.println("There aren't New with this Titular");
        } else {
            System.out.println("There aren't Editor with this DNI: " + dniEditor);
        }
    }

    public static void showtheNewsofEditor() {
        System.out.println("DNI of Editor: ");
        String dniEditor = sc.nextLine();

        Editors redactor = null;
        for (int i = 0; i < redactores.size(); i++) {
            Editors e = redactores.get(i);
            if (e.getDni().equals(dniEditor)) {
                redactor = e;
                break;
            }
        }

        if (redactor != null) {
            ArrayList<News> noticias = redactor.getNoticias();
            if (noticias.isEmpty()) {
                System.out.println("This Editor hasn't News");
                return;
            }
            for (int i = 0; i < noticias.size(); i++) {
                News noticia = noticias.get(i);
                System.out.println((i + 1) + ". " + noticia.getTitular() + " - Score: " + noticia.getScore() + " - Price: " + noticia.getPrice());
            }
        } else {
            System.out.println("There aren't Editor with this DNI: " + dniEditor);
        }
    }

    public static void calculateScoreNews() {
        System.out.println("DNI of Editor: ");
        String dniEditor = sc.nextLine();

        Editors redactor = null;
        for (int i = 0; i < redactores.size(); i++) {
            Editors e = redactores.get(i);
            if (e.getDni().equals(dniEditor)) {
                redactor = e;
                break;
            }
        }
        if (redactor != null) {
            System.out.println("Titular: ");
            String titular = sc.nextLine();

            ArrayList<News> noticias = redactor.getNoticias();

            for (int i = 0; i < noticias.size(); i++) {
                if (noticias.get(i).getTitular().equals(titular)) {
                    News noticia = noticias.get(i);
                    int score = noticia.calculateScore();
                    noticia.setScore(score);
                    System.out.println("Score calculated: " + score);
                    return;
                }
            }
        } else {
            System.out.println("There aren't Editor with this DNI: " + dniEditor);
        }
    }

    public static void calculatePriceNews() {
        System.out.println("DNI of Editor: ");
        String dniEditor = sc.nextLine();

        Editors redactor = null;
        for (int i = 0; i < redactores.size(); i++) {
            Editors e = redactores.get(i);
            if (e.getDni().equals(dniEditor)) {
                redactor = e;
                break;
            }
        }
        if (redactor != null) {
            System.out.println("Titular: ");
            String titular = sc.nextLine();

            ArrayList<News> noticias = redactor.getNoticias();

            for (int i = 0; i < noticias.size(); i++) {
                if (noticias.get(i).getTitular().equals(titular)) {
                    News noticia = noticias.get(i);
                    int price = noticia.calculatePrice();
                    noticia.setPrice(price);
                    System.out.println("Price calculated: " + price);
                    return;
                }
            }
        } else {
            System.out.println("There aren't Editor with this DNI: " + dniEditor);
        }
    }
}
