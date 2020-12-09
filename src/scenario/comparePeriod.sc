theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($parseTree._Number) (квартал)}* 

        script:
            compareQuarter($parseTree._Number, $context);
        
        go!: /СравниваемКвартал