theme: /

    state: ПереходКРазделу
        q!: (открой блок) $AnyText::anyText

        script:
            moveToAnchor($parseTree._anyText, $context);
        
        go!: /ПереходимКРазделу