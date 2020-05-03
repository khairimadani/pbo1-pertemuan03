package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {
            case 'A':
                System.out.println("Pembeli               : \"samsung dmn mba\"");
                System.out.println("Mba Sales Oppo cntip  : \"gak beli oppo aja mas?\"");
            case 'B':
                System.out.println("Pembeli               : \"oppo A51 nya mba?\"");
                System.out.println("Mba Sales Oppo cntip  : \"mas jgn ngambil jobdesk saya deh\"");
            case 'C':
                System.out.println("Pembeli               : \"mba cntip\"");
                System.out.println("Mba Sales Oppo cntip  : \"apalagi lu!!\"");
                System.out.println("Pembeli               : \"knp ga tdur mba cntip\"");
            default:
                System.out.println("Pembeli               : \"mba ak gamau beli oppo, (｀Д´)\"");
                System.out.println("Mba Sales Oppo cntip  : \"yasudah\"");
                System.out.println("Pembeli               : \"ysdh\"");
                System.out.println("Mba Sales Oppo cntip  : \"(｀Д´)\"");
        }
    }
}