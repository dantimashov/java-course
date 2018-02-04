package ru.tim.lesson3.InterfaceAbstractClass;

public class Test {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label res;
        for(TextAnalyzer check : analyzers){
            res = check.processText(text);
            if(res != Label.OK){
                return res;
            }
        }
        return Label.OK;
    }
}
