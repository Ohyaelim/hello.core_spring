package hello.core.singleton;

public class StatefulService {
    //무상태로 변환 가즈아

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        return price;
    }

}
