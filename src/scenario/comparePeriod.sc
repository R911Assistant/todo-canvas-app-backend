theme: /

    state: СравнениеКвартала
        q!: *{(~сравнить|~соотнести|сравни) ($AnyText::anyText) (квартал)}* 

        script:
            compareQuarter($parseTree._number, $context);
        
        go!: /СравниваемКвартал