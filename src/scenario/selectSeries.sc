theme: /

    state: ВыделениеСерии
        q!: (~выделить|выдели) (сери*)
            $AnyText::anyText
            
        script:
            compareMonth($parseTree._anyText, $context);
        
        go!: /ВыделяемСерию
        