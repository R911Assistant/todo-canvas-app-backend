theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($Number::number ) (квартал)}* 

        script:
            compareQuarter($parseTree._anyText, $context);
        
        go!: /СравниваемКвартал