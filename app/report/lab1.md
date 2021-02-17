# Цели
- Ознакомиться со средой разработки Android Studio
- Изучить основные принципы верстки layout с использованием View и ViewGroup
- Изучить основные возможности и свойства LinearLayout
- Изучить основные возможности и свойства ConstraintLayout

## Вариант 16

![](https://github.com/andrei-kuznetsov/android-lectures/blob/master/labs/01/linear/16.png) 
![](https://github.com/andrei-kuznetsov/android-lectures/blob/master/labs/01/linear/03.png)

## Задача 1 - LinearLayout

__Листинг 1.1__

    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
    
        <TextView
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:gravity="center"
            android:text="@string/meme_generator" />
    
        <ImageView
            android:id="@+id/memeimage1_1"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:src="@drawable/meme_1" />
    
        <Space
            android:layout_width="match_parent"
            android:layout_height="150dp" />
    
        <Button
            android:id="@+id/memebutton1_1"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:text="@string/choose_your_meme" />
    
    
    </LinearLayout>
    
__Листинг 1.1.1__

    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
    
        <TextView
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:gravity="center"
            android:text="@string/meme_generator" />
    
        <ImageView
            android:id="@+id/memeimage1_1"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:src="@drawable/meme_1" />
    
    
        <Button
            android:id="@+id/memebutton1_1"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:layout_marginTop="150dp"
            android:text="@string/choose_your_meme" />
    
    
    </LinearLayout>

__Листинг 1.2__

    <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">
    
        <TextView
            android:layout_width="50dp"
            android:layout_height="match_parent"
            android:text="@string/positive_meme"
            android:gravity="center"/>
    
        <Button
            android:id="@+id/memebutton1_2"
            android:layout_width="50dp"
            android:layout_height="match_parent"
            android:text="@string/push_the_button"
            android:gravity="center"/>
    
        <ImageView
            android:id="@+id/memeimage1_2"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:src="@drawable/meme_1"/>
    </LinearLayout>



- layout_weight - веса для заполнения пространства (в моих случаях ставил всегда
1, чтобы равномерно 3 объекта заполняли);
- gravity - расположение содержимого внутри объекта (для __TextView__ использовал,
чтобы текст был в центре);
- layout_gravity - расположение объекта внутри layout;
- orientation - ориентация - горизонтальная и вертикальная;
- layout_height - высота объекта (данное поле нельзя убрать);
- layout_width - длина объекта (данное поле нельзя убрать).

Как мне кажется я максимально уменьшил код, убрав все лишние тэги и атрибуты.

### Вывод
LinearLayout достаточно прост в использовании, он попросту выравнивает объекты
по горизонтали или вертикали. Но я бы всё-таки предпочел ConstraintLayout,
который мы будем использовать во второй задаче.

## Задача 2 - ConstraintLayout

__Листинг 2.1__

    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/linearLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    
        <TextView
            android:id="@+id/textView"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_marginBottom="193dp"
            android:gravity="center"
            android:text="@string/meme_generator"
            app:layout_constraintBottom_toTopOf="@+id/space"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />
    
        <ImageView
            android:id="@+id/memeimage2_1"
            android:layout_width="0dp"
            android:layout_height="194dp"
            android:src="@drawable/meme_1"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/textView" />
    
        <Space
            android:id="@+id/space"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_marginBottom="1dp"
            app:layout_constraintBottom_toTopOf="@+id/memebutton2_1"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/textView" />
    
        <Button
            android:id="@+id/memebutton2_1"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:text="@string/choose_your_meme"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/space" />
    
    
    </androidx.constraintlayout.widget.ConstraintLayout>

__Листинг 2.2__

    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/linearLayout2"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal">
    
        <androidx.constraintlayout.widget.Guideline
            android:id="@+id/guideline1"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"
            app:layout_constraintGuide_begin="50dp"/>
    
        <androidx.constraintlayout.widget.Guideline
            android:id="@+id/guideline2"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"
            app:layout_constraintGuide_begin="100dp"/>
    
        <TextView
            android:id="@+id/textView2"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:gravity="center"
            android:text="@string/positive_meme"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="@id/guideline1"/>
    
        <Button
            android:id="@+id/memebutton2_2"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:gravity="center"
            android:text="@string/push_the_button"
            app:layout_constraintStart_toEndOf="@id/guideline1"
            app:layout_constraintEnd_toStartOf="@id/guideline2"/>
    
        <ImageView
            android:id="@+id/memeimage2_2"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:src="@drawable/meme_2"
            app:layout_constraintStart_toEndOf="@id/guideline2"
            app:layout_constraintEnd_toEndOf="parent"/>
    </androidx.constraintlayout.widget.ConstraintLayout>


- layout_constraintDimensionRatio - отношение сторон;
- layout_constraintHorizontal_weight - тот же вес, что и в LinearLayout только для горизонтали;
- layout_constraintVertical_weight - вес для вертикали.

### Вывод
Ничего необычного в данном пункте мы не получили, просто заменили LinearLayout
на ConstraintLayout. Их главное отличие лишь в том, что мы можем устанавливать
интересные связи между объектами, что значительно упрощает расположение объектов
на экране.

## Задача 3 - ConstraintLayout

![](https://github.com/andrei-kuznetsov/android-lectures/blob/master/labs/01/constraint/lab01_constraint_v16.png)

__Листинг 3.1__

    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    
        <androidx.constraintlayout.widget.ConstraintLayout
            android:id="@+id/CL"
            android:layout_width="0dp"
            android:layout_height="0dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintDimensionRatio="1"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent">
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline1"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="horizontal"
                app:layout_constraintGuide_percent="0.2" />
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline2"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="horizontal"
                app:layout_constraintGuide_percent="0.4" />
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline3"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="horizontal"
                app:layout_constraintGuide_percent="0.6" />
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline4"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="horizontal"
                app:layout_constraintGuide_percent="0.8" />
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline5"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="vertical"
                app:layout_constraintGuide_percent="0.2" />
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline6"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="vertical"
                app:layout_constraintGuide_percent="0.4" />
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline7"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="vertical"
                app:layout_constraintGuide_percent="0.6" />
    
            <androidx.constraintlayout.widget.Guideline
                android:id="@+id/guideline8"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:orientation="vertical"
                app:layout_constraintGuide_percent="0.8" />
    
            <CheckBox
                android:id="@+id/checkbox"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:text="@string/checkbox"
                app:layout_constraintBottom_toTopOf="@id/guideline1"
                app:layout_constraintEnd_toEndOf="@id/guideline6"
                app:layout_constraintStart_toStartOf="@id/CL"
                app:layout_constraintTop_toTopOf="@id/CL" />
    
            <ImageView
                android:id="@+id/image"
                android:layout_width="0dp"
                android:layout_height="0dp"
                app:layout_constraintBottom_toBottomOf="@id/CL"
                app:layout_constraintEnd_toEndOf="@id/guideline5"
                app:layout_constraintStart_toStartOf="@id/CL"
                app:layout_constraintTop_toTopOf="@id/guideline3"
                android:src="@drawable/ic_launcher_background" /> 
    
            <TextView
                android:id="@+id/text"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:text="@string/textview"
                app:layout_constraintStart_toEndOf="@id/image"
                app:layout_constraintEnd_toEndOf="@id/guideline6"
                app:layout_constraintTop_toTopOf="@id/guideline3"
                app:layout_constraintBottom_toBottomOf="@id/CL"
                />
    
            <Button
                android:id="@+id/buttonPanel"
                android:layout_width="0dp"
                android:layout_height="0dp"
                android:text="@string/button"
                app:layout_constraintStart_toEndOf="@id/text"
                app:layout_constraintEnd_toEndOf="@id/guideline8"
                app:layout_constraintTop_toTopOf="@id/guideline4"
                app:layout_constraintBottom_toBottomOf="@id/CL"/>
    
            <ProgressBar
                android:id="@+id/progress_circular"
                android:layout_width="0dp"
                android:layout_height="0dp"
                app:layout_constraintStart_toStartOf="@id/guideline5"
                app:layout_constraintEnd_toEndOf="@id/guideline7"
                app:layout_constraintTop_toTopOf="@id/guideline2"
                app:layout_constraintBottom_toTopOf="@id/text" />
    
            <SeekBar
                android:id="@+id/action_bar"
                android:layout_width="0dp"
                android:layout_height="0dp"
                app:layout_constraintStart_toEndOf="@id/progress_circular"
                app:layout_constraintEnd_toEndOf="@id/CL"
                app:layout_constraintTop_toTopOf="@id/guideline2"
                app:layout_constraintBottom_toBottomOf="@id/guideline3"/>
            <CalendarView
                android:layout_width="0dp"
                android:layout_height="0dp"
                app:layout_constraintTop_toBottomOf="@id/action_bar"
                app:layout_constraintBottom_toTopOf="@id/buttonPanel"
                app:layout_constraintStart_toEndOf="@id/guideline7"
                app:layout_constraintEnd_toEndOf="@id/CL"/>
    
        </androidx.constraintlayout.widget.ConstraintLayout>
    </androidx.constraintlayout.widget.ConstraintLayout>

Эта задача оказалась чуть-чуть интереснее предыдущих, так как здесь мы задействовали бОльшее
количество всяких элементов, связанных более креативно между собой, нежели в предыдущих пунктах!

## Выводы
Таким образом, в ходе данной лабораторной работы были изучены основы
верстки android-приложений и возможности и атрибуты LinearLayout и Constraint
Layout. Главным их отличием является то, что в первом случае
предоставляются в линейном виде (один за другим), а во втором же может
производиться «привязка» элементов друг к другу в произвольном порядке. Выбор
оптимальной конструкции зависит от целей макета: если он должен быть
максимально простым, не требуется сложное расположение элементов, они
располагаются в строчку или колонку, то лучше использовать LinearLayout. В
случае более сложного правила расположения элементов лучше использовать
ConstraintLayout, это более оптимально, так как при вложенных друг в друга
LinearLayout при указании весов будет долго рассчитываться расположение
элементов.