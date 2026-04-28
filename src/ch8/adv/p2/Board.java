package ch8.adv.p2;

import lombok.Data;

@Data
public class Board {
    private int subject;
    private int content;
    private int writer;

    public Board(int content, int subject, int writer) {
        this.content = content;
        this.subject = subject;
        this.writer = writer;
    }

    public int getContent() {
        return content;
    }

    public int getSubject() {
        return subject;
    }

    public int getWriter() {
        return writer;
    }
}
