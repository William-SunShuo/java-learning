package designpatten.resposibilitychain;

public class OrcKing {

    Handler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new CommanderHandler(new OfficerHandler(new SoldierHandler(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }
}