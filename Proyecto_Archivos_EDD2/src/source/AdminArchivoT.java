package source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminArchivoT {

    private ArrayList<Registro> list_registers = new ArrayList<Registro>();
    private File archivo = null;

    public AdminArchivoT(String route) {
        archivo = new File(route);
    }

    public ArrayList<Registro> getList_registers() {
        return list_registers;
    }

    public void setList_registers(ArrayList<Registro> list_registers) {
        this.list_registers = list_registers;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void WriteFile() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            bw.write("|");
            for (Registro reg : list_registers) {
                bw.write("\n");
            }

        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void LoadFile() {
        Scanner sc = null;
        list_registers = new ArrayList();
        try {
            if (archivo.exists()) {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {                                        
                    
                }
            }           
        } catch (Exception e) {
            
        }finally{
            sc.close();
        }
        
    }

}
