package arquitecturaBaseDeDatos.controladores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import arquitecturaBaseDeDatos.clases.Usuario;
import arquitecturaBaseDeDatos.servicios.implementacionConexion;
import arquitecturaBaseDeDatos.servicios.interfazConexion;
import com.fasterxml.jackson.databind.ObjectMapper;

public class principal {

	public static void main(String[] args) {
		 try {
	            URL url = new URL("http://localhost:8080/api/usuario");
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            ObjectMapper objectMapper = new ObjectMapper();
	            String line;
	            String [] vectorUsers= {};
	            List<Usuario> usuarios=new ArrayList();
	            while ((line = reader.readLine()) != null) {
	            	usuarios = objectMapper.readValue(line, new TypeReference<List<Usuario>>() {});
	            }
	            Scanner leer= new Scanner(System.in);
	            
	            System.out.println("Introduzca su usuario");
	            String usuario= leer.next();
	            
	            for(int i=0;i<usuarios.size();i++) {
	            	if(usuarios.get(i).getNombre_usuario().equals(usuario)) {
	            		System.out.println("Introduzca su contrasenia");
	    	            String con= codificar(leer.next());
	    	            if(con.equals(codificar(usuarios.get(i).getClave_usuario()))) {
	    	            	System.out.println("Esta bien");
	    	            }
	    	            else
	    	            	System.out.println("Esta mal");
	            	}
	            }
	            reader.close();
	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}
	public static String codificar(String mensaje) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(mensaje.getBytes(StandardCharsets.UTF_8));
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
		String hex = Integer.toHexString(hash[i] & 0xff);
		if (hex.length() == 1) {
		hexString.append("0");
		}
		hexString.append(hex);
		}
		return hexString.toString();
		}

}
