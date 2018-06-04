class First extends Thread {

    Thread t;
    String name;
    First (String name) {
        this.name = name;
    }
    public void run () {
        try {
            System.out.println("The FIRST --- Thread began");
            Thread.sleep(5000);
            System.out.println("The FIRST --- Thread ended");
        }
        catch(InterruptedException e) {
        }
    }
    public void start () {
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }
}