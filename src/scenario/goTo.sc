theme: /

    state: ПереходНа
        q!: (~перейди|~перейти|открой) 
            $AnyText::anyText
            
        script:
            goTo($parseTree._anyText, $context);
        
        go!: /ПереходимНаСтраницу
        
    state: ПереходДальше
        q!: (~дальше|~следующий|вперёд) 

        script:
            goToNext($context);
        
        go!: /ПереходимНаСтраницу
        
    state: ПереходНазад
        q!: (~назад|~предыдущий|вернись) 

        script:
            goToBack($context);
        
        go!: /ПереходимНаСтраницу