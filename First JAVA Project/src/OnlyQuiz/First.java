package OnlyQuiz;
class First {

    int i;

}

class Second extends First {

    int j;

    void display() {

        super.i = j + 1;

        System.out.println(j + " " + i);

    }

}    




