use library;
ALTER TABLE BOOK AUTO_INCREMENT=6;

DROP TABLE IF EXISTS author ;
DROP TABLE IF EXISTS book;

CREATE TABLE author
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(45),
    surname VARCHAR(45)
);
CREATE TABLE book
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(100),
    author_id INT(11)
);

INSERT INTO Author (name, surname) VALUES (N'Стивен', N'Прата'), (N'Джесс', N'Либерти'), (N'Эндрю', N'Кровчик'), (N'Винод', N'Кумар'), (N'Номан', N'Лагари'),(N'Аджит', N'Мунгале'), (N'Кристиан', N'Нагел'), (N'Тим', N'Паркер'), (N'Шриниваса', N'Шивакумар'), (N'Джеффри', N'Рихтер'), (N'Кристоф', N'Назар');
INSERT INTO Book (name, author_id) VALUES (N'Язык программирования С++. Лекции и упражнения', 1), (N'С++ за 24 часа', 2), (N'.NET. Сетевое программирование для профессионалов', 3), (N'CLR via C#. Программирование на платформе Microsoft .NET Framework 2.0 на языке С#',10), (N'Windows via C/C++. Программирование на языке Visual С++', 11), (N'Windows для профессионалов', 10);

SELECT * FROM Author;
SELECT * FROM Book;
