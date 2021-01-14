theme: /

    state: ПереходКРазделу
        q!: (открой б) $AnyText::anyText

        script:
            moveToAnchor($parseTree._anyText, $context);
        
        go!: /ПереходимКРазделу