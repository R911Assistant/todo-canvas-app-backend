theme: /

    state: МасштабированиеГода
        q!: (приблиз*/увелич*/масштаб*) ($AnyText::anyText) [год*]
            
        script:
            zoomYear($parseTree._anyText, $context);
        