theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) (@duckling.ordinal:: digit) (квартал)}* 
        

        script:
            compareQuarter($parseTree._digit, $context);
        
        go!: /СравниваемКвартал