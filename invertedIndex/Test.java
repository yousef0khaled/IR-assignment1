/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invertedIndex;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Test class for the inverted index implementation
 * @author ehab
 */
public class Test {

    public static void main(String args[]) throws IOException {
        Index5 index = new Index5();
        String files = "D:\\information retrieval\\is322_HW_1\\documents\\";

        File file = new File(files);
        String[] fileList = file.list();

        fileList = index.sort(fileList);
        index.N = fileList.length;

        for (int i = 0; i < fileList.length; i++) {
            fileList[i] = files + fileList[i];
        }
        
        // Build and store the index
        index.buildIndex(fileList);
        index.store("index");
        index.printDictionary();

        // Test with a sample query
        String test3 = "data should plain greatest comif";
        System.out.println("Boolean Model result = \n" + index.find_24_01(test3));

        // Interactive query loop
        String phrase = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            System.out.println("\nPrint search phrase (empty to quit): ");
            phrase = in.readLine().trim();
            
            if (!phrase.isEmpty()) {
                System.out.println("Search results for: \"" + phrase + "\"");
                System.out.println(index.find_24_01(phrase));
            }
        } while (!phrase.isEmpty());
        
        System.out.println("Program terminated.");
    }
}
