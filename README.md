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
![image](https://github.com/user-attachments/assets/72ccffa6-f4cb-434a-a364-5e35c2196c77)

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

![image](https://github.com/user-attachments/assets/3ccb2f05-b45f-4fc2-b33f-17cd98ac13f3)
