/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearpdfconitext7;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * https://www.discoduroderoer.es/crear-pdf-con-itext-7-en-java/
 * hecho y acabado el 26.8.21
 */
public class CrearPdfconItext7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File fichero = new File("pruebaPDF.pdf");
        try (PdfWriter pdfWriter = new PdfWriter(fichero)) {

            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDocument);

            Paragraph paragraph = new Paragraph("esto es lo que he escrito");
            document.add(paragraph);

            document.close();
            pdfDocument.close();
            System.out.println("generacion pdf con exito");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
