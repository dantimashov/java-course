package ru.tim.lesson3.InterfaceAbstractClass;

abstract class KeywordAnalyzer implements TextAnalyzer {

    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String word : keywords){
            if(text.contains(word)){
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
}
