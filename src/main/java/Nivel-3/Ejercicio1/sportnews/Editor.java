package sportnews;

import java.util.ArrayList;

public class Editor {
    private String name;
    private final String dni;
    private static double salary = 1500;
    private ArrayList<New> noticias = new ArrayList<>();

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public static double getSalary() {
        return salary;
    }

    public ArrayList<News> getNoticias() {
        return noticias;
    }

    public void addNoticia(New noticia) {
        noticias.add(noticia);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setSalary(double salary) {
        Editors.salary = salary;
    }

    public void setNoticias(ArrayList<News> noticias) {
        this.noticias = noticias;
    }
}
