package designpatten.decorator;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class TestDecorator {
    public static void main(String[] args) {
        SpanTextNode spanTextNode = new SpanTextNode();
        spanTextNode.setText("hello");
        TextNode italicDecorator = new ItalicDecorator(spanTextNode);
        System.out.println(italicDecorator.getText());
        TextNode boldDecorator = new BoldDecorator(italicDecorator);
        System.out.println(boldDecorator.getText());
    }
}
