package SupplyChainManagement;

class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() >= 50000 && request.getAmount() < 100000) {
            System.out.println("副董事长 " + name + " 审批了金额为 " + request.getAmount() +
                    " 元的采购请求，用途：" + request.getPurpose());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}