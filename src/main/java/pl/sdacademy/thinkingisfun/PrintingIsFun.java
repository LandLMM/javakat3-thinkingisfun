package pl.sdacademy.thinkingisfun;

import java.io.IOException;
import java.io.OutputStream;

public class PrintingIsFun {

    private OutputStream output = System.out;


    public void printRectangle(int width, int height) {

    }

    public void printBox(int witdth, int height) {

    }

    public void printTriangle(int height) {

    }

    public void printTree(int height) {

    }

    private void printLineToScreen(String line) {
        try {
            output.write((line + System.lineSeparator()).getBytes());
            output.flush();
        } catch (IOException e) {
            System.out.println("Problem with console output...");
        }
    }
}
