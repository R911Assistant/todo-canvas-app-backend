theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($Number) (квартал)}* 

        script:
            compareQuarter($parseTree._anyText, $context);
        
        go!: /СравниваемКвартал