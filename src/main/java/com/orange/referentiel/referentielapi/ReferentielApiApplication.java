package com.orange.referentiel.referentielapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.orange.referentiel.referentielapi.model.CodeBanque;

@SpringBootApplication
public class ReferentielApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferentielApiApplication.class, args);
		
	}

}
