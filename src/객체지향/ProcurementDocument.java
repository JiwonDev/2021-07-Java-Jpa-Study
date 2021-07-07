package 객체지향;

/**
 * @author JiwonDev
 */
public class ProcurementDocument {
    public int procureRequestDocumentaryQuantity;
    public int orderRequestDocumentaryQuantity;
    public int orderDocumentaryQuantity;
    public int contractDocumentQuantity;
    public int estimateDocumentaryQuantity;

    public int totalDocumentaryQuantityDailyMake() {
        int totalDocument = procureRequestDocumentaryQuantity
                + orderDocumentaryQuantity
                + contractDocumentQuantity
                + orderRequestDocumentaryQuantity
                + estimateDocumentaryQuantity;
        return totalDocument;
    }

}
