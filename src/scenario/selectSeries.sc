theme: /

    state: ВыделениеСерии
        q!: (~выделить|выдели) 
            $AnyText::anyText
            
        script:
            selectSeries($parseTree._anyText, $context);
        
        go!: /ВыделяемСерию
        
        