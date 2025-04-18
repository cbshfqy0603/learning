package SupplyChainManagement;

class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() >= 100000 && request.getAmount() < 500000) {
            System.out.println("董事长 " + name + " 审批了金额为 " + request.getAmount() +
                    " 元的采购请求，用途：" + request.getPurpose());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
