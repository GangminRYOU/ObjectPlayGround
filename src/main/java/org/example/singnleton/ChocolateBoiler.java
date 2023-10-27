package org.example.singnleton;

/**
 * 만약 한 애플리케이션 내에서 두개의 인스턴스가 생성되면 어떤 인스턴스가
 * 비어있는 인스턴스인지, 작업이 끝난 인스턴스인지 등등이 분명하지 않은 문제가 생긴다.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getChocolateBoiler(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
