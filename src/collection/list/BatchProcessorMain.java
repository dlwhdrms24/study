package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        //결정을 나중으로 미루는거 list 의존관계 주입 추상화된거에 의존한거 클라이언트 코드변경없이 객체지향
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
