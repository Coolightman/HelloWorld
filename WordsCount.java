public class WordsCount {
    private int n = 0;   //переменная индикатора символа в предыдущем цикле, кроме знаков препинания
    private int k = 0;   //переменная счетчика слов
    void WordsCnt(String s)
    {
        for (int i = 1; i < s.length(); i++)  //цикл перебора символов в строке
        {
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == ':' || s.charAt(i) == ';' || s.charAt(i) == '!' ||   //если символ знак препинания или пробел
                    s.charAt(i) == '?' || s.charAt(i) == '-' || s.charAt(i) == ' ' || s.charAt(i) == '(' || s.charAt(i) == ')'|| s.charAt(i) == '\n') {
                if (n != 0) //а так же счетчик знаков не равен нулю, то +1 слово в счетчик слов и обнуляем индикатор знаков
                    k++;
                n = 0;
            } else   //иначе индикатор знаков =1
            {
                n = 1;
                if (n != 0 && i == s.length() - 1) // условие на проверку последнего знака в строке, на случай если последним будет символ слова
                    k++;
            }
        }
        System.out.println("В предложении " + k + " слов =)");
        k = 0;
    }
}
