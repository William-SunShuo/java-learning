package designpatten.resposibilitychain;

/**
 * Created by shuo.sun on 2021/3/21.
 */
public class TestChain {

    public static void main(String[] args) {
        OrcKing orcKing = new OrcKing();
        orcKing.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle")); // Orc commander handling request "defend castle"
        orcKing.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner")); // Orc officer handling request "torture prisoner"
        orcKing.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax")); // Orc soldier handling request "collect tax"
    }
}
