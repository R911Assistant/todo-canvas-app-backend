theme: /

    state: МасштабированиеГода
        q!: (приблизь) ($AnyText::anyText) (год)
            
        script:
            zoomYear($parseTree._anyText, $context);
        