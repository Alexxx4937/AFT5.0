#language: ru
Функционал: Работа калькулятора вкладов РенесансКредит

@test1
 Сценарий:  1-Заявка  на вклад 300 000 рублей
Когда выбран пункт меню "Вклады"
  Когда выбрана валюта "Рубли"
   Когда  заполнено поле сумма вклада "300000"
Когда выбран срок вклада "6 месяцев"
   Когда заполнено поле ежемесячное пополнение "50000"
   Когда отмечено поле "Ежемесячная капитализация"
  Тогда проверено что  Ставка - "5.80%"
  Тогда проверено что  К снятию через 6 месяцев– "562 350,83"
  Тогда проверено что  Пополнение за 6 месяцев - "250 000"
  Тогда проверено что  Начислено - "12 350,83"

  @test2
  Сценарий:  2-Заявка  на вклад 500 000 рублей
    Когда выбран пункт меню "Вклады"
    Когда выбрана валюта "Рубли"
    Когда  заполнено поле сумма вклада "500000"
    Когда выбран срок вклада "6 месяцев"
    Когда заполнено поле ежемесячное пополнение "70000"
    Когда отмечено поле "Ежемесячная капитализация"
    Когда отмечено поле "Частичное снятие"
    Тогда проверено что  Ставка - "5.65%"
    Тогда проверено что  К снятию через 6 месяцев– "869 107,22"
    Тогда проверено что  Пополнение за 6 месяцев - "350 000"
    Тогда проверено что  Начислено - "19 107,22"

