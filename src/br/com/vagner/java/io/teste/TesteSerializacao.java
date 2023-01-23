package br.com.vagner.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		
		//String nome = "vagner Torres";
		
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
		
		//oos.writeObject(nome);
		//oos.close(); //Criando de um objeto, um arquivo de bits e bytes
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
		
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);// de um arquivo bits/byte cria um objeto 
	}

}
