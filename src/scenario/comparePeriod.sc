theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($parseTree._Number) (квартал)}* 

        script:
            compareQuarter($parseTree._anyText, $context);
        
        go!: /СравниваемКвартал