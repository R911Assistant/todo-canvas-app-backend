theme: /

    state: ВыделениеСерии
        q!: (~выделить|выдели) (серию)
            $AnyText::anyText
            
        script:
            selectSeries($parseTree._anyText, $context);
        
        go!: /ВыделяемСерию
        
    state: ВыделениеВсехСерий
        q!: (~выделить|выдели) (все серии)
        
        script:
            selectAllSeries($context);
        
        go!: /ВыделяемВсеСерии