import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder("Созданы : \n");
        sb.append("Директории Games/src/res/savegames/temp\n");
        sb.append("Директории savegames/temp\n");
        sb.append("Файлы Main.java, Utils.java\n");
        sb.append("Директории drawables/vectors/icons\n");
        sb.append("Файл temp.txt\n");
        String text = sb.toString();
        String dirs = "Games/src/res/savegames/temp";
        String src = "Games/src/main/test/";
        String fileOne = "Games/src/main/Main.java";
        String fileTwo = "Games/src/main/Utils.java";
        String res = "Games/src/res/drawables/vectors/icons";
        String fileLast = "Games/src/res/savegames/temp/temp.txt";
        File file = new File(dirs);
        if (file.mkdirs()) {
            System.out.println("созданы директории src, res, savegames, temp");
        }
        File file1 = new File(src);
        if (file1.mkdirs()) {
            System.out.println("созданы директории main, test");
        }
        var file2 = new File(fileOne);
        if (file2.createNewFile()) {
            System.out.println("Создан файл Main.java");
        }
        var file3 = new File(fileTwo);
        if (file3.createNewFile()) {
            System.out.println("Создан файл Utils.java");
        }

        File file4 = new File(res);
        if (file4.mkdirs()) {
            System.out.println("созданы директории drawables, vectors, icons");
        }
        File file5 = new File(fileLast);
        try {
            if (file5.createNewFile())
                System.out.println("Файл был создан temp.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
       try {
           FileWriter writer = new FileWriter(file5);
           writer.write(text);
           writer.flush();
       } catch (IOException exx){
           System.out.println(exx.getMessage());
       }

    }
}

