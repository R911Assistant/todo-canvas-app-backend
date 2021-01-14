theme: /

    state: МасштабированиеГода
        intent!: /МасштабированиеГода
            
        script: 
            var $Year;
            if (typeof $parseTree.value === "object") {
                $Year = $parseTree.value.year;
            } else {
                 $Year = $parseTree.value;
            }
            zoomYear($Year, $context);
        