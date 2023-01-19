package day3;

class ThreadExample extends Thread {
	
    private String symbol;

    public ThreadExample(String symbol) {
        this.symbol = symbol;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(symbol);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
