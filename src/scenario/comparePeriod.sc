theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) (@duckling.number:: digit $weight<1.001>) (квартал)}* 
        

        script:
            compareQuarter($parseTree._digit, $context);
        
        go!: /СравниваемКвартал