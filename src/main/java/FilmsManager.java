
public class FilmsManager {
    private String[] films = new String[0];              // Массив с фильмами
    private int limit;

    public FilmsManager() {
        this.limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {                   //Добавление фильма в массив
        String[] tmp = new String[films.length + 1];      // Создаем временный массив с длинной +1
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];                            // В каждый номер массива tmp передаем значение того же номера массива films
        }
        tmp[tmp.length - 1] = film;                       // Присваиваем переданный параметр в массив tmp и уменьшаем на 1, т.к он больше на 1
        films = tmp;                                       // Присваиваем значения из массива tmp в массив films
    }

    public String[] findAll() {
        return films;                                       // Возвращаем все фильмы имеющиеся в массиве films
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }


}
