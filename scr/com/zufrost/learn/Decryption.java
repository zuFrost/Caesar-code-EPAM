package com.zufrost.learn;

public class Decryption {
    public static void main(String[] args) {
        for (int i = 0; i < Alphabet.getRussianAlphabetLowCase().length; i++) {
            System.out.print(Alphabet.getRussianAlphabetLowCase()[i] + " ");
        }
        System.out.println();
        System.out.println(CipherText.getCipherText());

        for (int h = 11; h <= 11; h++) {
            CaesarCodeKey.setCaesarCodeKey(h);
            for (int i = 0; i < CipherText.getCipherTextInCharArray().length; i++) {
                //разделяем на алфавит и остальные знаки
                char charInCipherText = CipherText.getCipherTextInCharArray()[i];
                if (charInCipherText >= 'А' && charInCipherText <= 'Я' || charInCipherText == 'Ё') {
                    //in UpperCase
                    int serialNumberInAlphabet = Alphabet.getSerialNumberInAlphabet(charInCipherText);
                    System.out.print(Alphabet.getCharFromUpCaseAlphabetWithCaesarCodeKeyMovement(serialNumberInAlphabet, CaesarCodeKey.getCaesarCodeKey()));
                } else if (charInCipherText >= 'а' && charInCipherText <= 'я' || charInCipherText == 'ё') {
                    //in LowerCase
                    int serialNumberInAlphabet = Alphabet.getSerialNumberInAlphabet(charInCipherText);
                    System.out.print(Alphabet.getCharFromLowCaseAlphabetWithCaesarCodeKeyMovement(serialNumberInAlphabet, CaesarCodeKey.getCaesarCodeKey()));
                } else {
                    // other symbols
                    System.out.print(charInCipherText);
                }
            }
        }
    }
}
