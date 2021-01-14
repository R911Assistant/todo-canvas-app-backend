theme: /

    state: МасштабированиеГода
        intent!: 
        q!: (приблиз*/увелич*/масштаб*) ($AnyText::anyText) [год*]
            
        script: 
            var $Year;
            if (typeof $parseTree.value === "object") {
                $Year = $parseTree.value.year;
            } else {
                 $Year = $parseTree.value;
            }
            zoomYear($Year, $context);
        