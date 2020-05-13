/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class LecturaPdf {
    private PDFParser analizar;
    private PDFTextStripper pdfStripper;
    private PDDocument pdDocument;
    private COSDocument cosDoc;
    
    private String Texto;
    private String rutaDeArchivo;
    private File file;

    public LecturaPdf() {
    }
    
    public String toText() throws IOException{
        this.pdfStripper = null;
        this.pdDocument = null;
        this.cosDoc = null;
        
        file = new File(rutaDeArchivo);
        analizar = new PDFParser(new RandomAccessFile(file, "r"));
        analizar.parse();
        cosDoc = analizar.getDocument();
        pdfStripper = new PDFTextStripper();
        pdDocument = new PDDocument(cosDoc);
        pdDocument.getNumberOfPages();
        pdfStripper.setStartPage(0);
        pdfStripper.setEndPage(pdDocument.getNumberOfPages());
        Texto = pdfStripper.getText(pdDocument);
        return Texto;
    }
    
    public void setRutaDeArchivo(String rutaDeArchivo){
        this.rutaDeArchivo = rutaDeArchivo;
    }
    
    public PDDocument getPDDocument(){
        return pdDocument;
    }
    
    
}
