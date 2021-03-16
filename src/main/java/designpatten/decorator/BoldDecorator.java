package designpatten.decorator;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class BoldDecorator extends NodeDecorator {

    public BoldDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public String getText() {
        return "<b>" + textNode.getText() + "</b>";
    }
}
