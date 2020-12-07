theme: /

    state: СравнениеКвартала
        q!: (~сравнить|~соотнести|сравни $AnyText::anyText квартал) 

        script:
            compareQuarter($parseTree._anyText, $context);
        
        go!: /СравниваемКвартал