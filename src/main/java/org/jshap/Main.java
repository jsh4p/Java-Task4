package org.jshap;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void input(ArrayList<Human> humans, final String csvFilePath, final char separator) {
        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in))
                     .withCSVParser(new CSVParserBuilder()
                             .withSeparator(separator)
                             .build()
                     ).build()) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }

            String[] nextLine;
            if ((nextLine = reader.readNext()) != null) {
                System.out.println(Arrays.toString(nextLine));
            }

            while ((nextLine = reader.readNext()) != null) {
                System.out.println(Arrays.toString(nextLine));
                humans.addLast(new Human(nextLine));
            }
        } catch (CsvValidationException e) {
            throw new RuntimeException("CSV validation failed: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        input(humans, "foreign_names.csv", ';');
    }
}