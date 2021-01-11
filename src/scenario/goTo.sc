theme: /

    state: ПереходНа
        q!: (~перейти/~открыть) * [отчет|график]
            $AnyText::anyText
            
        script:
            goTo($parseTree._anyText, $context);
        a:  Ок
        
        
    state: ПереходДальше
        q!: [~перейти/~открыть] (дальше/следующий/вперёд) * [отчет|график]

        script:
            goToNext($context);
        a: Ладно
            
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
        