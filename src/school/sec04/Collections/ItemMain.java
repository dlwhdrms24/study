package school.sec04.Collections;

import java.util.*;

public class ItemMain {
    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>(Arrays.asList(
                new Item("사과", 1000),
                new Item("바나나", 2500),
                new Item("사과", 1000),
                new Item("포도", 4000),
                new Item("바나나", 2500),
                new Item("사과", 1000)
        ));
        System.out.println("--- [원본 장바구니] ---");
        System.out.println(cart);
        System.out.println();

        // 3. (목표 1: HashSet) 장바구니 물품 종류 수
        System.out.println("--- [목표 1: HashSet] ---");
        // TODO: cart를 이용해 HashSet을 만들고, size()를 출력하세요.
        Set<Item> uniqueItems = new HashSet<>(cart);
        System.out.println("총 물품 종류: " + uniqueItems.size() + "가지");
        System.out.println();


        // 4. (목표 2: HashMap) 물품별 개수 세기
        System.out.println("--- [목표 2: HashMap] ---");
        Map<Item, Integer> itemCounts = new HashMap<>();
        // TODO: cart를 순회하면서 itemCounts 맵에 (아이템, 개수)를 저장하세요.
        //    (힌트: getOrDefault() 메서드를 사용하면 편리합니다.)
        for (Item item : cart) {
            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        }
        System.out.println(itemCounts);
        System.out.println();


        // 5. (목표 3: TreeSet) 물품 이름 가나다순 출력
        System.out.println("--- [목표 3: TreeSet] ---");
        // TODO: cart에서 이름(String)만 뽑아서 TreeSet에 저장하고 출력하세요.
        Set<String> itemNames = new TreeSet<>();
        for (Item item : cart) {
            itemNames.add(item.name);
        }
        System.out.println(itemNames);
        System.out.println();


        // 6. (목표 4: Collections 유틸리티)
        System.out.println("--- [목표 4: Collections] ---");
        // TODO: cart에서 이름(String)만 뽑아서 'ArrayList'를 만드세요.
        List<String> nameList = new ArrayList<>();
        for (Item item : cart) {
            nameList.add(item.name);
        }

        // TODO: nameList를 '내림차순(가나다 역순)'으로 정렬하세요.
        Collections.sort(nameList, Collections.reverseOrder());
        System.out.println("내림차순 정렬: " + nameList);

        // TODO: 정렬된 nameList에서 "바나나"를 '이진 탐색'으로 찾으세요.
        int index = Collections.binarySearch(nameList, "바나나", Collections.reverseOrder());
        System.out.println("'바나나'의 인덱스: " + index);
    }
}
