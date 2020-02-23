package com.orange.referentiel.referentielapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.orange.referentiel.referentielapi.model.CodeBanque;

public class ReferentielInitializer {

	public static void main (String []args) {
		BufferedReader csvReader = null;
		try {
			csvReader = new BufferedReader(new FileReader("D:\\orange\\referentiel\\referentiel-api\\codebanque.csv"));
			String row =null;
			int i=0;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    
			    if (i>0) {
			    	CodeBanque codeBanque = new CodeBanque();
			    	codeBanque.setCodeBanque(data[0]);
			    	codeBanque.setNomBanque(data[1]);
			    	System.out.println(codeBanque);
			    } i++;
			    
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				csvReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
	

