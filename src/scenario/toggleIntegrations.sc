theme: /

    state: СледующееВнедрение
        q!: (~показать|покажи) (следующее внедрение) 
        
        script:
            showNextIntegration($context);
        
        go!: /ПоказываемСледующееВнедрение
        
        
    state: ПредыдущееВнедрение
        q!: (~показать|покажи) (предыдущее внедрение) 
        
        script:
            showPrevIntegration($context);
        
        go!: /ПоказываемПредыдущееВнедрение