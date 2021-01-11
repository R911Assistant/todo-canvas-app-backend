theme: /

    state: ПереходНа
        q!: (~перейти/~открыть/~переход/~показать/покажи) * [~отчет|~график]
            $AnyText::anyText
            
        script:
            goTo($parseTree._anyText, $context);
        a:  Ок1
        
        
    state: ПереходДальше
        q!: [~перейти/~открыть/~переход/~показать/покажи] [к] (дальше/~следующий/вперёд) * [~отчет|~график]

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
        