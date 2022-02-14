package part1;

public class CosDecomposition {

    private Integer fact(Integer x){
        int fc = 1;
        for (int i = 0; i <= x; i++){
            fc *= i;
        }
        return fc;
    }

    public Double customCos(Integer x) {
        return Math.pow(-1, x - 1);
    }

}
