package Atividade12_FileReader_Writter2.Exercicio1_Playlist_Musica.Applications;
import Atividade12_FileReader_Writter2.Exercicio1_Playlist_Musica.Entities.Musica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File pasta = new File("C:\\Playlist_de_Musicas");

            if (!pasta.exists()) {
                pasta.mkdir();
            }

            File arquivo = new File("C:\\Playlist_de_Musicas\\minha_playlist.txt");

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Bem vindo a sua playlist de musicas");
        System.out.println("Insira abaixo o nome, o artista e a data de lançamento de suas musicas favoritas");
        System.out.println("Digite fim para quando você encerrar de inserir musicas");
        String path = "C:\\Playlist_de_Musicas\\minha_playlist.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            while (true) {

                System.out.print("Título: ");
                String titulo = sc.nextLine();

                if (titulo.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.print("Artista: ");
                String artista = sc.nextLine();

                if (artista.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.print("Ano de lançamento: ");
                String ano = sc.nextLine();

                if (ano.equalsIgnoreCase("fim")) {
                    break;
                }

                Musica musica = new Musica(titulo, artista, Integer.parseInt(ano));

                bw.write(musica.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Musicas salvas com sucesso");
        System.out.println("Digite sim se quiser ver suas musicas na sua playlist");
        String VerJogos = sc.nextLine();
        if (VerJogos.equalsIgnoreCase("sim")) {
            File file = new File("C:\\Playlist_de_Musicas\\minha_playlist.txt");
            try {
                sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                if (sc != null) {
                    sc.close();
                }
            }
        }

    }
}
