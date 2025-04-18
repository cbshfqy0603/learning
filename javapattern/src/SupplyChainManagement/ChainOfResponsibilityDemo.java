package SupplyChainManagement;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // 创建职责链中的审批者
        Approver director = new Director("张主任");
        Approver vicePresident = new VicePresident("李副董");
        Approver president = new President("王董事长");
        Approver board = new Board("公司董事会");
        // 设置职责链顺序
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(board);
        // 创建测试用例
        PurchaseRequest request1 = new PurchaseRequest(30000, "购买办公用品");
        PurchaseRequest request2 = new PurchaseRequest(80000, "采购生产设备");
        PurchaseRequest request3 = new PurchaseRequest(150000, "扩展生产线");
        PurchaseRequest request4 = new PurchaseRequest(600000, "新建工厂");
        // 提交请求并测试
        System.out.println("测试请求 1：");
        director.processRequest(request1);
        System.out.println("\n测试请求 2：");
        director.processRequest(request2);
        System.out.println("\n测试请求 3：");
        director.processRequest(request3);
        System.out.println("\n测试请求 4：");
        director.processRequest(request4);
    }
}