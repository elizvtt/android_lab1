# Лабораторна робота №1
### Завдання №1
У папці res/layout відкриваємо файл activity_main.xml. Змінюємо текст «Hello world!» на напис «З Днем Народження!» та додаємо шрифт та розмір тексту.
```
<TextView
    android:layout_width="392dp"
    android:layout_height="203dp"
    android:fontFamily="@font/greatvibes"
    android:gravity="center"
    android:text="З Днем Народження!"
    android:textColor="#08140c"
    android:textSize="70dp"
    android:textStyle="bold"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.526"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintVertical_bias="0.0" />
```
Також додаємо текст з побажаннями:
```
<TextView
    android:id="@+id/textView2"
    android:layout_width="410dp"
    android:layout_height="197dp"
    android:fontFamily="@font/greatvibes"
    android:gravity="center"
    android:text="Вітаю з твоїм особливими днем!\nНехай всі мрії та бажання здійснюються і дарують неймовірне відчуття щастя!"
    android:textColor="#08140c"
    android:textSize="35dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.0"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintVertical_bias="1.0" />
```
![image](https://github.com/user-attachments/assets/18d9ffeb-c1ff-41d9-9f34-b75c3539faaf)

В файлі activity_main.xml додаємо рядок `android:background="#E170D58B"` та змінюємо колір фону.
У папку drawable додаємо зображення img1.png та через ImageView додаємо зображення до макету.
```
<ImageView
    android:id="@+id/imageView1"
    android:layout_width="424dp"
    android:layout_height="384dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    app:srcCompat="@drawable/img1" />
```
В результаті отримуємо вітальну листівку:

![image](https://github.com/user-attachments/assets/1e0cd664-7fbb-43ce-81b0-e8fb3b388548)


### Завдання №2
У файлі activity_main.xml додаємо заголовок, підпис, слово з перемішаними літерами, поле для введення та кнопку.

![image](https://github.com/user-attachments/assets/e58b9d0e-d4ca-4f73-8734-57c8ea72413b)

У файлі MainActivity.kt пишемо логіку гри. Запускаємо додаток і перевіряємо роботу. Виводиться слово з перемішаними літерами. Користувач намагається вгадати загадане слово і вводить свій варіант у поле та натискає кнопку "Unscramble word". 

![image](https://github.com/user-attachments/assets/c3b0c31b-a2f1-4034-8ea9-398b89dfb17c)

Якщо слово вгадано - виводиться повідомлення "Correct!" та змінюєтся загадане слово.

![image](https://github.com/user-attachments/assets/8e77f352-1493-419c-a428-ee210dd13eb2)

Якщо користувач не вгадав - виводиться повідомлення "Wrong!" та користувач має можливість спробувати ще раз.

![image](https://github.com/user-attachments/assets/bafe449d-4e28-4226-8280-28a212417551)

