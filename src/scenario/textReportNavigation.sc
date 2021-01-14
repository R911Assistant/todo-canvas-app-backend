theme: /

    state: ПереходКРазделу
        q!: (~перейти/откр*/~переход/~показать/показ*/покажи/*листа*) [к/до] (раздел*/блок*/блог*/блок/блог) ($AnyText::anyText)
            
        script:
            moveToAnchor($parseTree._anyText, $context);
        
        go!: /ПереходимКРазделу