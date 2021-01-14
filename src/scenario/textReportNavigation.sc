theme: /

    state: ПереходКРазделу
        q!: (~перейти/~открыть/~переход/~показать/показ*/покажи/*листа*) [к/до] * (раздел*/блок*) ($AnyText::anyText)
            
        script:
            moveToAnchor($parseTree._anyText, $context);
        
        go!: /ПереходимКРазделу