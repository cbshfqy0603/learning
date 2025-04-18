package SupplyChainManagement;

class Board extends Approver {
    public Board(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() >= 500000) {
            System.out.println("董事会 " + name + " 审批了金额为 " +
                    request.getAmount() + " 元的采购请求，用途：" + request.getPurpose());
        } else {
            System.out.println("金额 " + request.getAmount() + " 元无需董事会审批，已由前级处理。");
        }
    }
}
