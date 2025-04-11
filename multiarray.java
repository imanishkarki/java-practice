class example{
    static int a=20;
    
    void func(){
    a=7;
    System.out.println(a);
    }
}

class multiarray{
    public static void main (String[] srgs){
        example obj = new example();
        obj.func();
    }
}