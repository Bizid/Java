/*
 * Copyright 2017 Lassaad 
 */
package ransomnotemore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author lassaad
 */
public class RansomNotemore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        List<String> magazineWords = Arrays.stream(magazine).sorted().collect(Collectors.toList());
boolean notRemovedWord = Arrays.stream(ransom).anyMatch(word->!magazineWords.remove(word));
System.out.println(notRemovedWord ? "No" : "Yes");
    }
    
}
