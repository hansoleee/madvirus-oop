public class ContainerMain {

    public static void main(String[] args) {

        Luggage size1Luggage = new Luggage(1);
        Luggage size2Luggage = new Luggage(2);
        Luggage size3Luggage = new Luggage(3);

        // 올바른 사용법
        Container c = new Container(5);
        if (c.canContain(size3Luggage)) { // container의 가능한 적재량이 5->2가 된다.
            c.put(size3Luggage);
        }

        if (c.canContain(size2Luggage)) { // container의 가능한 적재량이 줄지 않게된다.
            c.add(size2Luggage);
        }

        if (c.canContain(size1Luggage)) { // 통과됨! 정상동작했다면 통과하면 안된다.
            c.add(size1Luggage);
        }

    }
}
