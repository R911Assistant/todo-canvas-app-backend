theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($Number::number) (квартал)}* 

        script:
            compareQuarter($parseTree._Number, $context);
        
        go!: /СравниваемКвартал