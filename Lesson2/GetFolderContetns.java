package Lesson2;

import java.io.File;
import java.io.FileWriter;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
📌 Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
📌 Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
📌 Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл. 
*/
public class GetFolderContetns {
    private static Logger logger = Logger.getLogger(GetFolderContetns.class.getName());
    public static void main(String[] args) {
        initLogger();
        String[] folderContents = getFolderContents(".");
        recordFile(folderContents, "Contents_Folder.txt");
    }
    public static String[] getFolderContents (String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }
    public static void recordFile(String[] content, String Filename) {
        try(FileWriter fWriter = new FileWriter(Filename)) {
            for (String el : content) {
                fWriter.write(el);
                fWriter.write(System.lineSeparator());
            }
            // System.out.println("Date was successfully written");
            logger.info("Date was successfully written");
        } catch (Exception e) {
            // System.err.println("Write error!");
            logger.log(Level.WARNING, "Write error!");
        }
    }
    public static void initLogger(){
        try {
            FileHandler fHandler = new FileHandler("log.txt", true);
            logger.addHandler(fHandler);
            SimpleFormatter sFormatter = new SimpleFormatter();
            fHandler.setFormatter(sFormatter);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
