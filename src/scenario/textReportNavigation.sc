theme: /

    state: ПереходКРазделу
        q!: (перейди к разделу) 
            $AnyText::anyText
            
        script:
            ($parseTree._anyText, $context);
        
        go!: /ПереходимКРазделу