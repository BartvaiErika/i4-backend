package week4programming.excersise8week4;

import java.util.Objects;

public class Box {
    private String content;

    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(content, box.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
