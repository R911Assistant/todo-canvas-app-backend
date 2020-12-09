theme: /

    state: СравнениеМесяца
        q!: (~сравнить|~соотнести|сравни) 
            @duckling.number:: digit
            
        script:
            compareMonth($parseTree._anyText, $context);
        
        go!: /СравниваемМесяц