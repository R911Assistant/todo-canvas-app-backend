theme: /

    state: ВыделениеСерии
        q!: {(выдел*/выбер*/выбор/выбра*) (сери*)
            $AnyText::anyText}
            
        script:
            selectSeries($parseTree._anyText, $context);
        
        
    state: ВыделениеВсехСерий
        q!:  {(выдел*/выбер*/выбор/выбра*) (все* сери*)}
        
        script:
            selectAllSeries($context);
        
        go!: /ВыделяемВсеСерии