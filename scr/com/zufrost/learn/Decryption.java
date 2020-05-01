package com.zufrost.learn;

public class Decryption {
    public static void main(String[] args) {

        for (int h = 0; h < Alphabet.RUSSIAN_ALPHABET_POWER; h++) {
            CaesarCodeKey.setCaesarCodeKey(h);
            for (int i = 0; i < CipherText.getCipherTextInCharArray().length; i++) {
                //split to UpperCase LowerCase and Other Symbols
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
            System.out.println();
        }
    }
}
