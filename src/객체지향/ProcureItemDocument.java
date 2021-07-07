package 객체지향;

/**
 * @author JiwonDev
 */
public class ProcureItemDocument {
    public int id;
    public String procureItemName;
    public String procureItemUnitName;
    public int procureItemQuantity;
    public int procureItemPrice;

    public int addProcureItemQtyPrice() {
        int result = 0;
        result = procureItemQuantity * procureItemPrice;
        return result;
    }

    public void showEachVariableValue() {
        System.out.println("id:::" + id);
        System.out.println("procureItemPrice :::" + procureItemPrice);
        System.out.println("procureItemUnitName :::" + procureItemUnitName);
        System.out.println("procureItemQuantity :::" + procureItemQuantity);
        System.out.println("procureItemName :::" + procureItemName);
    }

    public String concatStringValues() {
        String returnValue = "";
        returnValue = "안녕하세요." + " 구매문서품목 클래스입니다.";
        return returnValue;
    }

}
