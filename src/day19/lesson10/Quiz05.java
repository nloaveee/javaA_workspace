package day19.lesson10;

import java.util.*;

public class Quiz05 {
    // 리스트는 순회 o, map은 순회 x
    public static void main(String[] args) {
        Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("닉네임", "마롭");
        myCharacter.put("직업", "마법사");
        myCharacter.put("서버", "B");
        myCharacter.put("레벨", "38");

        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
        List<Map<String, String>> charaters = new ArrayList<>();

        Map<String, String> character1 = new HashMap<>();
        character1.put("닉네임", "사자고양이");
        character1.put("직업", "전사");
        character1.put("서버", "A");
        character1.put("레벨", "11");
        charaters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("닉네임", "하구루");
        character2.put("직업", "마법사");
        character2.put("서버", "B");
        character2.put("레벨", "46");
        charaters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("닉네임", "바다");
        character3.put("직업", "힐러");
        character3.put("서버", "B");
        character3.put("레벨", "23");
        charaters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("닉네임", "초보");
        character4.put("직업", "힐러");
        character4.put("서버", "A");
        character4.put("레벨", "4");
        charaters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("닉네임", "토르");
        character5.put("직업", "힐러");
        character5.put("서버", "B");
        character5.put("레벨", "84");
        charaters.add(character5);

        // charaters는 list


        //for문 사용
        for (int i = 0; i < charaters.size(); i++) {
            if (charaters.get(i).get("직업").equals("힐러") && charaters.get(i).get("서버").equals("B")) {
                System.out.println(charaters.get(i));

            }

        }




//        Iterator<Map<String, String>> iter = charaters.iterator();
//        while (iter.hasNext()){
//            Map<String, String> key = iter.next();
//            if(charaters.get(key))
//        }


    }
}
