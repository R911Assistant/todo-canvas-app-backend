theme: /

    state: ПереходНа
        q!: (~перейди|~перейти|открой) 
            $AnyText::anyText
            
        script:
            goTo($parseTree._anyText, $context);
        
        go!: /ПереходимНаСтраницу