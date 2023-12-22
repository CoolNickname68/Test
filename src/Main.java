



public class Main {

    public static void main(String[] args) {
        // task 1
        System.out.println("Task: 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("value dog: " + dog);
        System.out.println("value cat: " + cat);
        System.out.println("value paper: " + paper);
        // task 2
        System.out.println("Task: 2\nValue dog: ");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\nValue cat: ");
        System.out.println(cat + "\nValue paper: ");
        System.out.println(paper);
        // task 3
        System.out.println("Task: 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Value dog: " + dog);
        System.out.println("Value cat: " + cat);
        System.out.println("Value paper: " + paper);
        // task 4
        System.out.println("Task: 4");
        var friend = 19;
        System.out.println("Value friend: " + friend);
        friend = friend + 2;
        System.out.println("Value friend increase 2" + friend);
        friend = friend / 7;
        System.out.println("Value friend after dividing by 7: " + friend);
        // task 5
        var frog = 3.5;
        System.out.println("Task: 5");
        System.out.println("Variable frog = " + frog);
        frog = frog * 10;
        System.out.println("Variable frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Variable frog = " + frog);
        frog = frog + 4;
        System.out.println("Variable frog = " + frog);
        // Task 6
        System.out.println("Task: 6");
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        System.out.println("figher weight 1:" + fighterWeight1);
        System.out.println("figher weight 2:" + fighterWeight2);
        var totalWeight = fighterWeight1 + fighterWeight2;
        System.out.println("total weiht: " + totalWeight);
        var difference = fighterWeight2 - fighterWeight1;
        System.out.println("difference: " + difference);
        // Task 7
        System.out.println("Task 7");
        var difference2 = fighterWeight2 - fighterWeight1;
        System.out.println("difference2 : " + difference2);
        var difference3 = fighterWeight2 % fighterWeight1;
        System.out.println("difference3 : " + difference3);
        // Task 8
        System.out.println("Task 8");
        var hours = 640;
        var timeForOneWorker = 8;
        var numberOfWorkers = hours / timeForOneWorker;
        System.out.println("Всего работников в компании — " + numberOfWorkers + " человек");
        var newNumberOfWorkers = numberOfWorkers + 94;
        var WorkerTime = hours / newNumberOfWorkers;
        System.out.println("Если в компании работает " + newNumberOfWorkers + " человек, то всего " + WorkerTime + " часа работы может быть поделено между сотрудниками");

    }
}