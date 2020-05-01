package com.zufrost.learn;

public class Alphabet {
    private static char[] russianAlphabetLowCase = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я'};
    private static char[] russianAlphabetUpCase = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я'};
    public static final int RUSSIAN_ALPHABET_POWER = russianAlphabetLowCase.length;

    public static char[] getRussianAlphabetLowCase() {
        return russianAlphabetLowCase;
    }

    public static char[] getRussianAlphabetUpCase() {
        return russianAlphabetUpCase;
    }

}
