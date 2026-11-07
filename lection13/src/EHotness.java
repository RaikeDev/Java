enum EHotness extends Enum{
    NOT(1,5),HOT(6,1000),VERY_HOT(1001,Integer.MAX_VALUE);

    private int minScovel;
    private int maxScovel;

    private EHotness(int minScovel, int maxScovel){
        this.minScovel = minScovel;
        this.maxScovel = maxScovel;
    }

    public int getMinScovel(){
        return minScovel;
    }

    public int getMaxScovel(){
        return maxScovel;
    }
}