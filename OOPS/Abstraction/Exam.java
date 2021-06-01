class Exam {
    public static void main(String[] args) {
        Bike b = new Bike(10);

    }

}

class Bike {
    int data;

    Bike(int val) {
        this.data = val;

    }

    final void printData() {
        System.out.println(data + 1);
    }

    void incrementData() {
        data = data + 10;
        System.out.println(data);
    }

}

class HighBike extends Bike {

    @Override
    void incrementData() {
        // TODO Auto-generated method stub
        super.incrementData();
    }

}
