theme: /

    state: ВыделениеСерии
        q!: (~выделить|выдели)
            $AnyText::anyText
            
        script:
            compareMonth($parseTree._anyText, $context);
        
        go!: /ВыделяемСерию
        