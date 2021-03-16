package designpatten.decorator;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class ItalicDecorator extends NodeDecorator {


    public ItalicDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public String getText() {
        return "<i>" + textNode.getText() + "</i>";
    }
}
