theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($OneWord:: digit) (квартал)}*
        
        script:
            compareQuarter($parseTree._digit, $context);
        
        go!: /СравниваемКвартал
        
        
    state: СравнениеПоГодам
        q!: *{(~сравнить|~соотнести|сравни) (по годам)}* 
        
        script:
            compareYears($context);
        
        go!: /СравниваемПоГодам
        
        
