public class HelloWorld
{
    public static void main (String [] args) {
        // вычисление общего времени работы программы - начало
        long tBegin = System.currentTimeMillis();
        // приветствие
        System.out.println("Hello, boss");

        System.out.println("==========================================================");
        {// Разбиение мс на понятные значения
            int s = (int) (Math.random() * 1000000);
            int sec = s % 60;
            int m = (s - sec) / 60;
            int min = m % 60;
            int h = (m - min) / 60;
            int hours = h % 24;
            int d = (h - hours) / 24;
            int days = d % 7;
            int w = (d - days) / 7;
            System.out.println("s=" + s);
            System.out.println(w + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");

        }

        System.out.println("==========================================================");
        {// Определение деления последней цифры на 3
            int x = (int) (Math.random() * 100);
            System.out.println("x = " + x);
            // Первый метод
            {
                if (((x % 10) % 3) == 0 && x % 10 != 0) {
                    System.out.println("Последняя цифра делится на 3!");
                    System.out.println("Но это не точно");
                } else
                    System.out.println("Последняя цифра не делится на 3!");
            }
        }

        System.out.println("==========================================================");
        {// Определение знака и четности числа через двойное условие
            int v = (int) (Math.random() * 21 - 10);
            System.out.println("v = " + v);
            {
                if (v >= 0) {
                    System.out.println("Число положительное!");
                    {
                        if (v % 2 == 0)
                            System.out.println("Число четное!");
                    }
                } else
                    System.out.println("Число отрицательное!");
            }
        }

        System.out.println("==========================================================");
        {// Определение дня недели по номеру через лестницу IF
            int n = (int) (Math.random() * 10 + 1);
            if (n == 1) {
                System.out.println("Понедельник");
            } else if (n == 2) {
                System.out.println("Вторник");
            } else if (n == 3) {
                System.out.println("Среда");
            } else if (n == 4) {
                System.out.println("Четверг");
            } else if (n == 5) {
                System.out.println("Пятница");
            } else if (n == 6) {
                System.out.println("Суббота");
            } else if (n == 7) {
                System.out.println("Воскресенье");
            } else {
                System.out.println("Дня с таким номером не существует");
            }
        }

        System.out.println("==========================================================");
        {// Определение дня недели по номеру через SWITCH
            int n = (int) (Math.random() * 10 + 1);
            switch (n) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Дня с таким номером не существует");
            }
        }

        System.out.println("==========================================================");

        {// определение окончания числа на ноль через ТЕРНАРНЫЙ оператор
            int k = (int) (Math.random() * 100);
            String f = k % 10 == 0 ? "Заканчивается на ноль." : "Не заканчивается на ноль.";
            System.out.println("k=" + k + " " + f);
        }

        System.out.println("==========================================================");

        {// Задача на перекрытие кругом прямоугольника (а и b - стороны, r - радиус)
            int a = (int) (Math.random() * 10 + 1);
            int b = (int) (Math.random() * 10 + 1);
            int r = (int) (Math.random() * 10 + 1);
            System.out.println("a = " + a + "; " + "b = " + b + "; " + "r = " + r + "; " + "\n" + "Диаметр круга = " + 2 * r + "\n" + "Диагональ прямоугольника = " + ((Math.sqrt((a * a) + (b * b)))));
            if ((Math.sqrt((a * a) + (b * b))) > (2 * r))
                System.out.println("Круг не закроет прямоугольник");
            else
                System.out.println("Круг закроет прямоугольник");
        }

        System.out.println("==========================================================");
        {// подбор корней в слове рубль в зависимости от суммы
            int sum = (int) (Math.random() * 100);
            System.out.print(sum + " ");
            {
                if (sum % 10 == 1 || sum % 100 == 21) {
                    System.out.println("Рубль");
                } else if (sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4 || sum % 100 == 22 || sum % 100 == 23 || sum % 100 == 24) {
                    System.out.println("Рубля");
                } else System.out.println("Рублей");
            }
        }

        System.out.println("==========================================================");
        {//подсчет суммы чисел от 1 до 100 (факториал !100) с помощью цикла while
            int s = 0;
            int i = 1;
            while (i <= 100) {
                s = s + i;
                i++;
            }
            System.out.println("s= " + s);
        }

        {//подсчет суммы чисел от 1 до 100 (факториал !100) с помощью цикла do while
            int s = 0;
            int i = 1;
            do {
                s = s + i;
                i++;
            }
            while (i <= 100);
            System.out.println("s= " + s);
        }

        { //подсчет суммы чисел от 1 до 100 (факториал !100) с помощью цикла for
            int s = 0;
            for (int i = 1; i <= 100; i++) {
                s = s + i;
            }
            System.out.println("s= " + s);
        }

        System.out.println("==========================================================");
        {//вычисление среднеарифметического от суммы ряда случайных чисел, пока не будет получен случайным 0
            double sr;
            double sum = 0;
            int n = 0;
            int x = (int) (Math.random() * 20);
            while (x != 0) {
                sum += x;
                n++;
                x = (int) (Math.random() * 20);
            }
            if (n != 0) {
                sr = sum / n;
            } else
                sr = 0;
            System.out.println("среднее:" + sr);
        }

        System.out.println("==========================================================");
        {//вывести на экран первые десять целых чисел, которые делятся на 3 без остатка
            int n = 10;
            int k = 1;
            int i = 1;
            for (; k <= n; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                    k++;
                }
            }
            System.out.println();
        }

