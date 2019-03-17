public class PhraseGenerator {
    public static void main(String[] args) {
        //Create three words sets for checking. Add own words.
        String[] wordListOne = {"круглосуточный ", "тройной ", "трех-звенный ", "3000-футовый ", "взаимный ", " фронтэнд ", "бэкэнд ", "проникающий ", "умный ", "динамичный ", "метод критического пути "};

        String[] wordListTwo = {"уполномоченный ", "трудный ", "чистый продукт ", "центральный ", "фирменный ", "нестандартный ум ", "сфокуссированнный ", "общий ", "выровненный ", "ускоренный ", "использованный с выгодой ", "совместный "};

        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "талант", "подход", "уровень взаимного понимания", "образец", "портал"};

        //Counting words in lists

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + wordListTwo[rand2] + wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase + ".");
//        System.out.println(oneLenght);
//        System.out.println(twoLenght);
//        System.out.println(threeLenght);


    }


}


