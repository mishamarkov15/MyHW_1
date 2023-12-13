package laba_4_1_exc_5;

public class Reader {
    String FIO;
    String reader_ticket;
    String faculty;
    String birth_date;
    String phone_number;

    public Reader() {}

    public Reader(String FIO, String reader_ticket, String faculty, String birth_date, String phone_number) {
        this.FIO = FIO;
        this.reader_ticket = reader_ticket;
        this.faculty = faculty;
        this.birth_date = birth_date;
        this.phone_number = phone_number;
    }

    public void takeBook(int books_count) {
        int last_digit = books_count % 10;
        if (books_count >= 5 && books_count <= 20) {
            System.out.println(FIO + " взял " + books_count + " книг.");
        } else if (books_count == 1) {
            System.out.println(FIO + " взял " + books_count + " книгу.");
        } else if (last_digit == 2 || last_digit == 3 || last_digit == 4) {
            System.out.println(FIO + " взял " + books_count + " книги.");
        } else {
            System.out.println(FIO + " взял " + books_count + " книг.");
        }
    }

    public void takeBook(String... books_title) {
        System.out.print(FIO + "  взял книги: ");
        for (String title : books_title) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        String[] titles = new String[books.length];
        for (int i = 0; i < books.length; ++i) {
            titles[i] = books[i].title;
        }
        takeBook(titles);
    }

    public void returnBook(int books_count) {
        int last_digit = books_count % 10;
        if (books_count >= 5 && books_count <= 20) {
            System.out.println(FIO + " вернул " + books_count + " книг.");
        } else if (books_count == 1) {
            System.out.println(FIO + " вернул " + books_count + " книгу.");
        } else if (last_digit == 2 || last_digit == 3 || last_digit == 4) {
            System.out.println(FIO + " вернул " + books_count + " книги.");
        } else {
            System.out.println(FIO + " вернул " + books_count + " книг.");
        }
    }

    public void returnBook(String... books_title) {
        System.out.print(FIO + "  вернул книги: ");
        for (String title : books_title) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        String[] titles = new String[books.length];
        for (int i = 0; i < books.length; ++i) {
            titles[i] = books[i].title;
        }
        takeBook(titles);
    }
}
