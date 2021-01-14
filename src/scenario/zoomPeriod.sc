theme: /

    state: МасштабированиеГода
        intent!: /МасштабированиеГода
            
        script: 
            zoomYear($parseTree.value, $context);
        a: {{$parseTree.value}}
        