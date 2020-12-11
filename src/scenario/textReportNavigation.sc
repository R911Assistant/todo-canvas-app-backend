theme: /

    state: ПереходКРазделу
        q!: (перейди к разделу) 
            $AnyText::anyText
            
        script:
            moveToAnchor($parseTree._anyText, $context);
        
        go!: /ПереходимКРазделу