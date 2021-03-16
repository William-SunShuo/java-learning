package designpatten.decorator;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class SpanTextNode implements TextNode{

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
