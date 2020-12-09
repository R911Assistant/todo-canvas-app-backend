theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) (@duckling.number:: digit) (квартал)}* 
        $weight<1.001>

        script:
            compareQuarter($parseTree._digit, $context);
        
        go!: /СравниваемКвартал