package sportnews;

import java.util.ArrayList;

public class Editors {
    private String name;
    private final String dni;
    private static double salary = 1500;
    private ArrayList<News> noticias = new ArrayList<>();

    public Editors(String name, String dni) {
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

    public void addNoticia(News noticia) {
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
