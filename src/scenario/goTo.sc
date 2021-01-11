theme: /

    state: ПереходНа
        q!: (~перейти/~открыть) * [отчет|график]
            $AnyText::anyText
            
        script:
            goTo($parseTree._anyText, $context);
        a:  Ок
        
        
    state: ПереходДальше
        q!: (~дальше|~следующий|вперёд) 

        script:
            goToNext($context);
            
        go!: /ПереходимНаСледующуюСтраницу
        
        
    state: ПереходНазад
        q!: (~назад|~предыдущий|вернись) 

        script:
            goToBack($context);
        
        go!: /ПереходимНаПредыдущуюСтраницу
        
    state: ПереходКРазделу
        q!: (перейди к разделу) 
            $AnyText::anyText
            
        script:
            goToAnchor($parseTree._anyText, $context);
        