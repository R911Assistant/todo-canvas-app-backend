theme: /

    state: ПереходНа
        q!: (~перейди|~перейти|открой) 
            $AnyText::anyText
            
        script:
            goTo($parseTree._anyText, $context);
        
        
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