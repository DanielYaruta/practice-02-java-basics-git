# Java miniApps Console

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

Консольное меню с набором мини-приложений на Java: игры, утилиты и учебные задачи в одном месте.

---

## Задания

| # | Класс | Описание |
|---|-------|----------|
| 1 | `TimeOfDay` | Определяет время суток (утро / день / вечер / ночь) по введённому часу |
| 2 | `MultiplicationTable` | Выводит таблицу умножения для числа от 1 до 9 |
| 3 | `GuessNumber` | Игра «Угадай число»: программа загадывает число от 1 до 100, игрок угадывает с подсказками |

---

## Структура проекта

```
src/main/java/org/example/
├── Main.java                  # точка входа, главное меню
├── TimeOfDay.java             # задание 1 — время суток
├── MultiplicationTable.java   # задание 2 — таблица умножения
├── GuessNumber.java           # задание 3 — угадай число
└── InputHelper.java           # валидация ввода с консоли
```
