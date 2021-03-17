package designpatten.composite;

import java.util.List;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public interface Node {

    //添加一个节点为子节点
    Node addNode(Node node);

    //获取子节点
    List<Node> children();

    //输出为html

    String toXml();
}
