# Когда приходит ServerAction, сообщение прилетает в состояние, 
# с условием на вход action_id.
# пример:
#     event!: action_id

theme: /

    state: Неудача
        event!: some_action_name
        event!: SOME_ACTION_NAME

        random: 
            a: Не вышло!
            a: Никак!
            a: Не могу выполнить
    
    state: ЗаданиеВыполнено
        event!: done
        event!: DONE

        random: 
            a: Молодец!
            a: Красавичк!
            a: Супер

        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину" 
            
    state: ДобавленаНоваяЗапись
        event!: note_added
        event!: NOTE_ADDED

        random: 
            a: Добавлено!
            a: Сохранено!
            a: Записано!
        
        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину" 

           
    state: ПереходимНаСтраницу
        event!: done
        event!: DONE

        random: 
            a: Перехожу
            a: Открываю
            
    
    
    state: СравниваемПоГодам
        event!: done
        event!: DONE
        random:
            a: Сравниваю по годам
            
    state: СравниваемТекущийГод
        event!: done
        event!: DONE
        random:
            a: Сравниваю текущий год
            
    state: СравниваемПолугодие
        event!: done
        event!: DONE
        random:
            a: Сравниваю полугодие
           
    state: СравниваемКвартал
        event!: done
        event!: DONE
        random:
            a: Сравниваю квартал
            
    state: СравниваемМесяц
        event!: done
        event!: DONE
        random:
            a: Сравниваю месяц
            
            
            
            
    state: ВыделяемСерию
        event!: done
        event!: DONE
        random:
            a: Выделяю серию
            
    state: ВыделяемВсеСерии
        event!: done
        event!: DONE
        random:
            a: Выделяю все серии
            
            
            
            
    state: ПоказываемСледующееВнедрение
        event!: done
        event!: DONE
        random:
            a: Показываю следующее внедрение
            
            
    state: ПоказываемПредыдущееВнедрение
        event!: done
        event!: DONE
        random:
            a: Показываю предыдущее внедрение
            
            
    state: ПереходимКРазделу
        event!: done
        event!: DONE
        random:
            a: Перехожу к разделу
            
    state: Отменяем
        event!: done
        event!: DONE
        random:
            a: Отменяю