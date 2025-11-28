package com.responsescope.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/binaryStreamExample")
public class BinaryStreamExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BinaryStreamExample() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Imposta il MIME type per immagini PNG
        response.setContentType("image/png");
        
        // Ottenere lo stream di output binario
        
        ServletOutputStream out = response.getOutputStream();
        
        // Aprire lo stream verso il file immagine
        InputStream diamondStream = getServletContext().getResourceAsStream("/WEB-INF/images/diamond.png");
	
        if (diamondStream != null) {
        	
        	// Leggere il file in blocchi di byte
			byte[] buffer = new byte[diamondStream.available()];
			diamondStream.read(buffer);
			
			// Scrivere i byte nello stream di output della risposta
			out.write(buffer);
			
			// Flush e chiusura dello stream di output
			out.flush();
			
			diamondStream.close();
		} else {
			response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
