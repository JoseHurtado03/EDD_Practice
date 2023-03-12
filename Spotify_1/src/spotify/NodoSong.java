
package spotify;


public class NodoSong {
    private String name;
    private int year;
    private String language;
    private int numRepro;
    private NodoSong next;
    private NodoSong previous;

    public NodoSong(String name, int year, String language, int numRepro){
        this.name = name;
        this.year = year;
        this.language = language;
        this.numRepro = numRepro;
        this.next = null;
        this.previous = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumRepro() {
        return numRepro;
    }

    public void setNumRepro(int numRepro) {
        this.numRepro = numRepro;
    }

    public NodoSong getNext() {
        return next;
    }

    public void setNext(NodoSong next) {
        this.next = next;
    }

    public NodoSong getPrevious() {
        return previous;
    }

    public void setPrevious(NodoSong previous) {
        this.previous = previous;
    }
    
    public String printSong(){
        return "Nombre: "+getName()+" Año: "+getYear()+ " Idioma: "+getLanguage()+"\n";
    }
}
