public class testCompartment {
    public static void main(String[] args) {
        Luggage lugg = new Luggage();

        int[] compartments = new int[10];
        for (int i = 0; i < compartments.length; i++) {
            int num = (int)(Math.random()*4)+1;

            switch (num) {
                case 1:
                    compartments[i] = new Firstclass();
                    break;
                    case 2:
                        compartments[i]= new general();
                        break;
                        case 3:
                            compartments[i]=new Ladiesclass();
                            break;
                            case 4:
                                compartments[i]=new Luggage();
            }
            System.out.println("Railway Compartments: ");

            for (int j = 0; j < compartments.length; j++) {
                System.out.println("Compartment " + (i + 1) + ": "
                        + compartments[i].notice());
            }
        }
    }
}