/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author I
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static Double averageValue(List<Integer> list) {
        return list.stream()
                .mapToDouble(x -> x)
                .average()
                .orElse(0);
    }

    public static List<String> convertToUpperCase(List<String> list) {
        return list.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
    }

    public static List<String> filterStrings(List<String> list) {
        return list.stream()
                .filter(x -> x.startsWith("a") && x.length() == 3)
                .collect(Collectors.toList());
    }

    public static String commaSeparatedStrings(List<Integer> list) {
        return list.stream()
                .map(x -> x % 2 == 0 ? "e" + x : "o" + x)
                .collect(Collectors.joining(","));
    }
    
}
