package es.etg.dam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
public class grep {
    
    public static final String texto ="""
            Me gusta PSP y java
                PSP se programa en java 
                es un módulo de DAM
                y se programa de forma concurrente en PSP 
                PSP es programación
            """;
    public static void main(String[] args) throws  IOException{
        Process p = Runtime.getRuntime().exec("grep PSP");
        OutputStream out = p.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        pw.println(texto);
        pw.close();
        BufferedReader bf = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String obtenerPalabra;
        while((obtenerPalabra = bf.readLine() )!=null){
            System.out.println(obtenerPalabra);

        }

    }
}


