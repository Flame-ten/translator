package com.andrew.translator;

import com.andrew.englishLetter.EnglishSymbols;
import com.andrew.englishMorse.MorseEnglish;
import com.andrew.russianLetter.RussianSymbols;
import com.andrew.russianMorse.MorseRussian;
import java.util.Scanner;

public class Translator {
   public void translate() {
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine().toLowerCase();
        StringBuilder outputMorse = new StringBuilder();

        char[] chars = userInput.toCharArray();

        for (int inputEnglish : chars)
            for (int outputEnglish = 0; outputEnglish < EnglishSymbols.english.length; outputEnglish++) {
                if (EnglishSymbols.english[outputEnglish] == inputEnglish) {
                    outputMorse.append(MorseEnglish.morse[outputEnglish]).append(" ");
                }
            }
        for (int inputRussian : chars)
            for (int outputRussian = 0; outputRussian < RussianSymbols.russian.length; outputRussian++) {

                if (RussianSymbols.russian[outputRussian] == inputRussian) {
                    outputMorse.append(MorseRussian.morseRus[outputRussian]).append(" ");
                }
            }
        System.out.println(outputMorse);

    }
}