package Zad_30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

    /* Zadanie 30.
Napisz program, który odczyta dowolny plik i zapisze go w tym samym folderze.
Zawartość jak i tytuł nowego pliku powinny być odwrócone (od tyłu). */

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\dude6\\IdeaProjects\\Projekt05.03\\src\\Zad_30_file1");
        Files.deleteIfExists(path);
        Files.createFile(path);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ala" + "\n");
        stringBuilder.append("ma " + "\n");
        stringBuilder.append("kota" + "\n");
        stringBuilder.append("ma" + "\n");
        stringBuilder.append("też" + "\n");
        stringBuilder.append("psa" + "\n");

        Files.write(path, stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);

        Path result = Path.of("C:\\Users\\dude6\\IdeaProjects\\Projekt05.03\\src\\Zad_30_file2");
        Files.deleteIfExists(result);
        Files.createFile(result);
        Files.write(result, stringBuilder.reverse().toString().getBytes(), StandardOpenOption.APPEND);



    }
}
