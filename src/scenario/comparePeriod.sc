theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) (@duckling.number:: digit) (квартал)}* 

        script:
            compareQuarter($parseTree._digit, $context);
        
        go!: /СравниваемКвартал