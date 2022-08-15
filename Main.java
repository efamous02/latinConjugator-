// Emma Famous
// Latin Conjugator

import java.io.*;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the nomintive form of your noun: ");
        String nomWord = scan.nextLine();
        System.out.println("Please input the genitive form of your noun: ");
        String genWord = scan.nextLine();

        if(nomWord.endsWith("a") && genWord.endsWith("ae")){
            firstDeclension((nomWord), genWord);
        }
        else if((nomWord.endsWith("us")|| nomWord.endsWith("r")) && genWord.endsWith("ī")){
            secondDeclensionMF(nomWord, genWord);
        }
        else if(nomWord.endsWith("um") && genWord.endsWith("ī")){
            secondDeclensionN(nomWord, genWord);
        }
        else if(nomWord.endsWith("us") && genWord.endsWith("ūs")){
            fourthDeclensionMF(nomWord, genWord);
        }
        else if(nomWord.endsWith("ū") && genWord.endsWith("ūs")){
            fourthDeclensionN(nomWord, genWord);
        }
        else if(nomWord.endsWith("ēs") && genWord.endsWith("ēī")){
            fifthDeclension(nomWord, genWord);
        }
        // else if(nomWord.endsWith("is") && genWord.endsWith("is")){
        //     thirdDeclensionIstem(nomWord, genWord);
        // }
        else if(genWord.endsWith("is")){
            thirdDeclension(nomWord, genWord);
        }
        else{
            System.out.println("apologies we could not identify this noun");
        }

    }

    public static void firstDeclension(String nomWord, String genWord){
        String stem =  genWord.substring(0,genWord.length()-2);
        String endings[] = {"a", "ae", "ae", "am", "ā", "a", "ae", "ārum", "īs", "ās", "īs","ae"};
        String decName[] = {"Nom.", "Gem.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        printTable(stem, endings, decName);
    }
    
    public static void secondDeclensionMF(String nomWord, String genWord){
        String stem =  genWord.substring(0,genWord.length()-1);
        String endings[] = {"us", "ī", "ō", "um", "ō", "e", "ī", "ōrum", "īs", "ōs", "īs","ī"};
        String decName[] = {"Nom.", "Gem.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        printTable(stem, endings, decName);
    }
    public static void secondDeclensionN(String nomWord, String genWord){
        String stem =  genWord.substring(0,genWord.length()-1);
        String endings[] = {"um", "ī", "ō", "um", "ō", "e", "a", "ōrum", "īs", "a", "īs","a"};
        String decName[] = {"Nom.", "Gen.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        printTable(stem, endings, decName);
    }
    
    public static void thirdDeclension(String nomWord, String genWord){
        String stem =  genWord.substring(0,genWord.length()-2);
        String endings[] = {"s", "is", "ī", "em", "e", "s", "ēs", "um", "ibus", "īs", "ibus","ēs"};
        String decName[] = {"Nom.", "Gen.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        for(int i = 0; i < 12; i++){
            if(i == 0){
                System.out.println("SINGULAR");
            }
            if(i == 6){
                System.out.println("PLURAL");
            }
            if(i == 0){
                System.out.println("\t" + decName[i] + ": " + nomWord);
            }
            else{
                System.out.println("\t" + decName[i] + ": " + stem + endings[i]);
            }
        }

    }
    // public static void thirdDeclensionIstem(String nomWord, String genWord){
        
    // }
        //need more information about the formation of the theird decltion before adding this


    public static void fourthDeclensionMF(String nomWord, String genWord){
        String stem = genWord.substring(0,genWord.length()-2);

        String endings[] = {"us", "ūs", "uī", "um", "ū", "us", "ūs", "uum", "ibus", "ūs", "ibus","ūs"};
        String decName[] = {"Nom.", "Gen.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        printTable(stem, endings, decName);
    }
    public static void fourthDeclensionN(String nomWord, String genWord){
        String stem = genWord.substring(0,genWord.length()-2);

        String endings[] = {"ū", "ūs", "ū", "ū", "ū", "ū", "ua", "uum", "ibus", "ua", "ibus","ua"};
        String decName[] = {"Nom.", "Gen.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        printTable(stem, endings, decName);
    }

    public static void fifthDeclension(String nomWord, String genWord){
        String stem = genWord.substring(0,genWord.length()-2);

        String endings[] = {"ēs", "eī", "eī", "em", "ē", "ēs", "ērum", "ēbus", "ēs", "ēbus"};
        String decName[] = {"Nom.", "Gen.", "Dat.", "Acc.", "Abl.",  "Nom.", "Gen.", "Dat.", "Acc.", "Abl."};

        printTable(stem, endings, decName);
    }

    public static void printTable(String stem, String[] endings, String[] decName){
        for(int i = 0; i < 12; i++){
            if(i == 0){
                System.out.println("SINGULAR");
            }
            if(i == 6){
                System.out.println("PLURAL");
            }

            System.out.println("\t" + decName[i] + ": " + stem + endings[i]);
        }
    }

}



