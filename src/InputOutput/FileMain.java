package InputOutput;

import java.io.File;
import java.io.IOException;


public class FileMain {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\Teknosa Casper\\Desktop\\";
        String dizinName="Patika";

        File directory = new File(filePath+dizinName);

        directory.mkdir();

        filePath=filePath+dizinName+"\\";

        File file= new File(filePath+"test.txt");

        file.createNewFile();

        File file2 = new File(filePath+"test.md");

        fileCreateAndControl(file);
        fileCreateAndControl(file2);

        String[] list=directory.list();

        for (String str:list)
        {
            System.out.println(str);
        }

    }
   public static void fileCreateAndControl(File file) {
        try {
            if(file.createNewFile()) {
                System.out.println(file.getName()+" Dosyası Oluşturuldu. Dosya Yolu : "+file.getPath());
            }
            else{
                System.out.println(file.getName()+" Dosyası zaten mevcut.");
                file.delete();
                System.out.println("Dosya Silindi !");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

