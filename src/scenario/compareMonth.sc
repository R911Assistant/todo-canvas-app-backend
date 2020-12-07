theme: /

    state: СравнениеМесяца
        q!: (~сравнить|~соотнести|сравни) 
            $AnyText::anyText
            
        script:
            compareMonth($parseTree._anyText, $context);
        
        go!: /СравниваемМесяц