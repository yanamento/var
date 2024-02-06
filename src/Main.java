public class Main {
    public static void main(String[] args) {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog = dog - 3.5;
        cat = cat + - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var totalWeight = boxerFirst + boxerSecond;
        System.out.println (totalWeight);
        var differenceWeight = boxerSecond - boxerFirst;
        System.out.println (differenceWeight);
        var remains = boxerSecond % boxerFirst;
        System.out.println (remains);

        var allWorkHours = 640;
        var hoursForOne = 8;
        var collegs = allWorkHours / hoursForOne;
        System.out.println ("Всего работников в компании — " + collegs + " человек");
        var ifCollegs = 94;
        var ifHoursForOne = allWorkHours / ifCollegs;
        System.out.println ("Если в компании работает " + ifCollegs + " человек, то всего " + ifHoursForOne + " часов работы может быть поделено между сотрудниками");
    }
}