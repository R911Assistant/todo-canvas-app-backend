theme: /

    state: ВыделениеСерии
        q!: (~выделить|выдели) (серию)
            $AnyText::anyText
            
        script:
            selectSeries($parseTree._anyText, $context);
        
        go!: /ВыделяемСерию
        
        