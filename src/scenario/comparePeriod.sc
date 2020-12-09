theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($number) (квартал)}* 

        script:
            compareQuarter($number, $context);
        
        go!: /СравниваемКвартал