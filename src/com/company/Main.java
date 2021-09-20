package com.company;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static String fileName;
    static String fileReName;
    static String copyDestinationFileName;
    static String fileLocation;
    static String renameFileLocation;
    static String destinationCopyFileLocation;
    static String iterationCount = "1";
    static Scanner sc;
    static BufferedReader br;

    void createAFile() throws IOException {
        File file = new File(fileLocation + fileName);
        if (file.exists()) {
            System.out.println("Sorry file cannot be created , as a file already exists with name " + fileName + " at location " + file.getAbsolutePath());
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        } else {
            file.createNewFile();
            System.out.println("File Created Successfully " + " with file name " + fileName + " at location " + file.getAbsolutePath());
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        }

    }

    void deleteAFile() {
        File file = new File(fileLocation + fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("File deleted successfully");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        } else {
            System.out.println("Sorry file not found to continue the deletion process");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        }


    }

    void writeIntoAFile() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter(fileLocation + fileName);
        System.out.println("Write the content into the file");
        String data = br.readLine();
        writer.write(data);
        writer.flush();
        System.out.println("Written into the file successfully");
        System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
        iterationCount = sc.next();

    }

    void readContentOfAFile() throws IOException {
        File file = new File(fileLocation + fileName);
        if (file.exists()) {
            FileReader reader = new FileReader(fileLocation + fileName);
            System.out.println("After reading , contents of the file are:");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            System.out.println("File Successfully read");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        } else {
            System.out.println("Sorry file not found to continue the reading process");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        }


    }

    void renameAFile() {
        File file = new File(fileLocation + fileName);
        if (file.exists()) {
            File renameFile = new File(renameFileLocation + fileReName);
            file.renameTo(renameFile);
            System.out.println("File renamed successfully");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        } else {
            System.out.println("Sorry file not found to continue the rename process");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        }

    }

    void copyContentsOfAFileIntoAnotherFile() throws IOException {
        File file =new File(fileLocation + fileName);
        if (file.exists())
        {
            FileInputStream fis = new FileInputStream(fileLocation + fileName);
            FileOutputStream fos = new FileOutputStream(destinationCopyFileLocation + copyDestinationFileName);
            int i;
            while ((i=fis.read())!=-1)
            {
                fos.write((char)i);
            }
            System.out.println("File copied successfully");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        }
        else
        {
            System.out.println("Sorry file not found to continue the copy process");
            System.out.println("Do you wish to continue ahead ?" + " Press 1 To continue :" + " Press 0 to abort");
            iterationCount = sc.next();
        }


    }

    public static void main(String[] args) throws IOException {
        sc = new Scanner(System.in);
        Main main = new Main();
        while (iterationCount.equals("1")) {
            System.out.println("File Operations :");
            System.out.println(" 1. Creating a File");
            System.out.println(" 2. Deleting a File");
            System.out.println(" 3. Writing into a File");
            System.out.println(" 4. Reading the contents of a File");
            System.out.println(" 5. Renaming a File");
            System.out.println(" 6. Copying the contents of a File into another File");
            System.out.println("Enter your choice below like 1 or 2 ,etc.: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the location where the file is to be created for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    fileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    fileName = sc.next();
                    main.createAFile();
                }
                case 2 -> {
                    System.out.println("Enter the location from where the file is to be deleted for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    fileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    fileName = sc.next();
                    main.deleteAFile();
                }
                case 3 -> {
                    System.out.println("Enter the location of the file which is to be written into for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    fileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    fileName = sc.next();
                    main.writeIntoAFile();
                }
                case 4 -> {
                    System.out.println("Enter the location of the file which is to be written into for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    fileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    fileName = sc.next();
                    main.readContentOfAFile();
                }
                case 5 -> {
                    System.out.println("Enter the location of the file which is to be renamed  for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    fileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    fileName = sc.next();
                    System.out.println("Enter the location of the renamed file for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    renameFileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    fileReName = sc.next();
                    main.renameAFile();
                }
                case 6 -> {
                    System.out.println("Enter the location of the file whose content is to be copied  for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    fileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    fileName = sc.next();
                    System.out.println("Enter the location of the destination file where the copied content is to be placed  for e.g. " + "C:\\Users\\Asus\\Desktop\\");
                    destinationCopyFileLocation = sc.next();
                    System.out.println("Enter the file name along with extension for e.g. 'abc.txt'");
                    copyDestinationFileName = sc.next();
                    main.copyContentsOfAFileIntoAnotherFile();
                }
                default -> {
                    System.out.println("Invalid Input");
                    System.exit(0);
                }
            }
        }


    }
}
