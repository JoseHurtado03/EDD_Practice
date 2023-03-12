/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Function {
    
    public ArtistList readData(){
        ArtistList cantantes = new ArtistList();
        String line;
        String artist_txt = "";
        String path = "test\\artist.txt";
        File file = new File(path);
        try{
            if(!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        artist_txt += line + "\n";
                    }
                }
                if (!"".equals(artist_txt)){
                    String[] artist_split = artist_txt.split("/");
                    for (int i = 0; i < artist_split.length; i++) {
                        String[] artist = artist_split[i].split("\n");
                        String nameA = artist[0];
                        SongList canciones = new SongList();
                        for (int j = 1; j < artist.length; j++) {
                            String[] songs = artist[i].split(",");
                            String songName = songs[0];
                            int numRepro = Integer.parseInt(songs[1]);
                            int year = Integer.parseInt(songs[2]);
                            String language = songs[3];
                            NodoSong song = new NodoSong(songName, year, language, numRepro);
                            canciones.append(song);
                        }
                        NodoArtist artista = new NodoArtist(nameA, canciones);
                        cantantes.append(artista);
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return cantantes;
    }
    
    public void writeData(){
        
    }
    
    public ArtistList manual(){
        ArtistList artists = new ArtistList();
        NodoSong bts1 = new NodoSong("Not Today", 2017, "Coreano", 25824);
        NodoSong bts2 = new NodoSong("DNA", 2017, "Coreano", 123654);
        NodoSong bts3 = new NodoSong("Fake Love", 2018, "Coreano", 302984);
        SongList songsBTS = new SongList();
        songsBTS.append(bts1);
        songsBTS.append(bts2);
        songsBTS.append(bts3);
        NodoArtist artistBTS = new NodoArtist("BTS", songsBTS);
        
        NodoSong rw1 = new NodoSong("HIGH", 2016, "Español", 43082);
        NodoSong rw2 = new NodoSong("Vocabulario Basico", 2013, "Español", 29485);
        SongList songsRw = new SongList();
        songsRw.append(rw1);
        songsRw.append(rw2);
        NodoArtist artistRw = new NodoArtist("Rawayana", songsRw);
        
        NodoSong mp1 = new NodoSong("I Took a Pill in Ibiza", 2016, "Inglés", 150576);
        SongList songsmp = new SongList();
        songsmp.append(mp1);
        NodoArtist artistMp = new NodoArtist("Mike Posner", songsmp);
        
        NodoSong mV1 = new NodoSong("Sugar", 2015, "Inglés", 943454);
        NodoSong mV2 = new NodoSong("Payphone", 2012, "Inglés", 42345);
        SongList songsmV = new SongList();
        songsmV.append(mV1);
        songsmV.append(mV2);
        NodoArtist artistmV = new NodoArtist("Maroon V", songsmV);
        
        artists.append(artistBTS);
        artists.append(artistRw);
        artists.append(artistMp);
        artists.append(artistmV);
        JOptionPane.showMessageDialog(null, "Datos cargados exitosamente");
        return artists;
    }
}
