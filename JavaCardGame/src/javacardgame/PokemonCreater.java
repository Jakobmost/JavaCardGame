package javacardgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class PokemonCreater {


    public static void pokemonCreate() throws IOException {
        String fileName = "Pokedex.csv";
            
            try (BufferedReader stream = Files.newBufferedReader(Paths.get(fileName))) {
                        String line;
			//stream.forEach(System.out::println);
                        while ((line = stream.readLine()) != null) {
                            String[] values = line.split(",");
				System.out.println(values[2]);
                        }

		} catch (IOException e) {
			System.out.println("Oopps");
		}
         
    }
}
