public class catCalculation {

    public static void main(String[] args) {

        int c,a,t;
        int cat, calculation;

        for(c=1; c<10; c++){
            for(a=0; a<10; a++){
                for(t=0; t<10; t++){
                    cat = 100*c + 10*a + t;
                    calculation = (c + a + t)* c * a * t;
                    if(cat==calculation){
                        System.out.println("C:" + c + " A:" + a + " T:" + t);
                    }
                }
            }
        }
    }
}
