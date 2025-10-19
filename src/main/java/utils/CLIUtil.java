package utils;

import java.util.Scanner;

public class CLIUtil {
    private static Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public boolean getString(){
        return scanner.nextBoolean();
    }

}
