public final class Cuckoo extends Bird {
    @Override
    public void sing(){
        for(int i=0; i < Math.random() * ((10 - 1) + 1) + 1; i++){
            System.out.println("ку-ку");
        }
    }
}
