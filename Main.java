// Emma Famous
// Latin Conjugator
//Started Jul 16th 2022

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the nominitive form of your noun: ");
        String word = scan.nextLine();
        //Add a try catch with a unique error for non nominitve endings

        if(word.endsWith("a")){
            firstDeclension(word);
        }
        else if(word.endsWith("us")){
            secondDeclensionM(word);
        }
        

    }

    public static void firstDeclension(String word){
        String stem =  word.substring(0,word.length()-1);
        String endings[] = {"a", "ae", "ae", "am", "ā", "a", "ae", "ārum", "īs", "ās", "īs","ae"};
        String decName[] = {"Nom.", "Gem.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        printTable(stem, endings, decName);
    }
    
    public static void secondDeclensionM(String word){
        String stem =  word.substring(0,word.length()-2);
        String endings[] = {"us", "ī", "ō", "um", "ō", "e", "ī", "ōrum", "īs", "ōs", "īs","ī"};
        String decName[] = {"Nom.", "Gem.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

        printTable(stem, endings, decName);
    }
    public static void secondDeclensionN(String word){
        String stem =  word.substring(0,word.length()-2);
        String endings[] = {"um", "ī", "ō", "um", "ō", "e", "a", "ōrum", "īs", "a", "īs","a"};
        String decName[] = {"Nom.", "Gem.", "Dat.", "Acc.", "Abl.", "Voc.", "Nom.", "Gen.", "Dat.", "Acc.", "Abl.","Voc."};

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
