theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($AnyText::number ) (квартал)}* 

        script:
            compareQuarter($parseTree._anyText, $context);
        
        go!: /СравниваемКвартал