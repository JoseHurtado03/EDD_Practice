/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

public class Song {
    private int num;
    private String name;
    private String artist;
    private int numRepro;
    private int year;
    private String lenguage;

    public Song(int num, String name, String artist, int numRepro, int year, String lenguage) {
        this.num = num;
        this.name = name;
        this.artist = artist;
        this.numRepro = numRepro;
        this.year = year;
        this.lenguage = lenguage;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the numRepro
     */
    public int getNumRepro() {
        return numRepro;
    }

    /**
     * @param numRepro the numRepro to set
     */
    public void setNumRepro(int numRepro) {
        this.numRepro = numRepro;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the lenguage
     */
    public String getLenguage() {
        return lenguage;
    }

    /**
     * @param lenguage the lenguage to set
     */
    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public Song(String[] song){
        this.num = Integer.parseInt(song[0]);
        this.name = song[1];
        this.artist = song[2];
        this.numRepro = Integer.parseInt(song[3]);
        this.year = Integer.parseInt(song[4]);
        this.lenguage = song[5];
    }
    public String printSong(){
        String song = Integer.toString(this.getNum())+", "+this.getName()+", "+this.getArtist()+", "+ Integer.toString(this.getNumRepro())+", "+ Integer.toString(this.getYear())+", "+this.getLenguage();
        return song;
    }
}
