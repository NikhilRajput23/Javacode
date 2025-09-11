public class infiniteloop{
    public static void main(String[] args) {
        callMe();
    }

    static void callMe() {
        callMe();  // थांबत नाही → Infinite recursion
    }
}

