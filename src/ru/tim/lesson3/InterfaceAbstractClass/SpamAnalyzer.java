package ru.tim.lesson3.InterfaceAbstractClass;

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] spamWords){
        keywords = spamWords;
    }


    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
