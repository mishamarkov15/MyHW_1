package laba_4_1_exc_5;

public class Main {
    public static void main(String[] args) {
        Reader[] data = new Reader[3];
        data[0] = new Reader("Петров В.В.", "ПВВ207", "РК6", "15.10.2003", "8 (999) 123-98-98");
        data[1] = new Reader("Иванова А.А.", "ИАА217", "ИУ7", "12.9.2002", "8 (981) 999-96-98");
        data[2] = new Reader("Сидоров С.С.", "ССС227", "ИБМ7", "1.12.2003", "8 (154) 153-11-11");

        data[0].takeBook(3);
        data[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        data[2].takeBook(new Book("Приключения", "А. С. Пушкин"), new Book("Отверженные", "В. Гюго"), new Book("Война и мир", "Л. Н. Толстой"));

        data[0].returnBook(3);
        data[1].returnBook("Приключения", "Словарь", "Энциклопедия");
        data[2].returnBook(new Book("Приключения", "А. С. Пушкин"), new Book("Отверженные", "В. Гюго"), new Book("Война и мир", "Л. Н. Толстой"));
    }
}
