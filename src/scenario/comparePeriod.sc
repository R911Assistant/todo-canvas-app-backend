theme: /

    
    state: СравнениеПоГодам
        q!: *{(~сравнить|~соотнести|сравни) (по годам)}* 
        
        script:
            compareYears($context);
        
        go!: /СравниваемПоГодам
        
    state: СравнениеТекущегоГода
        q!: *{(~сравнить|~соотнести|сравни) (текущий год)}* 
        
        script:
            compareYear($context);
        
        go!: /СравниваемТекущийГод
        
        
    state: СравнениеПолугодия
        q!: *{(~сравнить|~соотнести|сравни) ($OneWord:: digit) (полугодие)}*
        
        script:
            compareHalfYear($parseTree._digit, $context);
        
        
        
    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($OneWord:: digit) (квартал)}*
        
        script:
            compareQuarter($parseTree._digit, $context);
        
        go!: /СравниваемКвартал
        
    state: СравнениеМесяца
        q!: (~сравнить|~соотнести|сравни) 
            $OneWord::anyText
            
        script:
            compareMonth($parseTree._anyText, $context);
        
        go!: /СравниваемМесяц
        
        