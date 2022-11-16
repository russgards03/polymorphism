public class Main {
    public static void main(String[] args) {

class Human {
    public void action() {
        System.out.println("Human Actions");
    }
}

class Run extends Human {
    public void action() {
        System.out.println("Human is running");
    }
}

class Walk extends Human {
    public void action() {
        System.out.println("Human is walking");
    }
}

class Swim extends Human {
    public void action() {
        System.out.println("Human is swimming");
    }
}
        Run a = new Run();
        Walk b = new Walk();
        Swim c = new Swim();

        a.action();
        b.action();
        c.action();
    }
}
