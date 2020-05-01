package com.zufrost.learn;

public class Decryption {
    public static void main(String[] args) {


        for (int i = 0; i < Alphabet.getRussianAlphabetLowCase().length; i++) {
            System.out.print(Alphabet.getRussianAlphabetLowCase()[i] + " ");
        }
        System.out.println();
        System.out.println(CipherText.getCipherText());

//        for (int i = 0; i < Alphabet.getRussianAlphabetUpCase().length; i++) {
//            System.out.print(Alphabet.getRussianAlphabetUpCase()[i] + " ");
//        }

//        System.out.println();
//        System.out.println("сейчас код Цезаря = " + CaesarCodeKey.getCaesarCodeKey());
//
//        System.out.println("RUSSIAN_ALPHABET_POWER= " + Alphabet.RUSSIAN_ALPHABET_POWER);
//        System.out.println("код буквы Ё = " + (int) 'Ё');


//        for (int h = 1; h <= Alphabet.RUSSIAN_ALPHABET_POWER; h++) {
        for (int h = 11; h <= 11; h++) {
            CaesarCodeKey.setCaesarCodeKey(h);
//            System.out.print(h + " ");
            for (int i = 0; i < CipherText.getCipherTextInCharArray().length; i++) {
//            System.out.print(CipherText.getCipherTextInCharArray()[i]);
                //разделяем на алфавит и остальные знаки
                char charInCipherText = CipherText.getCipherTextInCharArray()[i];

                if (charInCipherText >= 'А' && charInCipherText <= 'Я' || charInCipherText == 'Ё') {
                    //in UpperCase
                    //найти, какой по счету в алфавите, является charInCipherText
                    for (int j = 0; j < Alphabet.RUSSIAN_ALPHABET_POWER; j++) {
                        if (Alphabet.getRussianAlphabetUpCase()[j] == charInCipherText) {
//                            System.out.println(charInCipherText + " это " + j + " буква в алфавите");
                            //применяем сдвиг право на CaesarCodeKey.getCaesarCodeKey() элементов
                            if (j + CaesarCodeKey.getCaesarCodeKey() >= Alphabet.RUSSIAN_ALPHABET_POWER) {
                                System.out.print(Alphabet.getRussianAlphabetUpCase()[j + CaesarCodeKey.getCaesarCodeKey() - Alphabet.RUSSIAN_ALPHABET_POWER]);
                            } else {
                                System.out.print(Alphabet.getRussianAlphabetUpCase()[j + CaesarCodeKey.getCaesarCodeKey()]);
                            }
                        }
                    }
                } else if (charInCipherText >= 'а' && charInCipherText <= 'я' || charInCipherText == 'ё') {
                    //in LowerCase
                    //найти, какой по счету в алфавите, является charInCipherText
                    for (int j = 0; j < Alphabet.RUSSIAN_ALPHABET_POWER; j++) {
                        if (Alphabet.getRussianAlphabetLowCase()[j] == charInCipherText) {
//                            System.out.println(charInCipherText + " это " + j + " буква в алфавите");
                            //применяем сдвиг право на CaesarCodeKey.getCaesarCodeKey() элементов
                            if (j + CaesarCodeKey.getCaesarCodeKey() >= Alphabet.RUSSIAN_ALPHABET_POWER) {
                                System.out.print(Alphabet.getRussianAlphabetLowCase()[j + CaesarCodeKey.getCaesarCodeKey() - Alphabet.RUSSIAN_ALPHABET_POWER]);
                            } else {
                                System.out.print(Alphabet.getRussianAlphabetLowCase()[j + CaesarCodeKey.getCaesarCodeKey()]);
                            }
                        }
                    }


                } else {
                    // other symbols
                    System.out.print(charInCipherText);
                }
            }
            System.out.println();

        }




    }
}
