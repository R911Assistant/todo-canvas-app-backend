theme: /

    state: ПереходКРазделу
        q!: (отопри б) $AnyText::anyText

        script:
            moveToAnchor($parseTree._anyText, $context);
        
        go!: /ПереходимКРазделу