        System.out.println("==========================================================");
        {//вывести на экран сумму четных чисел из 10 случайных
            int s = 0;
            for (int i = 1; i <= 10; i++) {
                int x = (int) (Math.random() * 100);
                {
                    if (x % 2 == 0) {
                        s += x;
                        System.out.print(x + " ");
                    }

                }
            }
            System.out.println();
            System.out.println("Sum = " + s);
        }

        System.out.println("==========================================================");
        {//таблица умножения
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.print(i + " * " + j + " = " + i * j + "; ");
                }
                System.out.println(" ");
            }
        }

        System.out.println("==========================================================");
        {//треугольник из чисел
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j <= 10 - i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println(" ");
            }
        }

        System.out.println("==========================================================");
        {// 1\x в диапазоне [-2;2] с шагом 0,25 и пропуском continue для исключения деления на ноль(ошибка)
            double x;
            double y;
            for (x = -2; x <= 2; x += 0.25) {
                if (x == 0)
                    continue;
                y = 1 / x;
                System.out.println("x=" + x + " y=" + y);
            }
        }

        System.out.println("==========================================================");
        {// определить является ли заданное целое число простым(делится на 1 и на самого себя)
            int x = (int) (Math.random() * 100);
            int y = 0;
            System.out.print("x=" + x);
            for (int i = 1; i <= x; i++) //Цикл работает пока i меньше либо равен x
            {
                if (x % i == 0)              //Если остаток от деления x на i ноль, то +1 в счетчик
                    y += 1;
            }
            if (y != 2)            //Если n не равен 2, то проверяем еще на 0 и 1
            {
                if (x == 0 || x == 1)
                    System.out.println(" ==> Особое число");
                else
                    System.out.println(" ==> Число составное");
            } else
                System.out.println(" ==> Число простое");
        }

        System.out.println("==========================================================");
        {//суммирование всех цифр в числе
            int sum = 0;
            int x = (int) (Math.random() * 1000);
            System.out.print("x = " + x);
            for (; x != 0; )  //Цикл работает пока x не равен 0
            {
                int y = x % 10;
                sum += y;              //Остаток от деления на 10 прибавляется к сумме
                x /= 10;             //Исходное число уменьшается на разряд
            }
            System.out.println("; sum = " + sum);
        }

        System.out.println("==========================================================");
        {//Ряд Фибоначчи
            long n1 = 0;
            long n2 = 1;
            int k = 20; //количество членов ряда
            System.out.print(n1 + " " + n2);
            for (int i = 1; i <= k; i++) {
                long y = n1 + n2;
                n2 = n1;
                n1 = y;
                System.out.print(" " + y);
            }
            System.out.println();
        }

        System.out.println("==========================================================");
        { // Показать все простые числа на заданном промежутке
            for (int j = 1; j <= 100; j++)              //Задаем интервал поиска простого числа
            {
                for (int i = 2; i <= j; i++)       //Перебор делителей от 2 до самой переменной из интервала
                {
                    if (j % i == 0 && i != j)   //Если переменная поделилась без остатка не на саму переменную, то
                        break;                //цикл прекращается, проверяем новую переменную из интервала
                    if (i == j)                 //Если делитель принял значение переменной,то выводим ее
                        System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        System.out.println("==========================================================");
        {//Поиск в рандомном массиве с числом элементов sizeM, элементов со значением <5
            int sizeM = 10;
            int marks[] = new int[sizeM];
            for (int i = 0; i < marks.length; i++) {
                marks[i] = (int) (Math.random() * 10 + 1);
                System.out.print(marks[i]);
                if (marks[i] < 5)
                    System.out.println(" <<==Искомый элемент №" + i);
                else
                    System.out.println();
            }
        }

        System.out.println("==========================================================");
        {//Поиск в рандомном массиве с числом элементов sizeM, первого элемента равного val
            int sizeM = 7;
            int marks[] = new int[sizeM];
            int val = 5, num = -1;
            for (int i = 0; i < marks.length; i++)   //цикл создания элементов рандомного массива и сравнение их с val
            {
                marks[i] = (int) (Math.random() * 10 + 1);
                if (marks[i] == val)   // если элемент равен val то прекращение перебора и вывод номера соотв. элемента
                {
                    num = i;
                    break;
                }
            }
            if (num == -1)
                System.out.println("Элемент с таким значением не найден");   //если соотв. нет, num останется=-1
            else
                System.out.println("Номер элемента = " + num);
        }

        System.out.println("==========================================================");
        {//Перестановка местами элементов в массиве попарно 0и1, 2и3 и т.д.
            int sizeM = 6;
            int marks[] = new int[sizeM];
            for (int i = 0; i < marks.length; i++)   //Цикл создания элементов рандомного массива длиной sizeM и его вывод
            {
                marks[i] = (int) (Math.random() * 10);
                System.out.print(marks[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < marks.length - 1; i = i + 2)   //Цикл замены местами [i] на [i+1] элемент попарно через переменную t
            {
                int t = marks[i];
                marks[i] = marks[i + 1];
                marks[i + 1] = t;
            }
            for (int i : marks)   //Цикл вывода получившегося нового массива
                System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("==========================================================");
        {//Переворот задом-наперед заданного массива
            int lgt = 6;
            int m[] = new int[lgt];
            for (int i = 0; i < m.length; i++)   //цикл задания значений и вывода рандомного массива
            {
                m[i] = (int) (Math.random() * 10);
                System.out.print(m[i] + " ");
            }
            System.out.println();   //Enter
            for (int i = 0; i < m.length / 2; i++)   //цикл выбора из массива значений до середины
            {
                int t = m[i];
                int j = m.length - 1 - i;   //m[j] является "зеркальным" элементом m[i]
                m[i] = m[j];            //замена их местами с помощью переменной t
                m[j] = t;
            }
            for (int i : m)   //цикл вывода конечного массива
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println("==========================================================");
        {//определение суммы элементов массива между Max и Min
            int lngt = 10;
            int m[] = new int[lngt];
            for (int i = 0; i < m.length; i++)   //цикл задания значений и вывода рандомного массива
            {
                m[i] = (int) (Math.random() * 100);
                System.out.print(m[i] + " ");
            }
            System.out.println();   //Enter
            int mMax = 0;
            int iMax = -1;
            for (int i = 0; i < m.length; i++)   //цикл поиска Max значения в массиве и его номера
            {
                if (m[i] > mMax) {
                    mMax = m[i];
                    iMax = i;
                }
            }
            int mMin = mMax;
            int iMin = -1;
            for (int i = 0; i < m.length; i++)   //цикл поиска Min значения в массиве и его номера
            {
                if (m[i] < mMin) {
                    mMin = m[i];
                    iMin = i;
                }
            }
            System.out.println("Max = " + mMax + "; i = " + iMax);   //вывод Max значения в массиве и его номера
            System.out.println("Min = " + mMin + "; i = " + iMin);   //вывод Min значения в массиве и его номера
            int summ = 0;
            if (iMax > iMin)   //Сравнение номеров min и max для нахождения зоны элементов для суммирования
            {
                for (int i = iMin + 1; i < iMax; i++)   //суммирование элементов от min до max
                    summ += m[i];
            } else {
                for (int i = iMax + 1; i < iMin; i++)   //суммирование элементов от max до min
                    summ += m[i];
            }
            System.out.println("Сумма = " + summ);
        }

        System.out.println("==========================================================");
        {//нахождение всех чисел в строке и их распечатка
        String s = "x=12 y=15 z=256";
        String sn = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sn += s.charAt(i);
            } else {
                if (!sn.equals("")) {
                    System.out.println(sn);
                    sn = "";
                }
            }
        }
        if (!sn.equals(""))
            System.out.println(sn);
        }

        System.out.println("==========================================================");
        {//есть ли в строке 5 одинаковых знаков подряд
            String s = "TEST aaa 11111 String";
            int n = 0;
            for (int i = 1; i < s.length(); i++)
            {
                if (s.charAt(i) == s.charAt(i-1))
                    n++;
                else
                    n=0;
                if(n>=4)
                    break;
            }
            if(n>=4)
                System.out.println("Есть 5 одинаковых знаков подряд");
            else
                System.out.println("Нет 5 одинаковых знаков подряд");
        }

        System.out.println("==========================================================");
        {//посчитать общее количество знаков препинания в строке
            String s = "TEST, !aaa? ,1.11.?11: ;St-ring";
            int n = 0;
            for (int i = 1; i < s.length(); i++)
            {
                if (s.charAt(i) == '.'||s.charAt(i) == ','||s.charAt(i) == ':'||s.charAt(i) == ';'||s.charAt(i) == '!'||
                        s.charAt(i) == '?'||s.charAt(i) == '-'||s.charAt(i) == ' '||s.charAt(i) == '('||s.charAt(i) == ')')
                    n++;
            }
            System.out.println("Число знаков препинания = "+n);
        }

        System.out.println("==========================================================");
        {//посчитать количество слов в строке
            String s = "TEST or not test - is a question";
            int n = 0;   //переменная индикатора символа в предыдущем цикле, кроме знаков препинания
            int k = 0;   //переменная счетчика слов
            for (int i = 1; i < s.length(); i++)  //цикл перебора символов в строке
            {
                if (s.charAt(i) == '.'||s.charAt(i) == ','||s.charAt(i) == ':'||s.charAt(i) == ';'||s.charAt(i) == '!'||   //если символ знак препинания
                        s.charAt(i) == '?'||s.charAt(i) == '-'||s.charAt(i) == ' '||s.charAt(i) == '('||s.charAt(i) == ')')
                {
                    if(n!=0) //а так же счетчик знаков не равен нулю, то +1 слово в счетчик слов и обнуляем индикатор знаков
                        k++;
                    n=0;
                }
                else   //иначе индикатор знаков =1
                    {
                    n=1;
                    if(n!=0 && i==s.length()-1) // условие на проверку последнего знака в строке, на случай если последним будет символ слова
                        k++;
                    }
            }
            System.out.println("В предложении "+k+" слов =)");
        }

        System.out.println("==========================================================");
        {//посчитать количество слов в строке через класс WordsCount
            String s = "В стране Ксанад благословенной\n" +
                       "Дворец построил Кубла Хан,\n" +
                       "Где Альф бежит, поток священный,\n" +
                       "Сквозь мглу пещер гигантских, пенный.\n" +
                       "Впадает в сонный океан.";
            String s1 = "Мама мыла раму";
            WordsCount WC1=new WordsCount();//Создаем обьект, счетчик слов WC1
            WC1.WordsCnt(s);//даем команду счетчику WC1 использовать метод WordsCnt
            WC1.WordsCnt(s1);
        }

        System.out.println("==========================================================");
        // Управление классом Dog
        {
            Dog d1 = new Dog(); //Создаем обьект класса Dog с названием d1
            d1.setName("Чаппи"); //Задаем аргумент name
            d1.setSize(10);   //Задаем аргумент size
            Dog d2 = new Dog();
            d2.setName("Плутто");
            d2.setSize(30);
            Dog d3 = new Dog();
            d3.setName("Скуби-Ду");
            d3.setSize(50);
            d1.bark(5); //Даем команду объекту d1 использовать метод bark
            d2.bark(3);
            d3.bark(2);
        }

        System.out.println("==========================================================");
        // вычисление общего времени работы программы - конец
        long tEnd = System.currentTimeMillis();
        System.out.println("Время выполнения = "+(tEnd-tBegin)+" мс");

        // прощание
        System.out.println("Good bye, boss");
    }
}