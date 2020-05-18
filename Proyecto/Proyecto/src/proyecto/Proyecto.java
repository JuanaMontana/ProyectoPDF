/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.IOException;

/**
 *
 * @author Juan
 */
public class Proyecto {
    public static void main(String[] args) {
        Seleccionar seleccionar = new Seleccionar();
        // TODO code application logic here
        LecturaPdf lecturaPdf = new LecturaPdf();
        lecturaPdf.setRutaDeArchivo("C:\\Users\\yayox\\Downloads\\Calculo 1 PDFS y guias\\G1U1.pdf");
        
        try{
            String texto = lecturaPdf.toText();
            System.out.println(texto);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
