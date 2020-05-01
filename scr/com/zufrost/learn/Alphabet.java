package com.zufrost.learn;

public class Alphabet {
    private static char[] russianAlphabetLowCase = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private static char[] russianAlphabetUpCase = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
    public static final int RUSSIAN_ALPHABET_POWER = russianAlphabetLowCase.length;

    public static char[] getRussianAlphabetLowCase() {
        return russianAlphabetLowCase;
    }

    public static char[] getRussianAlphabetUpCase() {
        return russianAlphabetUpCase;
    }

    public static int getSerialNumberInAlphabet(char charInCipherText) {
        for (int i = 0; i < Alphabet.RUSSIAN_ALPHABET_POWER; i++) {
            if (Alphabet.getRussianAlphabetUpCase()[i] == charInCipherText || Alphabet.getRussianAlphabetLowCase()[i] == charInCipherText) {
                return i;
            }
        }
        return -1;
    }

    public static char getCharFromUpCaseAlphabetWithCaesarCodeKeyMovement(int serialNumberInAlphabet, int caesarCodeKey) {
        //    применяем сдвиг право на CaesarCodeKey.getCaesarCodeKey() элементов
        if (serialNumberInAlphabet + caesarCodeKey >= Alphabet.RUSSIAN_ALPHABET_POWER) {
            return Alphabet.getRussianAlphabetUpCase()[serialNumberInAlphabet + caesarCodeKey - Alphabet.RUSSIAN_ALPHABET_POWER];
        } else {
            return Alphabet.getRussianAlphabetUpCase()[serialNumberInAlphabet + caesarCodeKey];
        }
    }

    public static char getCharFromLowCaseAlphabetWithCaesarCodeKeyMovement(int serialNumberInAlphabet, int caesarCodeKey) {
        //    применяем сдвиг право на CaesarCodeKey.getCaesarCodeKey() элементов
        if (serialNumberInAlphabet + caesarCodeKey >= Alphabet.RUSSIAN_ALPHABET_POWER) {
            return Alphabet.getRussianAlphabetLowCase()[serialNumberInAlphabet + caesarCodeKey - Alphabet.RUSSIAN_ALPHABET_POWER ];
        } else {
            return Alphabet.getRussianAlphabetLowCase()[serialNumberInAlphabet + caesarCodeKey];
        }
    }

}
