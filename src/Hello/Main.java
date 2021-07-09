package Hello;

import OOC.ProcureItemVO;

public class Main {
    public static void main(String[] args) {
        ProcureItemVO procureItemVO = new ProcureItemVO();
        System.out.println(procureItemVO);

        procureItemVO.setId(1);
        procureItemVO.setName("옥수수");
        procureItemVO.setPrice(10000);
        procureItemVO.setQuantity(2);

        System.out.println(procureItemVO.getName() + " VO:: " + procureItemVO);

    }
}
