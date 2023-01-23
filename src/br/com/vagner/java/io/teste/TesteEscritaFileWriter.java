package br.com.vagner.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {


		//Fluxo de saída com Arquivo
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
	//	FileWriter fw = new FileWriter("lorem2.txt");//classe para escrever com arquivo
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write( "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");//atributo para string
		//fw.write("\n"); Nova linha
		//bw.write(System.lineSeparator());//nova linha
		//bw.write(System.lineSeparator());
		bw.newLine();
		bw.newLine();
		bw.write("escrito por Vagner");
		
		bw.close();

	}

}
