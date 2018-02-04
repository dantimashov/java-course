package ru.tim.lesson3.InterfaceAbstractClass;

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int maxLen){
        maxLength = maxLen;
    }

    @Override
    public Label processText(String text) {
        return (text.length() > maxLength) ? Label.TOO_LONG : Label.OK;
    }
}
